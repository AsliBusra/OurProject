package com.centrilli.stepDefs;

import com.centrilli.pages.NotesPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;

public class login_step_definition {
    NotesPage login=new NotesPage();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        String url = ConfigurationReader.getProperty("env");
        Driver.getDriver().get(url);
    }

    @Given("user enters correct username")
    public void user_enters_correct_username() {

        login.inputUsername.sendKeys("posmanager10@info.com");
    }
    @Given("user enters correct password")
    public void user_enters_correct_password() {

        login.inputPassword.sendKeys("posmanager");
    }
    @Given("user should land on the dashboard")
    public void user_should_land_on_the_dashboard() {

        login.loginButton.click();
    }


}
