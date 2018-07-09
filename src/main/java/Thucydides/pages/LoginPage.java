package Thucydides.pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.By;

/**
 * 0
 * Created by nikais on 5/22/2018.
 */

public class LoginPage extends PageObject {

    public void login(String username, String password){
    	
        WebElementFacade usernameInput = find(By.id("username"));
        WebElementFacade passwordInput = find(By.id("password"));
        usernameInput.type(username);
        passwordInput.type(password);

    }

	public void clickSubmit() {
		find(By.id("submit")).click();
	}

	public void assertLoginSuccessfully() {
		getDriver().getCurrentUrl().contains("translation");
	}

}
