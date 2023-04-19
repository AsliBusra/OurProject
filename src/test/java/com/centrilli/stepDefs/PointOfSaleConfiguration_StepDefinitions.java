package com.centrilli.stepDefs;

import com.centrilli.pages.PointOfSalePage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class PointOfSaleConfiguration_StepDefinitions {
    PointOfSalePage pointOfSalePage = new PointOfSalePage();

    //  Background: Login to the dashboard
    @Given("user clicks Point of Sale module button")
    public void user_clicks_point_of_sale_module_button() {
        BrowserUtils.waitFor(5);
        pointOfSalePage.pointOfSaleModuleButton.click();

    }

    @Given("user clicks Point of Sale side bar menu button")
    public void user_clicks_point_of_sale_side_bar_menu_button() {
        BrowserUtils.waitFor(5);
        pointOfSalePage.getPointOfSaleSideBarMenuButton.click();

    }

    //  Scenario: Verify that the user can create new Point Of Sale
    @When("user enters {string} as Point of Sale name")
    public void user_enters_as_point_of_sale_name(String pointOfSaleName) {
        BrowserUtils.waitFor(5);
        pointOfSalePage.pointOfSaleNameInputBox.click();
        BrowserUtils.waitFor(5);
        pointOfSalePage.pointOfSaleNameInputBox.sendKeys(pointOfSaleName + Keys.ENTER);

    }

    @When("user selects Operation Type")
    public void user_selects_operation_type() {

        BrowserUtils.waitFor(5);
        pointOfSalePage.operationTypeSelectDropdown.click();
        BrowserUtils.waitFor(5);
        pointOfSalePage.operationTypeSelectDropdown.sendKeys("7");
        BrowserUtils.waitFor(5);
        pointOfSalePage.operationTypeSelectDropdown.sendKeys(Keys.ENTER);
    }

    @Then("user sees {string} as new created Point of Sale's name")
    public void user_sees_as_new_created_point_of_sale_s_name(String pointOfSaleName) {

        BrowserUtils.waitFor(5);
        String actualName = pointOfSalePage.newCreatedName.getText();
        Assert.assertEquals(pointOfSaleName + " (not used)", actualName);

    }

    //  Scenario: Verify that the user can switch Kanban-List view
    @Then("user sees the page in Kanban format")
    public void user_sees_the_page_in_kanban_format() {

        BrowserUtils.waitFor(5);
        String expectedURL = "https://qa.centrilli.com/web?#view_type=kanban&model=pos.config&menu_id=496&action=676";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }

    @Then("user sees the page in List format")
    public void user_sees_the_page_in_list_format() {
        BrowserUtils.waitFor(5);
        String expectedURL = "https://qa.centrilli.com/web?#view_type=list&model=pos.config&menu_id=496&action=676";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    //  Scenario: Verify that the user can edit Point of Sale
    @Then("user changes Point of Sale name as {string}")
    public void user_changes_point_of_sale_name_as(String pointOfSaleName) {

        BrowserUtils.waitFor(5);
        pointOfSalePage.pointOfSaleNameInputBox.click();
        BrowserUtils.waitFor(5);
        pointOfSalePage.pointOfSaleNameInputBox.clear();
        BrowserUtils.waitFor(5);
        pointOfSalePage.pointOfSaleNameInputBox.sendKeys(pointOfSaleName + Keys.ENTER);

    }

    @Then("user sees {string} as editted Point of Sale's name")
    public void user_sees_as_editted_point_of_sale_s_name(String pointOfSaleName) {
        BrowserUtils.waitFor(5);
        String actualName = pointOfSalePage.newCreatedName.getText();
        Assert.assertEquals(pointOfSaleName + " (not used)", actualName);
    }

    //  Scenario: Verify that user cannot create new Point of Sale without Point of Sale name

    @Then("user cannot create new Point of Sale without Point of Sale name")
    public void user_cannot_create_new_point_of_sale_without_point_of_sale_name() {

        BrowserUtils.waitFor(5);
        String expectedText = "New";
        String actualText = pointOfSalePage.newCreatedName.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    //  Scenario: Verify that user cannot create new Point of Sale without Operation type

    @Then("user cannot create new Point of Sale without Operation type")
    public void user_cannot_create_new_point_of_sale_without_operation_type() {
        BrowserUtils.waitFor(5);
        String expectedText = "New";
        String actualText = pointOfSalePage.newCreatedName.getText();
        Assert.assertEquals(expectedText, actualText);

    }

}
