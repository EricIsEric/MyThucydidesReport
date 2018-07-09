package Thucydides.pages;

import net.thucydides.core.pages.PageObject;

/**
 * Created by nikais on 3/16/2018.
 */

public class BrowserObjectAndCommonMethodPage extends PageObject {

    public void openURL(String url) {

        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    public void deleteAllCookies() {
        getDriver().manage().deleteAllCookies();
        getDriver().close();
    }

    public void closeDriver() {
        getDriver().close();
    }

}
