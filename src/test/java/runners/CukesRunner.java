package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // This line will force this class to run with Cucumber
@CucumberOptions(
        plugin = {"html:test_result/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@TEX-181",
        dryRun = false
)
public class CukesRunner {
}
