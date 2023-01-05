package stepDefinition;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import pageObjects.RegisterPage;

public class Registersteps extends Baseclass {




	@Given("The user opens browser and enter url {string}")
	public void the_user_opens_browser_and_enter_url(String url) {
		rp = new RegisterPage(edriver);
		edriver.manage().window().maximize();
		edriver.get(url);
	}


	@When("^user type username as (.*)$")
	public void user_enter_username_as_username(String username) {
	    rp.rUName(username);
	}


	@When("^type password as (.*)$")
	public void password_as(String password) {

		rp.rPWord(password);
	}

	@When("^confirmpassword as (.*)$")
	public void confirmpassword_as_confirmpassword(String confirmpassword) {
	    rp.confirmPassword(confirmpassword);
	}

	@When("user click on register button")
	public void user_click_on_register_botton() throws InterruptedException {
		Thread.sleep(1000);
		rp.regSubmit();
	}
	
	@When("user type username and password")
	public void user_type_username_and_password(DataTable dataTable) {
		List<List<String>> data = dataTable.cells();
		rp.rUName(data.get(0).get(0));
		rp.rPWord(data.get(0).get(1));
	}
	
	@Then("user should see {string}")
	public void user_should_see(String string) throws InterruptedException {
		
		//Alert alert = edriver.switchTo().alert();
		//String text = alert.getText();
		System.out.println( rp.pleaseFillOutmsg(string));
		//Assert.assertEquals(string, text);
		Allure.addAttachment("Fill Out Msg", new ByteArrayInputStream(((TakesScreenshot)edriver).getScreenshotAs(OutputType.BYTES)));

	}
	

	@Then("user should be able to see message {string}")
	public void user_should_be_able_to_see_message(String string) {
		Assert.assertEquals(string, rp.alertMsg());

	}

	@When("user clicks on login instead link")
	public void user_clicks_on_login_instead_link() {
		rp.Login();
	}

	@Then("user should be redirected to login page")
	public void user_should_be_redirected_to_login_page() {

		System.out.println("****Current url is:  " + edriver.getCurrentUrl());
	}



}
