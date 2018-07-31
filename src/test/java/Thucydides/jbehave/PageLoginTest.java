package Thucydides.jbehave;


import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.steps.PageLoginSteps;
import net.thucydides.core.annotations.Steps;

public class PageLoginTest {
	@Steps
	PageLoginSteps steps;
	
	 BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;

	@Given("Delete all cookies before start testing")
    public void deleteAllCookies() throws Exception {
//		steps.deleteAllCookies();
		System.out.println("No Cookies Detected!!");
    }
	
	@When("the user has opened the Openl10n webpage")
	public void accessOpenl10nURL() throws Exception {
		browserObjectAndCommonMethodPage.openURL("https://www.openl10n.net");
	}
	
	@Then("the user enters username 15202184317@qq.com and password 123qwe!@#QWE to Openl10n login page")
	public void EnterUnPwd() throws Exception {
			steps.EnterUnPwd("15202184317@qq.com", "123qwe!@#QWE");
	}
	
	@Then("click the Login submit button of Openl10n Page")
	public void ClickSubmitBtn() throws InterruptedException {
			steps.ClickSubmitBtn();
	}
	
	@Then("the Openl10n main page should be displayed")
	public void LoginAssertion() throws InterruptedException {
			steps.LoginAssertion();
	}
	
}
