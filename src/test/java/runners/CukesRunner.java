package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // This line will force this class to run with Cucumber
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@OHRMLoginFeatureOutline",
        dryRun = false
)
public class CukesRunner {
}
