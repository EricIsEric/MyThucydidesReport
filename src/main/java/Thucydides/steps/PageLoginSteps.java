package Thucydides.steps;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class PageLoginSteps {
	
	 BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
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

	
}
