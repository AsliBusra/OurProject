package com.centrilli.stepDefs;

import com.centrilli.pages.NotesPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Notes_Step_Definitions {
    NotesPage notesPage = new NotesPage();

    @When("user clicks Notes module button")
    public void user_clicks_notes_module_button() {
        if (notesPage.moduleNotes.isDisplayed()) {

            notesPage.moduleNotes.click();

        } else {

            notesPage.moreDropdown.click();
            notesPage.moduleNotes.click();
        }
    }

    @When("user clicks Create button")
    public void user_clicks_create_button() {

        BrowserUtils.sleep(2);
        notesPage.createButton.click();
    }

    @When("user writes {string} in the text box")
    public void user_writes_in_the_text_box(String string) {
        BrowserUtils.sleep(2);
        notesPage.textField.click();
        BrowserUtils.sleep(2);
        notesPage.textField.sendKeys(string);

    }

    @When("user clicks Save button")
    public void user_clicks_save_button() {
        BrowserUtils.sleep(2);
        notesPage.saveButton.click();
    }

    @Then("user sees new created note {string}")
    public void user_sees_new_created_note(String expected) {
        BrowserUtils.sleep(2);
        String actual = notesPage.moduleNotesTittle.getText();
        BrowserUtils.sleep(2);
        System.out.println(expected);
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }


    @When("user clicks Kanban button")
    public void user_clicks_kanban_button() {

        BrowserUtils.sleep(2);
        notesPage.kanbanButton.click();
    }

    @Then("user sees changed Notes display to Kanban")
    public void user_sees_changed_notes_display_to_kanban() {
        BrowserUtils.sleep(2);
        //Assert.assertTrue("true",notesPage.kanbanView.isDisplayed());
        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "https://qa.centrilli.com/web?#view_type=kanban&model=note.note&menu_id=194&action=220";

        Assert.assertEquals(expected, actual);


    }


    @When("user clicks List button")
    public void user_clicks_list_button() {
        BrowserUtils.sleep(2);
        notesPage.listButton.click();
    }

    @Then("user sees changed Notes display to List")
    public void user_sees_changed_notes_display_to_list() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(notesPage.listView.isDisplayed());

        /*String actual = Driver.getDriver().getCurrentUrl();

        BrowserUtils.sleep(2);

        String expected = "https://qa.centrilli.com/web?#view_type=list&model=note.note&menu_id=194&action=220";

        Assert.assertEquals(expected, actual);

         */

    }


    @When("user clicks Discard button")
    public void user_clicks_discard_button() {
        BrowserUtils.sleep(2);
        notesPage.discardButton.click();
    }

    @Then("user sees the Notes page")
    public void user_sees_the_notes_page() {
        BrowserUtils.sleep(2);
        String expected = "Notes";
        BrowserUtils.sleep(2);
        String actual = notesPage.moduleNotes.getText();

        Assert.assertEquals(expected, actual);
    }


    @When("user clicks Edit button")
    public void user_clicks_edit_button() {
        BrowserUtils.sleep(2);

        notesPage.editButton.click();
    }


    @When("user changes the text like {string} in the text box")
    public void user_changes_the_text_like_in_the_text_box(String expected) {
        BrowserUtils.sleep(2);
        notesPage.textField.click();
        BrowserUtils.sleep(2);
        notesPage.textField.clear();
        BrowserUtils.sleep(2);
        notesPage.textField.sendKeys(expected);
    }


    @When("user clicks Action dropdown")
    public void user_clicks_action_dropdown() {

        BrowserUtils.sleep(2);
        notesPage.actionButton.click();
    }

    @When("user select Delete option")
    public void user_select_delete_option() {
        BrowserUtils.sleep(2);
        notesPage.delete.click();
    }

    @When("user sees this warning message {string}")
    public void user_sees_this_warning_message(String expected) {
        BrowserUtils.sleep(2);
        notesPage.warningMessage.isDisplayed();
        BrowserUtils.sleep(2);
        String actual = notesPage.warningMessage.getText();
        Assert.assertEquals(expected, actual);

    }

    @When("user clicks Ok button and deletes newly created note")
    public void user_clicks_ok_button_and_deletes_newly_created_note() {
        BrowserUtils.sleep(2);
        notesPage.okButton.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(notesPage.moduleNotes.isDisplayed());
    }
}
