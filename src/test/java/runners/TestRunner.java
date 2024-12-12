package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@googleEnterEmail"
)
public class TestRunner extends AbstractTestNGCucumberTests {}
