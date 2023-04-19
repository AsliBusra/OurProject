package com.centrilli.stepDefs;

import com.centrilli.pages.StockOprPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class StockOperation_StepDefinitions {
    StockOprPage stockOprPage = new StockOprPage();
    Faker faker = new Faker();


    @When("user clicks Inventory module")
    public void user_clicks_ınventory_module() {
        BrowserUtils.sleep(3);
        stockOprPage.inventoryModule.click();
    }

    @When("user clicks Transfer button")
    public void user_clicks_transfer_button() {
        BrowserUtils.sleep(3);
        stockOprPage.transfersButton.click();
    }


    @When("user clicks Additional Info button")
    public void user_clicks_additional_ınfo_button() {
        BrowserUtils.sleep(3);
        stockOprPage.additionalInfo.click();
        BrowserUtils.sleep(3);
    }


    @Then("user should create her new Stock Operation")
    public void user_should_create_her_new_stock_operation() {
        Assert.assertFalse(stockOprPage.operationName.getText().equals("New"));
    }


    @And("user select first option from the operation type dropdown")
    public void userSelectFirstOptionFromTheOperationTypeDropdown()
            throws InterruptedException {
        stockOprPage.additionalInfo.click();
        BrowserUtils.waitFor(3);
        int xTimesDown = faker.number().numberBetween(1, 7);
        for (int i = 0; i < xTimesDown; i++) {
            stockOprPage.additionalInfoDropdown.sendKeys(Keys.DOWN);
        }
        BrowserUtils.waitFor(3);
        stockOprPage.additionalInfoDropdown.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);

    }


    @When("user should see stocks with the Kanban Board")
    public void user_should_see_stocks_with_the_kanban_board() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(stockOprPage.kanbanView.isDisplayed());
        BrowserUtils.sleep(2);
    }

    @When("user clicks List view button")
    public void user_clicks_list_view_button() {
        BrowserUtils.sleep(3);
        stockOprPage.listButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should see stocks with the List view")
    public void user_should_see_stocks_with_the_list_view() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(stockOprPage.listView.isDisplayed());
        BrowserUtils.sleep(2);
    }


    @And("user clicks source document box and write the document number")
    public void userClicksSourceDocumentBoxAndWriteTheDocumentNumber() {
        BrowserUtils.sleep(3);
        stockOprPage.sourceDocumentButton.click();
        BrowserUtils.sleep(3);
        stockOprPage.sourceDocumentButton.sendKeys("4170");
    }

    @When("user clicks discard button")
    public void user_clicks_discard_button() {
        BrowserUtils.sleep(3);
        stockOprPage.discardButton.click();
        BrowserUtils.sleep(3);
    }

    @When("user should see the warning message")
    public void user_should_see_the_warning_message() {
        BrowserUtils.sleep(3);
        stockOprPage.warningMessage.isDisplayed();
        BrowserUtils.sleep(3);
    }

    @When("user accept the alert")
    public void user_accept_the_alert() {
        BrowserUtils.sleep(3);
        stockOprPage.okButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("user should be on the stock operations page")
    public void user_should_be_on_the_stock_operations_page() {

        String expectTitleText = "Stock Operations";
        String actualTitleText = stockOprPage.pageTitle.getText();
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectTitleText, actualTitleText);
    }

    @When("user select first operation")
    public void user_select_first_operation() {
        BrowserUtils.sleep(3);
        stockOprPage.firstOperation.click();
        BrowserUtils.sleep(3);
    }

    @When("user clicks source document box")
    public void user_clicks_source_document_box() {
        BrowserUtils.sleep(3);
        stockOprPage.sourceDocumentButton.click();
        BrowserUtils.sleep(3);
    }

    @When("user cleans document number and write the new one")
    public void user_cleans_document_number_and_write_the_new_one() {
        BrowserUtils.sleep(3);
        stockOprPage.sourceDocumentButton.clear();
        BrowserUtils.sleep(3);
        stockOprPage.sourceDocumentButton.sendKeys("4170");
    }

    @Then("user should see the changes about her source document")
    public void user_should_see_the_changes_about_her_source_document() {
        String expectedSourceDocumentNumber = "4170";
        String actualSourceDocumentNumber = stockOprPage.newSourceDocumentNumber.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedSourceDocumentNumber, actualSourceDocumentNumber);
    }


    @When("user clicks noteButton")
    public void user_clicks_note_button() {
        BrowserUtils.sleep(2);
        stockOprPage.noteButton.click();
        BrowserUtils.sleep(2);
    }

    @And("user clicks noteBox and write {string}")
    public void userClicksNoteBoxAndWrite(String arg0) {
        BrowserUtils.sleep(2);
        stockOprPage.noteBox.click();
        BrowserUtils.sleep(2);
        stockOprPage.noteBox.clear();
        BrowserUtils.sleep(2);
        stockOprPage.noteBox.sendKeys("Hello new one!");
    }

    @Then("user should see the changes about her stock")
    public void user_should_see_the_changes_about_her_stock() {
        String expectedNote = "Hello new one!";
        String actualNote = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div[4]/span")).getText();
        Assert.assertEquals(expectedNote, actualNote);
    }


    @When("user clicks Ok button and deletes operation")
    public void user_clicks_ok_button_and_deletes_operation() {
        BrowserUtils.sleep(3);
        stockOprPage.okButton.click();
        BrowserUtils.sleep(3);
    }


    @When("user clicks Ok button")
    public void user_clicks_ok_button() {
        BrowserUtils.sleep(3);
        stockOprPage.okButton.click();
        BrowserUtils.sleep(3);
    }

    @When("user should see an warning message saying {string}")
    public void user_should_see_an_warning_message_saying(String string) {
        String expectedWarningMessage = "You cannot cancel a stock move that has been set to 'Done'.";
        String actualWarningMessage = stockOprPage.warningMessageForTheDeleteStock.getText();
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedWarningMessage, actualWarningMessage);
    }


    @Then("user should be on the transfers page")
    public void userShouldBeOnTheTransfersPage() {
        String expectedTitle = "Stock Operations";
        String actualTitle = stockOprPage.pageTitleWithOperationName.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @And("user selects first option from partner dropdown")
    public void userSelectsFirstOptionFromPartnerDropdown() throws InterruptedException {
        stockOprPage.partnerDropdown.click();
        BrowserUtils.waitFor(3);
        int xTimesDown = faker.number().numberBetween(1, 7);
        for (int i = 0; i < xTimesDown; i++) {
            stockOprPage.partnerDropdown.sendKeys(Keys.DOWN);
        }
        BrowserUtils.waitFor(3);
        stockOprPage.partnerDropdown.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);

    }
}
