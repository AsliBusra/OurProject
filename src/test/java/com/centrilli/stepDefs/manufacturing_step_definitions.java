package com.centrilli.stepDefs;

import com.centrilli.pages.ManufacturingPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class manufacturing_step_definitions {
    ManufacturingPage manufacturingPage = new ManufacturingPage();
    Faker faker = new Faker();


    @When("user clicks Manufacturing module button")
    public void user_clicks_manufacturing_module_button() {
        if (manufacturingPage.ManufacturingModuleButton.isDisplayed()) {
            manufacturingPage.ManufacturingModuleButton.click();
        } else {
            manufacturingPage.moreDropdown.click();
            manufacturingPage.ManufacturingModuleButton.click();
        }
    }

    @When("user makes sure he is on {string} page")
    public void user_makes_sure_he_is_on_page(String string) {
        //String = "Manufacturing Orders"
        BrowserUtils.sleep(2);
        String expectedPageTitle = string;
        System.out.println("expectedPageTitle = " + expectedPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("actualPageTitle = " + actualPageTitle);
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }

    @When("user selects a product from the dropdown menu")
    public void user_selects_a_product_from_the_dropdown_menu() {
        //java faker is used to select a random product from the dropdown menu
        manufacturingPage.ProductDropdown.click();
        BrowserUtils.waitFor(2);
        int xTimesDown = faker.number().numberBetween(1,7);
        for (int i = 0; i < xTimesDown; i++) {
            manufacturingPage.ProductDropdown.sendKeys(Keys.DOWN);
        }
        BrowserUtils.waitFor(2);
        manufacturingPage.ProductDropdown.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("user sees his recently created {string} on the page")
    public void user_sees_his_recently_created_manufacturing_order_on_the_page(String string) {
        BrowserUtils.sleep(2);
        String expectedOrderTitle = manufacturingPage.CreatedOrderTitle.getText();
        System.out.println("expectedOrderTitle = " + expectedOrderTitle);
        String actualOrderTitle = Driver.getDriver().getTitle();
        System.out.println("actualOrderTitle = " + actualOrderTitle);
        Assert.assertTrue(actualOrderTitle.contains(expectedOrderTitle));
    }

    @Then("the display of Manufacturing Orders List changed to Kanban view")
    public void the_display_of_manufacturing_orders_list_changed_to_kanban_view() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(manufacturingPage.kanbanView.isDisplayed());
    }

    @Then("Manufacturing Orders are displayed in List view")
    public void manufacturing_orders_are_displayed_in_list_view() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(manufacturingPage.listView.isDisplayed());
    }

    @When("{string} popup message should be displayed")
    public void popup_message_should_be_displayed(String string) {
        // String = "Warning"
        BrowserUtils.sleep(2);
        Assert.assertTrue(manufacturingPage.discardWarningMessage.isDisplayed());
    }

    @When("user clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {
        // String = "ok"
        BrowserUtils.sleep(2);
        manufacturingPage.okButton.click();
    }

    @Then("user should be directed back to {string} page automatically")
    public void user_should_be_directed_back_to_page_automatically(String string) {
        // String = "Manufacturing Orders"
        BrowserUtils.sleep(2);
        String expectedPageTitle = string;
        System.out.println("expectedPageTitle = " + expectedPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();
        System.out.println("actualPageTitle = " + actualPageTitle);
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }


    @When("user clicks Search button")
    public void user_clicks_search_button() {
        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.click();
    }

    @When("user enters the reference title that he wants to edit which is {string}")
    public void user_enters_the_reference_title_that_he_wants_to_edit_which_is(String string) {
        // String = broken reference title: "TY/2023/0175" -bug
        // String = safe reference title: "TY/2019/0035"
        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.sendKeys(string);

    }

    @When("user clicks enter")
    public void user_clicks_enter() {
        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.sendKeys(Keys.ENTER);
    }

    @When("user finds his M.O. and clicks on it")
    public void user_finds_his_m_o_and_clicks_on_it() {
        BrowserUtils.sleep(2);
        manufacturingPage.ListedBrokenMOTitle.click();
    }

    @When("user selects a new product name")
    public void user_selects_a_new_product_name() {
        BrowserUtils.sleep(2);
        //java faker is used to select a random product from the dropdown menu
        manufacturingPage.ProductDropdown.click();
        BrowserUtils.waitFor(2);
        int xTimesDown = faker.number().numberBetween(1,7);
        for (int i = 0; i < xTimesDown; i++) {
            manufacturingPage.ProductDropdown.sendKeys(Keys.DOWN);
        }
        BrowserUtils.waitFor(2);
        manufacturingPage.ProductDropdown.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @When("user goes back to {string} page")
    public void user_goes_back_to_page(String string) {
        // String = "Manufacturing Orders" (submodule of Manufacturing, located under Operations)
        BrowserUtils.sleep(2);
        manufacturingPage.OperationsMOSubmoduleButton.click();
    }

    @Then("user makes sure his edited M.O. {string} is listed")
    public void user_makes_sure_his_edited_m_o_is_listed(String string) {

        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.click();

        // String = broken reference title: "TY/2023/0175" -bug
        // String = safe reference title: "TY/2019/0035"
        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.sendKeys(string + Keys.ENTER);

        BrowserUtils.sleep(2);
        Assert.assertTrue(manufacturingPage.ListedBrokenMOTitle.isDisplayed());


    }
    @Given("user clicks Unbuild Orders button")
    public void user_clicks_unbuild_orders_button() {
        BrowserUtils.waitFor(2);
        manufacturingPage.unbuildOrdersModuleButton.click();

    }
    @Then("Unbuild Orders are displayed in Kanban view")
    public void unbuild_orders_are_displayed_in_kanban_view() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(manufacturingPage.kanbanView.isDisplayed());

    }
    @Then("Unbuild Orders are displayed in List view")
    public void unbuild_orders_are_displayed_in_list_view() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(manufacturingPage.listView.isDisplayed());

    }
    @When("user enters number in the quantity box")
    public void user_enters_number_in_the_quantity_box() {
        BrowserUtils.waitFor(2);
        manufacturingPage.quantityBox.click();
        manufacturingPage.quantityBox.sendKeys(Keys.CONTROL, "A" + Keys.BACK_SPACE);
        manufacturingPage.quantityBox.sendKeys("2.00");

    }

    @When("user clicks Cancel button")
    public void user_clicks_cancel_button() {
        BrowserUtils.waitFor(2);
        manufacturingPage.CancelButton.click();
    }

    @When("Confirmation popup message should be displayed")
    public void confirmation_popup_message_should_be_displayed() {
        BrowserUtils.waitFor(2);
        manufacturingPage.ConfirmationMessage.isDisplayed();
    }

    @Then("user clicks on the Ok button")
    public void user_clicks_on_the_ok_button() {
        BrowserUtils.sleep(2);
        String firstTitle = manufacturingPage.CreatedOrderTitle.getText();
        System.out.println("firstTitle = " + firstTitle);
        BrowserUtils.sleep(2);
        manufacturingPage.okButton.click();
        BrowserUtils.sleep(2);
        String secondTitle = manufacturingPage.CreatedOrderTitle.getText();
        System.out.println("secondTitle = " + secondTitle);
        BrowserUtils.sleep(2);
        Assert.assertNotEquals(firstTitle,secondTitle);
    }

}
