package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // This line will force this class to run with Cucumber
@CucumberOptions(
        plugin = {"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "",
        dryRun = true
)
public class CukesRunner {
}