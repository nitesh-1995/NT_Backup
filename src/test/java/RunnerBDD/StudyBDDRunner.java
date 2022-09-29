package RunnerBDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = {"FeatureFiles/StudyBDD.feature"},
		glue = {"StepDefinitionFile"},
		dryRun = false,
		monochrome = true,
		strict = true,
		format = {"pretty","html:testingBDD"}
//		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
			
		)
public class StudyBDDRunner 
{
	
}
