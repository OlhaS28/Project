package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LeaveTabPage;
import utilities.Driver;

import java.time.Duration;

public class LeaveTabSteps {
    LeaveTabPage leaveTabPage = new LeaveTabPage();
    @Then("User should be taken to the Leave Page")
    public void user_should_be_taken_to_the_leave_page() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOf(leaveTabPage.LeavePageText));
        Assert.assertTrue(leaveTabPage.LeavePageText.isDisplayed());
    }

}
