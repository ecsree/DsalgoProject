package stepDefinition;

import org.openqa.selenium.WebDriver;

import pageObjects.ArrayPage;
import pageObjects.DataStructuresPage;
import pageObjects.DsAlgoPage;
import pageObjects.GraphPage;
import pageObjects.LinkedListPage;
import pageObjects.RegisterPage;
import pageObjects.USignOutPage;
import pageObjects.StackPage;
import pageObjects.TQueuePage;
import pageObjects.TreePage;
import pageObjects.signInPage;
import static stepDefinition.DriverManager.getDriver;

public class Baseclass {
	
	public static DsAlgoPage da;
	public static RegisterPage rp;
	public static signInPage sp;
	public static WebDriver edriver;
	public static StackPage stack;
	public static TQueuePage queue;
	public static TreePage Tree;
	public static USignOutPage signout;
	public static ArrayPage array;
	public static GraphPage graph;
	public static LinkedListPage LL;
	public static DataStructuresPage ds;
	static {
		edriver = getDriver();
	}

	
}
