package makemytrip;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\login.feature",
glue="makemytrip",monochrome=true,dryRun=false,plugin="html:reports")


public class TestRunner {

}
			
			