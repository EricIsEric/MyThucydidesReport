package Thucydides.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class DownloadCSVfilePage extends PageObject {
	
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;

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
		
		browserObjectAndCommonMethodPage.PVL(UserProduct,  "/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[1]/div/div[1]/ux-select/div/input");
		browserObjectAndCommonMethodPage.PVL(UserVersion,  "/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[1]/div/div[2]/ux-select/div/input");
		browserObjectAndCommonMethodPage.PVL(UserLanguage, "/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[1]/div/div[3]/ux-select/div/input");
	}

	public void ClickDownloadBtn() throws Exception {
		WebElementFacade ClickDownloadBtn = find(
				By.xpath("/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[2]/div/button[1]"));
		ClickDownloadBtn.click();
		Thread.sleep(30000);
	}

}
