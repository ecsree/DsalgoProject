package stepDefinition;

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
	
}
