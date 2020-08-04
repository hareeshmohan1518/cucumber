package runnerProfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Cucumber BDD\\cucumberBasics\\src\\main\\java\\feature", glue="stepDefinition")
public class TestRunner {

}
