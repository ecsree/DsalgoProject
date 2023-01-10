package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.*;
import pageObjects.DataStructuresPage;

public class DataStructuressteps extends Baseclass{
	
	@When("user clicks on {string} button under Data Structures")
	public void user_clicks_on_button_under_data_structures(String string) {
		ds = new DataStructuresPage(edriver);
		edriver.manage().window().maximize();
		ds.getStarted();
		System.out.println("**** I am in Data Structure page");
	}

	@Then("user should be in Data Structures page")
	public void user_should_be_in_data_structures_page() {
		System.out.println("****The title of the page is: " + edriver.getTitle());
		Assert.assertEquals("Data Structure",edriver.getTitle());
	}

	@When("user clicks on Data Structures {string}")
	public void user_clicks_on_data_structures(String string) {
	    ds.Questions();
	}

	@Then("user should be able to navigate back from Data Structures to homepage")
	public void user_should_be_able_to_navigate_back_from_data_structures_to_homepage() {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
		jse.executeScript("window.history.go(-3)");
	}


}
