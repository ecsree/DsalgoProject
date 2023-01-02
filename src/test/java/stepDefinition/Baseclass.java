package stepDefinition;

import org.openqa.selenium.WebDriver;

import pageObjects.DsAlgoPage;
import pageObjects.RegisterPage;
import pageObjects.USignOutPage;
import pageObjects.StackPage;
import pageObjects.TQueuePage;
import pageObjects.signInPage;
import static stepDefinition.DriverManager.getDriver;

public class Baseclass {
	
	public static DsAlgoPage da;
	public static RegisterPage rp;
	public static signInPage sp;
	public static WebDriver edriver;
	public static StackPage stack;
	public static TQueuePage queue;
	public static USignOutPage signout;
	static {
		edriver = getDriver();
	}

	
}
