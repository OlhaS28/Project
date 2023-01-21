package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LeaveTabPage;
import utilities.Driver;

import java.time.Duration;

public class LeaveTabSteps {
    LeaveTabPage leaveTabPage = new LeaveTabPage();
    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    String leaveText = "Leave";
    String addLeaveEntitlementsText = "Add Leave Entitlement";

    String myLeaveListHeader = "My Leave List";
    @Then("User should be taken to the Leave Page")
    public void user_should_be_taken_to_the_leave_page() {
        webDriverWait.until(ExpectedConditions.visibilityOf(leaveTabPage.leavePageText));
        Assert.assertTrue(leaveTabPage.leavePageText.isDisplayed());
    }

    @Given("User is on Leave Page")
    public void user_is_on_leave_page() {
        webDriverWait.until(ExpectedConditions.visibilityOf(leaveTabPage.leavePageText));
        Assert.assertEquals(leaveTabPage.leavePageText.getText(),leaveText);
    }
    @Given("Clicks on Entitlements Tab")
    public void clicks_on_entitlements_tab() {
        leaveTabPage.entitlementsTab.click();
    }
    @Given("Clicks on Add Entitlements in the Drop Down List")
    public void clicks_on_add_entitlements_in_the_drop_down_list() {
        leaveTabPage.addElementTab.click();
    }
    @Then("User should be taken to the Add Entitlements Section in Leave Tab Page")
    public void user_should_be_taken_to_the_add_entitlements_section_in_leave_tab_page() {
        webDriverWait.until(ExpectedConditions.visibilityOf(leaveTabPage.addLeaveEntitlementText));
        Assert.assertEquals(leaveTabPage.addLeaveEntitlementText.getText(),addLeaveEntitlementsText);
    }

    @Then("User should click on My Leave Tab")
    public void user_should_click_on_my_leave_tab() {
        leaveTabPage.myLeaveListTab.click();
    }
    @Then("User Should be on My Leave List")
    public void user_should_be_on_my_leave_list() {
        webDriverWait.until(ExpectedConditions.visibilityOf(leaveTabPage.myLeaveListTxt));
        Assert.assertEquals(leaveTabPage.myLeaveListTxt.getText(),myLeaveListHeader);
    }

}
