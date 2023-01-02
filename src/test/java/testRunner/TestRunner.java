package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//src/test/resources./Features",
		glue = {"stepDefinition"},
		dryRun=false,
		monochrome=true,
		//tags = {"@smoke or @regression"},
		plugin= {"pretty","html:target/DsAlgo/reports.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		}			
		)

public class TestRunner {

}
