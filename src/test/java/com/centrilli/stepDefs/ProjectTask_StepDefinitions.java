package com.centrilli.stepDefs;

import com.centrilli.pages.ProjectTaskPage;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProjectTask_StepDefinitions {
    ProjectTaskPage projectTaskPage = new ProjectTaskPage();

    @When("user clicks Project Module button")
    public void user_clicks_project_module_button() {
        projectTaskPage.ProjectModule.click();

    }
    @And("user clicks Tasks button")
    public void user_clicks_tasks_button() {
        projectTaskPage.TasksButton.click();

    }
    @And("user writes FERİHA in the Task Title field")
    public void user_writes_feriha_in_the_task_title_field() {
        BrowserUtils.sleep(3);
        projectTaskPage.TaskTitleField.sendKeys("FERİHA");

    }
    @Then("user sees new created task FERİHA")
    public void user_sees_new_created_task_feriha() {
        BrowserUtils.sleep(2);
        String actual = projectTaskPage.NewTaskFERIHA.getText();
        BrowserUtils.sleep(2);
        System.out.println("FERİHA");
        System.out.println(actual);

        Assert.assertEquals("FERİHA", actual);


    }

    @And("user should see tasks with the List view")
    public void userShouldSeeTasksWithTheListView() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(projectTaskPage.listView.isDisplayed());
    }

    @Then("user should see tasks with the Kanban Board")
    public void userShouldSeeTasksWithTheKanbanBoard() {
        BrowserUtils.sleep(2);
        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "https://qa.centrilli.com/web?#view_type=kanban&model=project.task&menu_id=336&action=460";
        Assert.assertEquals(expected, actual);

    }


    @When("user clicks FERİHA task")
    public void userClicksFERİHATask() {
        projectTaskPage.NewTaskFERIHA.click();

    }

    @And("user clicks in Description field")
    public void userClicksInDescriptionField() {
        projectTaskPage.DescriptionField.click();

    }

    @And("user writes FERİHA in Description field")
    public void userWritesFERİHAInDescriptionField() {
        projectTaskPage.DescriptionField.sendKeys("FERİHA");
    }

    @And("user sees the warning message")
    public void userSeesTheWarningMessage() {
    }

    @And("user writes DDDD in the Task Title field")
    public void userWritesDDDDInTheTaskTitleField() {
        projectTaskPage.TaskTitleField.sendKeys("DDDD");

    }


    @Then("user clicks Ok button and deletes newly created task")
    public void userClicksOkButtonAndDeletesNewlyCreatedTask() {

        projectTaskPage.okButton.click();

    }
}
