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
		Thread.sleep(3000);
	}
	
	
	@Step
	public void StartDownCsv() throws Exception{
		downloadCSVfilePage.DownCsvFile(System.getProperty("JenkinsProduct"),System.getProperty("JenkinsVersion"), System.getProperty("JenkinsLanguage"));
	}
	
	@Step
	public void ClickDownBtn() throws Exception{
		Thread.sleep(20000);
		downloadCSVfilePage.ClickDownloadBtn();
	}
}
