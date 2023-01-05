package stepDefinition;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import pageObjects.ArrayPage;

public class Arraysteps extends Baseclass{
	
	
	@When("user clicks on {string} button under Array")
	public void user_clicks_on_button_under_array(String string) {
		array = new ArrayPage(edriver);
		edriver.manage().window().maximize();
		array.getStarted();
		System.out.println("**** I am in Array page");
	    
	}

	@Then("user should be in Array page")
	public void user_should_be_in_array_page() {
		System.out.println("****The title of the page is: " + edriver.getTitle());
	}

	@When("user clicks on Array {string}")
	public void user_clicks_on_array(String string) {
	    array.Questions();
	    Allure.addAttachment("Practice Questions", new ByteArrayInputStream(((TakesScreenshot)edriver).getScreenshotAs(OutputType.BYTES)));
	}

	@Then("user should be able to navigate back from Array to homepage")
	public void user_should_be_able_to_navigate_back_from_array_to_homepage() {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
	     jse.executeScript("window.history.go(-6)");
	}

}
