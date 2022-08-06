package RunneClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\resources\\Features"}, 
glue= {"com\\myframework\\stepdefinitions"},
dryRun = false)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
  