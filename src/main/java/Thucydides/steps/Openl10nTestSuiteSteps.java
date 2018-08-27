package Thucydides.steps;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.Openl10nTestSuitePage;
import net.thucydides.core.annotations.Step;

public class Openl10nTestSuiteSteps {
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
	Openl10nTestSuitePage openl10nTestSuitePage;
	
	@Step
	public void deleteAllCookies() throws Exception{
		System.out.println("No Cookies Deleted!!");
	}
	
	@Step
	public void EnterUnPwd(String username, String password) throws Exception {
		openl10nTestSuitePage.login(username, password);
	}
	
	@Step
	public void ClickSubmitBtn() throws Exception {
		openl10nTestSuitePage.clickSubmit();
	}
	
	@Step
	public void LoginAssertion() throws InterruptedException {
		openl10nTestSuitePage.assertLoginSuccessfully();
		Thread.sleep(3000);
	}
	
	
	@Step
	public void StartDownCsv() throws Exception{
		openl10nTestSuitePage.DownCsvFile(System.getProperty("JenkinsProduct"),System.getProperty("JenkinsVersion"), System.getProperty("JenkinsLanguage"));
//		openl10nTestSuitePage.DownCsvFile("PPM","9.50","Finnish");
	}
	
	@Step
	public void ClickDownBtn() throws Exception{
		Thread.sleep(20000);
		openl10nTestSuitePage.ClickDownloadBtn();
	}

	
}
