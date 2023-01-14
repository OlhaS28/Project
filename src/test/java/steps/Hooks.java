package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


public class Hooks {

    @Before
    public void setUp(){
        System.out.println("The scenario is running.");
        // example of content: login
    }
    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "failed Scenario Screenshot");
        }
        Driver.quitDriver();
    }

}
