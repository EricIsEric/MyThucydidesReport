package Thucydides.steps;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.DownloadCSVfilePage;
import net.thucydides.core.annotations.Step;

public class DownloadCSVfileSteps {
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
	DownloadCSVfilePage downloadCSVfilePage;
	
	@Step
	public void deleteAllCookies() throws Exception{
		System.out.println("No Cookies Deleted!!");
	}
	
	@Step
	public void EnterUnPwd(String username, String password) throws Exception {
		downloadCSVfilePage.login(username, password);
	}
	
	@Step
	public void ClickSubmitBtn() throws InterruptedException {
		downloadCSVfilePage.clickSubmit();
	}
	
	@Step
	public void LoginAssertion() throws InterruptedException {
		downloadCSVfilePage.assertLoginSuccessfully();
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
