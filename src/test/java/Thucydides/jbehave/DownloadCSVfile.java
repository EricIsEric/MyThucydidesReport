package Thucydides.jbehave;
import org.jbehave.core.annotations.*;

import Thucydides.steps.DownloadCSVfileSteps;
import net.thucydides.core.annotations.Steps;
public class DownloadCSVfile{
	
	@Steps
	DownloadCSVfileSteps steps;
	
	
	@Then("select product as 'PPM'")
	public void SelectProduct() throws Exception{
		steps.ClickProduct();
	}
	
	@Then("select version as '9.50'")
	public void SelectVersion() throws Exception{
		 steps.ClickVersion();
	}
	
	@Then("select language as 'Finnish'")
	public void SelectLanguage() throws Exception{
		 steps.ClickLanguage();
	}
	
	@Then("click 'Download' button")
	public void ClickDownloadBtn() throws Exception{
		 steps.ClickDownBtn();
	}
}