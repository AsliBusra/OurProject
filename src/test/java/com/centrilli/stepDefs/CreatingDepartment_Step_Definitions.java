package com.centrilli.stepDefs;

import com.centrilli.pages.DepartmentsPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CreatingDepartment_Step_Definitions {
    Faker faker = new Faker();
    String word = faker.bothify("test###");
    String number = faker.numerify("####");

    DepartmentsPage departmentsPage = new DepartmentsPage();


    @When("user clicks Employees button")
    public void user_clicks_employees_button() {

        departmentsPage.employeesButton.click();

        BrowserUtils.waitFor(2);

    }

    @When("user clicks Departments button")
    public void user_clicks_departments_button() {

        departmentsPage.departmentsButton.click();

        BrowserUtils.waitFor(2);

    }

    @When("user writes a word as Department Name in the blank")
    public void user_writes_as_department_name_in_the_blank() {

        BrowserUtils.waitFor(3);

        departmentsPage.departmentNameBlank.sendKeys(word);

        BrowserUtils.waitFor(3);

    }

    @And("user clicks Save button on the page")
    public void userClicksSaveButtonOnThePage() {

        departmentsPage.saveButton.click();

        WebElement element = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]"));
        JavascriptExecutor js = (JavascriptExecutor) Driver
                .getDriver();
        js.executeScript("arguments[0].style.visibility='visible';", element);
    }

    @Then("user should see the new Department Name on the page")
    public void userShouldSeeTheNewDepartmentNameOnThePage() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(word));

    }


    @Then("user should see the Departmens in Kanban view")
    public void userShouldSeeTheDepartmensInKanbanView() {

        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("kanban"));

    }

    @Then("user should see the Departmens in List view")
    public void userShouldSeeTheDepartmensInListView() {

        BrowserUtils.waitFor(2);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("list"));

    }

    @Then("user should see the Departments page")
    public void userShouldSeeTheDepartmentsPage() {


        BrowserUtils.waitFor(4);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Departments - Odoo";

        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @And("user writes more numbers as Department Name in the blank")
    public void userWritesMoreNumbersAsDepartmentNameInTheBlank() {

        BrowserUtils.waitFor(3);

        departmentsPage.departmentNameBlank.sendKeys(number);

        BrowserUtils.waitFor(3);

    }
}
