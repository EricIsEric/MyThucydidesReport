package Thucydides.steps;



import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.DownloadCSVfilePage;
import net.thucydides.core.annotations.Step;

public class DownloadCSVfileSteps {
	/*public static final String JenkinsProduct = null;
	public static final String JenkinsVersion = null;
	public static final String JenkinsLanguage = null;*/
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
	public void StartDownCsv() throws Exception{
		downloadCSVfilePage.DownCsvFile("PPM","9.50","Finnish");
	}
	
	@Step
	public void ClickDownBtn() throws Exception{
		Thread.sleep(20000);
		downloadCSVfilePage.ClickDownloadBtn();
	}
}
