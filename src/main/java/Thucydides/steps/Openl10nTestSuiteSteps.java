package Thucydides.steps;



import java.io.File;

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
//		downloadCSVfilePage.DownCsvFile(System.getProperty("JenkinsProduct"),System.getProperty("JenkinsVersion"), System.getProperty("JenkinsLanguage"));
		openl10nTestSuitePage.DownCsvFile("PPM","9.50","Finnish");
	}
	
	@Step
	public void ClickDownBtn() throws Exception{
		Thread.sleep(20000);
		openl10nTestSuitePage.ClickDownloadBtn();
	}
	
	@Step
	public void ClickLogoutBtn() throws Exception {
		openl10nTestSuitePage.ClickLogoutBtn();
	}
	
	@Step
	public void LoginBtnAftOut() throws Exception {
		openl10nTestSuitePage.LoginBtnAftOut();
	}
	
	@Step
	public void SelectPvl() throws Exception {
		openl10nTestSuitePage.SelectPvl();
	}
	
	@Step
	public void UploadBtnClick() throws Exception {
		openl10nTestSuitePage.UploadBtn();
		Thread.sleep(2000);
	}
	
	@Step
	public void RunRisk1Exe() throws Exception {
		java.awt.Desktop.getDesktop().open(new File("C:\\RiskTest\\Risk_EmptyZip\\PPM_9.50_fi.exe"));
		Thread.sleep(10000);
	}
	
	@Step
	public void Risk1Result() throws Exception {
		openl10nTestSuitePage.Risk1ResultAssert();
	}
	
	@Step
	public void RunRisk2Exe() throws Exception {
		java.awt.Desktop.getDesktop().open(new File("C:\\RiskTest\\Risk_DisallowedJpgFileType\\PPM_9.50_fi.exe"));
		Thread.sleep(10000);
	}
	
	@Step
	public void TakeAlertShot() throws Exception {
		openl10nTestSuitePage.TakeAlertShot();
	}
	
	@Step
	public void Risk2Result() throws Exception {
		openl10nTestSuitePage.Risk2ResultAssert();
	}
	
	

	

	

	

	
}
