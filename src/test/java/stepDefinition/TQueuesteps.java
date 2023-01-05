package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.StackPage;
import pageObjects.TQueuePage;

public class TQueuesteps extends Baseclass {
	
	@When("user clicks on {string} button under Queue")
	public void user_clicks_on_button_under_queue(String string) {
		stack = new StackPage(edriver);
		edriver.manage().window().maximize();
		queue = new TQueuePage(edriver);
		queue.getStarted();
		System.out.println("**** I am in queue page");
	}

	@Then("user should be in {string} page")
	public void user_should_be_in_queue_page(String string) {
		Assert.assertEquals(string, edriver.getTitle());
		System.out.println("****Current Page is:  " + edriver.getTitle());
	    
	}
	
	
	
	@When("user clicks on Queue {string}")
	public void user_clicks_on_queue(String string) {
	    queue.Questions();
	}

	@Then("user should be navigate back from queue to home page")
	public void user_should_be_navigate_back_from_queue_to_home_page() {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
	     jse.executeScript("window.history.go(-6)");
	}
}
