package com.centrilli.stepDefs;

import com.centrilli.pages.PurchaseVendorPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class PurchaseVendor_Step_Def {
    com.centrilli.pages.PurchaseVendorPage PurchaseVendorPage = new PurchaseVendorPage();
    //  Background: Login to the dashboard

    @Given("user is on Vendors page")
    public void user_is_on_purchases_vendors_page() {
        BrowserUtils.sleep(10);
        PurchaseVendorPage.PurchasesButton.click();
        BrowserUtils.sleep(10);
        PurchaseVendorPage.VendorsButton.click();
        BrowserUtils.sleep(10);
        Assert.assertTrue(PurchaseVendorPage.VendorsPage.isDisplayed());
    }

    @When("user enters {string} onto name field")
    public void user_enters_onto_name_field(String Name) {
        BrowserUtils.sleep(10);
        PurchaseVendorPage.NameInputBox.click();
        PurchaseVendorPage.NameInputBox.sendKeys(Name + Keys.ENTER);

    }

    @Then("user sees {string} as newly created Vendor")
    public void user_sees_as_newly_created_vendor_bill(String NewlyCreatedName) {
        BrowserUtils.sleep(10);
        Assert.assertEquals(PurchaseVendorPage.NewlyCreatedVendor.getText(), NewlyCreatedName);
    }


    @Then("user sees changed Vendors display to List")
    public void userSeesChangedVendorsDisplayToList() {
        BrowserUtils.sleep(10);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("list"));
    }


    @Then("user sees changed Vendors display to Kanban")
    public void userSeesChangedVendorsDisplayToKanban() {

        BrowserUtils.sleep(10);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("kanban"));
    }

    @Then("user sees the Vendors page")
    public void userSeesTheVendorsPage() {
        BrowserUtils.sleep(10);
        Assert.assertTrue(PurchaseVendorPage.VendorsPage.isDisplayed());
    }

    @And("user changes the text to {string} in the text box")
    public void userChangesTheTextToInTheTextBox(String editName) {
        BrowserUtils.sleep(10);
        PurchaseVendorPage.NameInputBox.clear();
        BrowserUtils.sleep(10);
        PurchaseVendorPage.NameInputBox.sendKeys(editName + Keys.ENTER);

    }

    @And("user clicks Ok button and deletes newly created Vendor")
    public void userClicksOkButtonAndDeletesNewlyCreatedVendorBill() {
        BrowserUtils.sleep(5);
        PurchaseVendorPage.okButton.click();
    }


    @Then("user sees the newly created Vendor Bill {string} is deleted")
    public void userSeesTheNewlyCreatedVendorBillIsDeleted(String Deleted) {
        BrowserUtils.sleep(5);
        Assert.assertNotEquals(PurchaseVendorPage.NewlyCreatedVendor.getText(), Deleted);
    }

    @When("user clicks on right button")
    public void user_clicks_on_right_button() {
        BrowserUtils.sleep(5);
        PurchaseVendorPage.NextBtn.click();
    }

    @Then("user is directed to the next records page")
    public void user_is_directed_to_the_next_records_page() {
        BrowserUtils.sleep(8);
        Assert.assertEquals("81-160",PurchaseVendorPage.RecordsPage.getText());
    }

    @Then("user clicks on left button")
    public void user_clicks_on_left_button() {
        BrowserUtils.sleep(5);
        PurchaseVendorPage.PreviousBtn.click();
    }

    @Then("user is directed to the first records page")
    public void user_is_directed_to_the_first_records_page() {
        BrowserUtils.sleep(8);
        Assert.assertEquals("1-80",PurchaseVendorPage.RecordsPage.getText());
    }

}
