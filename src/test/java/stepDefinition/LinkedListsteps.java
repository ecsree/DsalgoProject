package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.*;
import pageObjects.LinkedListPage;

public class LinkedListsteps extends Baseclass {
	
	@When("user clicks on {string} button under Linked List")
	public void user_clicks_on_button_under_linked_list(String string) {
		LL = new LinkedListPage(edriver);
		edriver.manage().window().maximize();
		LL.getStarted();
		System.out.println("**** I am in Array page");
	}

	@Then("user should be in Linked List page")
	public void user_should_be_in_linked_list_page() {
		System.out.println("****The title of the page is: " + edriver.getTitle());
	}

	@When("user clicks on Linked List {string}")
	public void user_clicks_on_linked_list(String string) {
		LL.Questions();
	}

	@Then("user should be able to navigate back from Linked List to homepage")
	public void user_should_be_able_to_navigate_back_from_linked_list_to_homepage() {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
		jse.executeScript("window.history.go(-9)");
	}

}
