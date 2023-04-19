package com.centrilli.stepDefs;

import com.centrilli.pages.ContactCreationPage;
import com.centrilli.pages.RepairOrderPage;
import com.centrilli.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class repairOrder_step_definition {
    RepairOrderPage repairOrderPage=new RepairOrderPage();

    ContactCreationPage contactCreationPage=new ContactCreationPage();

    Faker faker=new Faker();
    @When("user clicks {string} icon")
    public void userClicksIcon(String repairExpected) {
        repairOrderPage.repairIcon.click();

    }

    @Then("user clicks {string} button")
    public void userClicksButton(String crateButton) {
        BrowserUtils.waitForClickablility(repairOrderPage.createButton,5);
        repairOrderPage.createButton.click();
    }

    @And("user types {string} in the repair reference field.")
    public void userTypesInTheRepairReferenceField(String repairReference) {

        // BrowserUtils.waitForVisibility(repairOrderPage.repairReference,5);
        repairOrderPage.repairReference.clear();
        repairOrderPage.repairReference.sendKeys(faker.name().fullName());
    }



    @Then("user types {string} in the product to repair field")
    public void userTypesInTheProductToRepairField(String productToReferenceExpected) {
        // repairOrderPage.productToRepair.sendKeys(productToReferenceExpected+ Keys.ENTER);
        repairOrderPage.dropdown.click();
        repairOrderPage.createAndEdit.click();

        repairOrderPage.productNameField.sendKeys(faker.name().fullName());
        BrowserUtils.waitForClickablility(repairOrderPage.saveBTN2,5);

        repairOrderPage.saveBTN2.click();
    }


    @And("user clicks save button")
    public void userClicksSaveButton() {
        repairOrderPage.saveButton.click();

    }


    @Then("verify user creates new repair order")
    public void verifyUserCreatesNewRepairOrder() {
        String expectedText="Repair Orders";
        String actualText=repairOrderPage.verificationRepairOrder.getText();
        Assert.assertEquals(expectedText,actualText);

    }

    @Then("user clicks list button")
    public void userClicksListButton() {
        BrowserUtils.waitForVisibility(repairOrderPage.listButton,5);
        repairOrderPage.listButton.click();
    }

    @And("user verifies to change on the list page")
    public void userVerifiesToChangeOnTheListPage() {

        String expectedTextList="Colton Davis";
        String actualTextList=repairOrderPage.verificationList.getText();
        System.out.println("expectedTextList = " + expectedTextList);
        System.out.println("actualTextList = " + actualTextList);
        BrowserUtils.waitForClickablility(repairOrderPage.verificationList,5);
        Assert.assertEquals(expectedTextList,actualTextList);
    }

    @When("user clicks kanban button")
    public void userClicksKanbanButton() {
        BrowserUtils.waitForVisibility(repairOrderPage.kanbanButton,5);
        repairOrderPage.kanbanButton.click();
    }

    @And("user verifies to change on the kanban page")
    public void userVerifiesToChangeOnTheKanbanPage() {

        String expectedTextKanban="Wyatt Huel IV";
        String actualTextKanban=repairOrderPage.verificationKanban.getText();

        System.out.println("expectedTextKanban = " + expectedTextKanban);
        System.out.println("actualTextKanban = " + actualTextKanban);
        BrowserUtils.waitForClickablility(repairOrderPage.verificationKanban,5);
        Assert.assertEquals(expectedTextKanban,actualTextKanban);


    }

    @And("user clicks Discard ıcon")
    public void userClicksDiscardIcon() {
        BrowserUtils.waitForVisibility(repairOrderPage.discardButton,3);
        repairOrderPage.discardButton.click();
    }

    @Then("user sees the repair  page")
    public void userSeesTheRepairPage() {

        String expectedDiscardText="Hong Mitchell";
        String actualDiscardText=repairOrderPage.verificationDiscard.getText();

        BrowserUtils.waitForClickablility(repairOrderPage.verificationDiscard,5);

        Assert.assertEquals(expectedDiscardText,actualDiscardText);
    }

    @When("user clicks edit ıcon")
    public void userClicksEditIcon() {
        BrowserUtils.waitForVisibility(repairOrderPage.editButton,5);
        repairOrderPage.editButton.click();
    }

    @Then("user cleans the Repair Reference field")
    public void userCleansTheRepairReferenceField() {
        BrowserUtils.waitForVisibility(repairOrderPage.repairReference,3);
        repairOrderPage.repairReference.clear();

        repairOrderPage.repairReference.sendKeys(faker.name().fullName());
        //BrowserUtils.waitForClickablility(repairOrderPage.saveButton,5);
        //repairOrderPage.saveButton.click();
    }


    @Then("user sees error message")
    public void userSeesErrorMessage() {
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals("The following fields are invalid:",repairOrderPage.errorMsg.getText());
    }
}
