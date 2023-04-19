package com.centrilli.stepDefs;

import com.centrilli.pages.ContactCreationPage;
import com.centrilli.pages.ManufacturingPage;
import com.centrilli.pages.NotesPage;
import com.centrilli.pages.RepairOrderPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreatingContactsStepDef {
    ContactCreationPage contactCreationPage=new ContactCreationPage();
    Faker faker=new Faker();

    RepairOrderPage repairOrderPage=new RepairOrderPage();
    ManufacturingPage manufacturingPage=new ManufacturingPage();

    //created this object for the delete button to be used
    NotesPage notesPage=new NotesPage();
    Actions actions= new Actions(Driver.getDriver());

    @When("User clicks the Contacts button")
    public void userClicksTheContactsButton() {
        BrowserUtils.waitForVisibility(contactCreationPage.contactsButton,5);
        contactCreationPage.contactsButton.click();
    }


    @When("user clicks create button")
    public void user_clicks_create_button() {
        contactCreationPage.createButton.click();

    }
    @When("user clicks name box")
    public void user_clicks_name_box() {
        contactCreationPage.nameBox.click();

    }
    @When("user enters any name in name box")
    public void user_enters_any_name_in_name_box() {
        contactCreationPage.nameBox.sendKeys("South Wind");
    }

    @When("user clicks the Company button")
    public void user_clicks_the_company_button() {


        BrowserUtils.waitFor(3);
        contactCreationPage.companyButton.click();

    }
    @When("user selects  the company")
    public void user_selects_the_company() {
        BrowserUtils.waitFor(2);
        repairOrderPage.createAndEdit.click();
        contactCreationPage.nameOfCompanyBox.sendKeys(faker.company().name());
        repairOrderPage.saveBTN2.click();

    }
    @And("user enters the Contact type")
    public void userEntersTheContactType() {
        contactCreationPage.adressType.click();
        BrowserUtils.waitFor(3);
        Select contactType=new Select(contactCreationPage.adressType);
        contactType.selectByVisibleText("Invoice address");
    }
    @When("user enters street1 box")
    public void user_enters_street1_box() {
        BrowserUtils.waitFor(3);
        contactCreationPage.street1Button.click();
        contactCreationPage.street1Button.sendKeys(faker.address().streetAddress());
    }
    @When("user  enters street2 box")
    public void user_enters_street2_box() {
        contactCreationPage.street2Button.sendKeys(faker.address().streetAddress());
    }
    @When("user  enters city name")
    public void user_enters_city_name() {
        contactCreationPage.cityButton.sendKeys(faker.address().city());
    }



    @When("user enters the ZIP")
    public void user_enters_the_zıp() {
        contactCreationPage.zipCodeBox.sendKeys(faker.address().zipCode());
    }


    @Then("user clicks the save button")
    public void user_clicks_the_save_button() {
        contactCreationPage.saveButton.click();
    }


    @And("User clicks Kanban button")
    public void userClicksKanbanButton() {
        contactCreationPage.kanbanButton.click();
    }

    @Then("the display of Contacts List changed to Kanban view")
    public void theDisplayOfContactsListChangedToKanbanView() {
        BrowserUtils.waitFor(3);
        String actual = Driver.getDriver().getCurrentUrl();
        String expected="https://qa.centrilli.com/web?#view_type=kanban&model=res.partner&menu_id=69&action=77";
        Assert.assertEquals(expected,actual);
    }

    @And("User clicks List  button")
    public void userClicksListButton() {
        contactCreationPage.listButton.click();
    }

    @Then("the display of Contacts in Kanban changed to List view")
    public void theDisplayOfContactsInKanbanChangedToListView() {
        BrowserUtils.waitFor(3);
        String actual = Driver.getDriver().getCurrentUrl();
        String expected="https://qa.centrilli.com/web?#view_type=list&model=res.partner&menu_id=69&action=77";
        Assert.assertEquals(expected,actual);
    }
    @And("User clicks discard button")
    public void userClicksDiscardButton() {
        BrowserUtils.waitFor(3);
        contactCreationPage.discardButton.click();
    }

    @Then("user sees the Warning message")
    public void userSeesTheWarningMessage() {
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals("The record has been modified, your changes will be discarded. Do you want to proceed?",contactCreationPage.warningOfDiscard.getText());
    }


    @And("user clicks the edit button")
    public void userClicksTheEditButton() {
        contactCreationPage.editButton.click();

    }

    @And("user enters new info to the street{int} box")
    public void userEntersNewInfoToTheStreetBox(int street) {
        BrowserUtils.waitFor(3);
        contactCreationPage.street1Button.sendKeys("ilave");
        contactCreationPage.saveButton.click();
    }



    @Then("user sees the changes on the contact screen")
    public void userSeesTheChangesOnTheContactScreen() {
        Assert.assertEquals("ilave",contactCreationPage.updatedAdressButton.getText());
    }

    @And("user clicks Action dropdown button")
    public void userClicksActionDropdownButton() {
        BrowserUtils.waitFor(3);
        contactCreationPage.actionButton.click();
    }

    @And("user select the Delete option")
    public void userSelectTheDeleteOption() {
        BrowserUtils.waitFor(3);
        notesPage.delete.click();
    }

    @And("user sees  warning message as {string}")
    public void userSeesWarningMessageAs(String arg0) {
        Assert.assertEquals("Are you sure you want to delete this record ?",contactCreationPage.warningMessage.getText());
    }

    @And("user clicks Ok button and deletes previously created contact")
    public void userClicksOkButtonAndDeletesPreviouslyCreatedContact() {
        contactCreationPage.okButton.click();

    }

    @Then("user sees the Contacts page")
    public void userSeesTheContactsPage() {
        Assert.assertTrue(contactCreationPage.contactsButton.isDisplayed());
    }

}
