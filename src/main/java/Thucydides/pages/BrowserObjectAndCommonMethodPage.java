package Thucydides.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * Created by nikais on 3/16/2018.
 */

public class BrowserObjectAndCommonMethodPage extends PageObject {

    public void openURL(String url) {

        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    public void deleteAllCookies() {
        getDriver().manage().deleteAllCookies();
        getDriver().close();
    }

    public void closeDriver() {
        getDriver().close();
    }
    
    public void PVL(String MainParam, String Path) throws Exception {
    	WebElement ClickValue = find(By.xpath(Path));
    	ClickValue.click();
		Thread.sleep(5000);

		// Step1: 通过CSS选择器选出"span"标签的所有元素并存到一个list里.
		ArrayList<String> AllList = new ArrayList<String>();
		List<WebElementFacade> allSpans = findAll(org.openqa.selenium.By.cssSelector("span"));
		for (WebElementFacade spans : allSpans) {
			System.out.println("----→" + spans.getAttribute("textContent") + "←----");
			AllList.add(spans.getAttribute("textContent"));
		}

		System.out.println("################# " + AllList.toArray().length + " #################");
		
		 //Step2: 判断用户的输入是不是在当前下拉列表的值的数组里,如果在,就填入这个位置中并且输入回车键确认
		 if(AllList.contains(MainParam)) {
			 ClickValue.sendKeys(MainParam);
			 Thread.sleep(1500);
			 ClickValue.sendKeys(Keys.ENTER);
			 System.out.println("$$$$$$$$$$$$$$$ " + "For this time of testing, " + "【" + MainParam + "】" + "has been selected." + " $$$$$$$$$$$$$$$");
		 }else {
			 System.out.println("The current value: " + MainParam + " does not existed!"+ ".");
			 getDriver().close();
			 System.exit(0);
		}
		 System.out.println();
		 Thread.sleep(1000);
    }

}
