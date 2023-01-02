package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver edriver;

	public RegisterPage(WebDriver edgedriver){
		
		edriver = edgedriver;
		PageFactory.initElements(edgedriver, this);
	}
	
	@FindBy(xpath= "//input[@id=\"id_username\"]")
	WebElement inputUName;
	public void rUName(String username) {
		inputUName.sendKeys(username);
		
	}
	
	@FindBy(xpath = "//input[@value=\"Register\"]")
	WebElement regBtn;
	public void regSubmit() {
		regBtn.click();
	}
	
	@FindBy(xpath = "//input[@id=\"id_password1\"]")
	WebElement inputPW;
	public void rPWord(String password) {
		inputPW.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@id=\"id_password2\"]")
	WebElement inputConfirmPW;
	public void confirmPassword(String confirmpassword) {
		inputConfirmPW.sendKeys(confirmpassword);
	}
	
	@FindBy(xpath = "//div[@class=\"alert alert-primary\"]")
	WebElement textMsg;
	public String alertMsg() {
	System.out.println("**** Alert msg is : " +textMsg.getText()+ "****");
	return textMsg.getText();
	}
	
	@FindBy(xpath = "//div/a[@href =\"/login\"]")
	WebElement link_login;
	
	public void Login() {
		link_login.click();
	}
	

}
