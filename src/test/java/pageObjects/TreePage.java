package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage {
	
	public WebDriver edriver;

	public TreePage(WebDriver edgedriver){
		
		edriver = edgedriver;
		PageFactory.initElements(edgedriver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"tree\"]")
	WebElement btn_stackGetStarted;

	public void getStarted() {
		btn_stackGetStarted.click();
	}
	
	@FindBy(xpath = "//a[@class=\"list-group-item list-group-item-light text-info\"]")
	WebElement link_questions;

	public void Questions() {
		link_questions.click();
	}



}
