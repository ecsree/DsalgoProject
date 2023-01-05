package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.*;
import pageObjects.TreePage;

public class Treesteps extends Baseclass{
	
	@When("user clicks on {string} button under Tree")
	public void user_clicks_on_button_under_tree(String string) {
		Tree = new TreePage(edriver);
		edriver.manage().window().maximize();
		Tree.getStarted();
		System.out.println("**** I am in Tree page");
	}

	@Then("user should be in Tree page")
	public void user_should_be_in_tree_page() {
		System.out.println("****The title of the page is: " + edriver.getTitle());
	}

	
	@When("user clicks on Tree {string}")
	public void user_clicks_on_tree(String string) {
		Tree.Questions();
	}

	@Then("user should be able to navigate back from Tree to homepage")
	public void user_should_be_able_to_navigate_back_from_tree_to_homepage() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
	     jse.executeScript("window.history.go(-15)");
	     //Thread.sleep(3000);
	}

}
