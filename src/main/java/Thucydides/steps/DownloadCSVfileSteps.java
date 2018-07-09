package Thucydides.steps;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.DownloadCSVfilePage;
import Thucydides.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class DownloadCSVfileSteps {
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
	DownloadCSVfilePage downloadCSVfilePage;
	LoginPage loginPage;
	
	@Step
    public void deleteAllCookies() throws Exception {
//		browserObjectAndCommonMethodPage.deleteAllCookies();
		System.out.println("No Cookies Deleted!!");
    }

	@Step
	public void EnterUnPwd(String username, String password) throws Exception {
		loginPage.login(username, password);

	}

	@Step
	public void ClickSubmitBtn() throws InterruptedException {
		loginPage.clickSubmit();
	}
	
	@Step
	public void LoginAssertion() throws InterruptedException {
		loginPage.assertLoginSuccessfully();
	}
 
	 @Step
	 public void ClickProduct() throws Exception{
		 Thread.sleep(20000);
		 downloadCSVfilePage.getProduct();
	 }
	 
	 @Step
	 public void ClickVersion() throws Exception{
		 Thread.sleep(20000);
		 downloadCSVfilePage.getVersion();
	 }
	 
	 @Step
	 public void ClickLanguage() throws Exception{
		 Thread.sleep(20000);
		 downloadCSVfilePage.getLanguage();
	 }
	 
	 @Step
	 public void ClickDownBtn() throws Exception{
		 Thread.sleep(20000);
		 downloadCSVfilePage.ClickDownloadBtn();
	 }
}
