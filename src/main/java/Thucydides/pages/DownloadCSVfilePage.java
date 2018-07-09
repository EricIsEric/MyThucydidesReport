package Thucydides.pages;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class DownloadCSVfilePage extends PageObject {
	
	public void getProduct() throws Exception {
		WebElementFacade TrigProduct=find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[1]/ux-select/div/input"));
		TrigProduct.click();
		Thread.sleep(3000);
		WebElementFacade SelectProduct = find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[1]/ux-select/div/ux-typeahead/div/ol/li[5]/span"));
		SelectProduct.click();
	}
	
	public void getVersion()throws Exception {
		WebElementFacade TrigVersion=find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[2]/ux-select/div/input"));
		TrigVersion.click();
		Thread.sleep(2000);
		WebElementFacade SelectVersion = find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[2]/ux-select/div/ux-typeahead/div/ol/li/span"));
		SelectVersion.click();
	}
	
	public void getLanguage() throws Exception {
		WebElementFacade TrigLanguage=find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[3]/ux-select/div/input"));
		TrigLanguage.click();
		Thread.sleep(2000);
		WebElementFacade SelectLanguage = find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[1]/div[3]/ux-select/div/ux-typeahead/div/ol/li[5]/span"));
		SelectLanguage.click();
	}
	
	public void ClickDownloadBtn() throws Exception {
		WebElementFacade ClickDownloadBtn = find(By.xpath("/html/body/div/my-app/mf-apps/div/div[2]/mf-translation/div/div/div[2]/div/button[1]"));
		ClickDownloadBtn.click();
		Thread.sleep(30000);
	}
}
