package Thucydides.pages;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class DownloadCSVfilePage extends PageObject {

	public void login(String username, String password) {

		WebElement usernameInput = find(By.id("username"));
		WebElement passwordInput = find(By.id("password"));
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);

	}

	public void clickSubmit() {
		find(By.id("submit")).click();
	}

	public void assertLoginSuccessfully() {
		getDriver().getCurrentUrl().contains("translation");
	}
	
	
	

	public void DownCsvFile(String UserProduct, String UserVersion, String UserLanguage) throws Exception {
		// 【PART 2】: 根据参数动态选择Product信息.
		WebElement Product = find(By.xpath("html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[1]/ux-select/div/input"));
		Product.click();
		Thread.sleep(5000);

		// Step1: 通过CSS选择器选出"span"标签的所有元素并存到一个list里.
		ArrayList<String> AllProduct = new ArrayList<String>();
		List<WebElementFacade> allSpansP = findAll(org.openqa.selenium.By.cssSelector("span"));
		for (WebElementFacade spanP : allSpansP) {
			System.out.println("----→" + spanP.getAttribute("textContent") + "←----");
			AllProduct.add(spanP.getAttribute("textContent"));
		}

		System.out.println("################# " + AllProduct.toArray().length + " #################");
		
		 //Step2: 判断用户的输入是不是在当前下拉列表的值的数组里,如果在,就填入这个位置中并且输入回车键确认
		 if(AllProduct.contains(UserProduct)) {
		 Product.sendKeys(UserProduct);
		 Thread.sleep(150);
		 Product.sendKeys(Keys.ENTER);
		 System.out.println("$$$$$$$$$$$$$$$ " + "For this time of Product, " + "【" + UserProduct + "】" + "has been selected." + " $$$$$$$$$$$$$$$");
		 }
		 System.out.println();
		 Thread.sleep(1000);
		 

		// 【PART 3】: 根据参数动态选择Version信息.
		WebElement Version = find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[2]/ux-select/div/input"));
		Version.click();
		Thread.sleep(5000);

		// Step1: 通过CSS选择器选出"span"标签的所有元素并存到一个list里.
		ArrayList<String> AllVersion = new ArrayList<String>();
		List<WebElementFacade> allSpansV = findAll(org.openqa.selenium.By.cssSelector("span"));
		for (WebElementFacade spanV : allSpansV) {
			System.out.println("----→" + spanV.getAttribute("textContent") + "←----");
			AllVersion.add(spanV.getAttribute("textContent"));
		}

		System.out.println("################# " + AllVersion.toArray().length + " #################");
		
		 //Step2: 判断用户的输入是不是在当前下拉列表的值的数组里,如果在,就填入这个位置中并且输入回车键确认
		 if(AllVersion.contains(UserVersion)) {
		 Version.sendKeys(UserVersion);
		 Thread.sleep(150);
		 Version.sendKeys(Keys.ENTER);
		 System.out.println("$$$$$$$$$$$$$$$ " + "For this time of Version, " + "【" + UserVersion + "】" + "has been selected." + " $$$$$$$$$$$$$$$");
		 }
		 System.out.println();
		 Thread.sleep(1000);

		// 【PART 4】: 根据参数动态选择Language信息.
		WebElement Language = find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[3]/ux-select/div/input"));
		Language.click();
		Thread.sleep(5000);

		// Step1: 通过CSS选择器选出"span"标签的所有元素并存到一个list里.
		ArrayList<String> AllLanguage = new ArrayList<String>();
		List<WebElementFacade> allSpansL = findAll(org.openqa.selenium.By.cssSelector("span"));
		for (WebElementFacade spanL : allSpansL) {
			System.out.println("----→" + spanL.getAttribute("textContent") + "←----");
			AllLanguage.add(spanL.getAttribute("textContent"));
		}
		
		System.out.println("################# " + AllLanguage.toArray().length + " #################");
		
		 //Step2: 判断用户的输入是不是在当前下拉列表的值的数组里,如果在,就填入这个位置中并且输入回车键确认
		 if(AllLanguage.contains(UserLanguage)) {
		 Language.sendKeys(UserLanguage);
		 Thread.sleep(300);
		 Language.sendKeys(Keys.ENTER);
		 System.out.println("$$$$$$$$$$$$$$$ " + "For this time of Language, " + "【" + UserLanguage + "】" + "has been selected." + " $$$$$$$$$$$$$$$");
		 }
		 System.out.println();
		 Thread.sleep(1000);
	}

	public void ClickDownloadBtn() throws Exception {
		WebElementFacade ClickDownloadBtn = find(
				By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[2]/div/button[1]"));
		ClickDownloadBtn.click();
		Thread.sleep(30000);
	}

}
