package com.centrilli.stepDefs;

import com.centrilli.pages.EmployeesPage;
import com.centrilli.pages.ManufacturingPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Employees_StepDefinitions {
    ManufacturingPage manufacturingPage=new ManufacturingPage();
    EmployeesPage employeesPage=new EmployeesPage();
    Faker faker = new Faker();

    @When("user clicks Employees module button")
    public void user_clicks_employees_module_button() {
        if (employeesPage.employees_moduleButton.isDisplayed()) {
            employeesPage.employees_moduleButton.click();
        } else {
            employeesPage.moreDropdown.click();
            employeesPage.employees_moduleButton.click();
        }
    }
    @When("user types {string} on badge name area")
    public void user_types_on_badge_name_area(String string) {
        employeesPage.badge_inputField.sendKeys(string);
    }
    @Then("user sees his recently created badge on the page")
    public void user_sees_his_recently_created_badge_on_the_page() {
        BrowserUtils.sleep(2);
        String expectedBadgeTitle = employeesPage.created_manufacturingOrderTitle.getText();
        System.out.println("expectedBadgeTitle = " + expectedBadgeTitle);
        String actualBadgeTitle = Driver.getDriver().getTitle();
        System.out.println("actualBadgeTitle = " + actualBadgeTitle);
        Assert.assertTrue(actualBadgeTitle.contains(expectedBadgeTitle));
    }

    @Then("the display of Badges List changed to Kanban view")
    public void the_display_of_badges_list_changed_to_kanban_view() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(employeesPage.kanban_View.isDisplayed());
    }
    @Then("Badges are displayed in List view")
    public void badges_are_displayed_in_list_view() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(employeesPage.listView.isDisplayed());
    }
    @When("user finds his Badges and clicks on it")
    public void user_finds_his_badges_and_clicks_on_it() {
        employeesPage.listButton.click();
        BrowserUtils.sleep(2);
        employeesPage.listedBrokenBudgesTitle.click();
    }

    @And("user types a new product  name")
    public void userSelectsANewProductName() {
        employeesPage.badge_inputField.clear();
        BrowserUtils.sleep(2);
        employeesPage.badge_inputField.sendKeys("New answers");
    }

    @Then("user makes sure his edited Badge {string} is listed")
    public void userMakesSureHisEditedBadgeIsListed(String string) {
        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.click();

        // String = broken reference title: "TY/2023/0175" -bug
        // String = safe reference title: "TY/2019/0035"
        BrowserUtils.sleep(2);
        manufacturingPage.SearchButton.sendKeys(string + Keys.ENTER);

        BrowserUtils.sleep(2);
        Assert.assertTrue(employeesPage.getListedBrokenBudgesTitle.isDisplayed());

    }

    @And("user goes back to {string}  page")
    public void userGoesBackToPage(String string) {
        // String = "Manufacturing Orders" (submodule of Manufacturing, located under Operations)
        BrowserUtils.sleep(2);
        employeesPage.OperationsBudgesSubmoduleButton.click();
    }

    @And("user click Budges subModule button")
    public void userClickBudgesSubModuleButton() {
        BrowserUtils.sleep(2);
        employeesPage.badge_subModule.click();
    }
}
