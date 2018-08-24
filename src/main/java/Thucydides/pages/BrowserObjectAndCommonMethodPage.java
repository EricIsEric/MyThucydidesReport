package Thucydides.pages;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

/**
 * Created by nikais on 3/16/2018.
 */

public class BrowserObjectAndCommonMethodPage extends PageObject {

	private static Logger logger = LoggerFactory.getLogger(BrowserObjectAndCommonMethodPage.class);

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

		// Step2: 判断用户的输入是不是在当前下拉列表的值的数组里,如果在,就填入这个位置中并且输入回车键确认
		if (AllList.contains(MainParam)) {
			ClickValue.sendKeys(MainParam);
			Thread.sleep(1500);
			ClickValue.sendKeys(Keys.ENTER);
			System.out.println("$$$$$$$$$$$$$$$ " + "For this time of testing, " + "【" + MainParam + "】"
					+ "has been selected." + " $$$$$$$$$$$$$$$");
		} else {
			System.out.println("The current value: " + MainParam + " does not existed!" + ".");
			getDriver().close();
			System.exit(0);
		}
		System.out.println();
		Thread.sleep(1000);
	}

	public void FinalDown(String BtnPath) throws Exception {
		WebElementFacade ClickDownloadBtn = find(By.xpath(BtnPath));
		ClickDownloadBtn.click();
		Thread.sleep(30000);
	}

	public void ClickLogoutBtn() throws Exception {
		find(org.openqa.selenium.By.xpath("/html/body/app-root/div/ux-page-header/div/div[1]/div[3]/div[2]/span"))
				.click();
		Thread.sleep(10000);
	}

	public void LoginBtnAftOut() throws Exception {
		Thread.sleep(3000);
		find(org.openqa.selenium.By.id("logout-link")).click();
		Thread.sleep(3000);
	}

	public void SelectPvl() throws Exception {
		WebElement Product = find(org.openqa.selenium.By.xpath(
				"/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[1]/div/div[1]/ux-select/div/input"));
		WebElement Version = find(org.openqa.selenium.By.xpath(
				"/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[1]/div/div[2]/ux-select/div/input"));
		WebElement Language = find(org.openqa.selenium.By.xpath(
				"/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[1]/div/div[3]/ux-select/div/input"));

		Product.click();
		Product.sendKeys("PPM");
		Thread.sleep(1555);
		Product.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		Version.click();
		Version.sendKeys("9.50");
		Thread.sleep(1555);
		Version.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		Language.click();
		Language.sendKeys("Finnish");
		Thread.sleep(1555);
		Language.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public void EmptyAssert() {
		ArrayList<String> AllList = new ArrayList<String>();
		List<WebElementFacade> allSpans = findAll(org.openqa.selenium.By.cssSelector("span"));

		for (WebElementFacade spans : allSpans) {
			System.out.println("----→" + spans.getAttribute("textContent") + "←----");
			AllList.add(spans.getAttribute("textContent"));
		}

		if (AllList.contains(
				"com.microfocus.g11n.openl10n.exception.InvalidUserCsvException: Cannot find any valid CSV file name in the ZIP.")) {
			System.out.println("【==>RiskCheckResult<==】: EmptyZipFileCheckPassed!");
		} else {
			System.err.println("【RiskCheckResult】: EmptyZipFileCheckFailed!");
		}
	}

	public void Risk2ResultAssert() throws Exception {
		getDriver().switchTo().alert();
		if (getAlert().getText().equals("Only zip file allowed here")) {
			System.out.println("【==>RiskCheckResult<==】: DisallowedTypeCheckPassed!");
		} else {
			System.out.println("【==>RiskCheckResult<==】: DisallowedTypeCheckFailed!");
		}
		Thread.sleep(5000);
		getAlert().accept();
		Thread.sleep(3000);

	}

	public void TakeAlertShot() throws Exception {
		Robot robot = new Robot();
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		ImageIO.write(screenFullImage, "png", new File("C:\\_ScreenShot\\FullScreenshotRobot.png"));
		System.out.println("Full Desktop screenshot saved!");
	}

	public static String executeCmd(String command) throws IOException {
		logger.info("Into executeCmd()");
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("cmd /c " + command);
		logger.info("exec: " + "cmd /c " + command);
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
		String line = null;
		StringBuilder build = new StringBuilder();
		while ((line = br.readLine()) != null) {
			logger.info(line);
			build.append(line);
		}
		return build.toString();
	}
	
	public void CloseOpenTest() {
		if(getDriver().switchTo().defaultContent()!=null) {
			getDriver().switchTo().defaultContent().close();
		}
		
	}

}
