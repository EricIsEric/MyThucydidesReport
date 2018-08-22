package Thucydides.jbehave;
import org.jbehave.core.annotations.*;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.steps.Openl10nTestSuiteSteps;
import net.thucydides.core.annotations.Steps;

public class Openl10nTestSuite{
	
	@Steps
	Openl10nTestSuiteSteps steps;
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
	
	@Given("Delete all cookies before start testing")
	public void deleteAllCookies() throws Exception{
		  browserObjectAndCommonMethodPage.deleteAllCookies();
		  System.out.println("No Cookies Detected!!");
	}
	
	@When("the user has opened the Openl10n webpage")
	public void accessOpenl10nURL() throws Exception{
		  browserObjectAndCommonMethodPage.openURL("https://www.openl10n.net");
	}
	
	
	@Then("the user enters username 15202184317@qq.com and password 123qwe!@#QWE to Openl10n login page")
	public void EnterUnPwd() throws Exception{
		  steps.EnterUnPwd("15202184317@qq.com", "123qwe!@#QWE");
	}
	
	@Then("click the Login submit button of Openl10n Page")
	public void ClickSubmitBtn() throws Exception{
		  steps.ClickSubmitBtn();
	}
	
	@Then("the Openl10n main page should be displayed")
	public void LoginAssertion() throws Exception{
		  steps.LoginAssertion();
	}
	
	@Then("Get values from the parameters")
	public void StartDownCsv() throws Exception{
		  steps.StartDownCsv();
	}
	
	@Then("click 'Download' button")
	public void ClickDownBtn() throws Exception{
		  steps.ClickDownBtn();
	}
	
	@Then("click Logout button")
	public void ClickLogoutBtn() throws Exception {
		steps.ClickLogoutBtn();
	}
	
	@Then("click login button on the logout first page")
	public void LoginBtnAftOut() throws Exception {
		steps.LoginBtnAftOut();
	}
	
	@Then("Re-Enter the username and password")
	public void ReLogin() throws Exception {
		steps.EnterUnPwd("15202184317@qq.com", "123qwe!@#QWE");
	}
	
	@Then("select product/version/language as PPM/9.50/Finnish")
	public void SelectPvl() throws Exception {
		steps.SelectPvl();
	}
	
	@Then("click upload button")
	public void ClickUploadBtn() throws Exception {
		steps.UploadBtnClick();
	}
	
	@Then("Run AutoIt script to upload file for Risk01")
	public void AutoItScript() throws Exception {
		steps.RunRisk1Exe();
	}
	
	@Then("check correct message displayed for Risk01")
	public void CheckRisk1Result() throws Exception {
		steps.Risk1Result();
	}
	
	@Then("Run AutoIt script to upload file for Risk02 (Upload \".jpg\" file)")
	public void AutoItScriptRis2() throws Exception {
		steps.RunRisk2Exe();
	}
	
	@Then("Take screenshot of the Alert window Using Robot")
	public void TakeAlertShot() throws Exception {
		steps.TakeAlertShot();
	}
	
	@Then("check correct message displayed for Risk02 (Check result of \".jpg\" file)")
	public void CheckRisk2Result() throws Exception {
		steps.Risk2Result();
	}
}