package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.*;
import pageObjects.GraphPage;

public class Graphsteps extends Baseclass{

	@When("user clicks on {string} button under Graph")
	public void user_clicks_on_button_under_graph(String string) {
		graph = new GraphPage(edriver);
		edriver.manage().window().maximize();
		graph.getStarted();
		System.out.println("**** I am in Array page");
	}

	@Then("user should be in Graph page")
	public void user_should_be_in_graph_page() {
		System.out.println("****The title of the page is: " + edriver.getTitle());
	}

	@When("user clicks on Graph {string}")
	public void user_clicks_on_graph(String string) {
		graph.Questions();
	}

	@Then("user should be able to navigate back from Graph to homepage")
	public void user_should_be_able_to_navigate_back_from_graph_to_homepage() {
		JavascriptExecutor jse = (JavascriptExecutor)edriver;
		jse.executeScript("window.history.go(-4)");
	}

}
