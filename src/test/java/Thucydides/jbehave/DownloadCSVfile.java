package Thucydides.jbehave;
import org.jbehave.core.annotations.*;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.steps.DownloadCSVfileSteps;
import net.thucydides.core.annotations.Steps;

public class DownloadCSVfile{
	
	@Steps
	DownloadCSVfileSteps steps;
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
	public void thenClickDownloadButton() throws Exception{
		  steps.ClickDownBtn();
	}
}