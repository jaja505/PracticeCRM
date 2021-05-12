package com.nextbaseCRM.step_defenitions;

import com.nextbaseCRM.pages.LoginPage;
import com.nextbaseCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions extends LoginPage {

    LoginPage loginPage = new LoginPage();

    @When("user enters hr username")
    public void user_enters_hr_username() {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("hr1"));
    }


    @When("user enters password")
    public void user_enters_password() {
loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("user should see homepage")
    public void user_should_see_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user enters marketing username")
    public void user_enters_marketing_username() {
        // Write code here that turns the phrase above into concrete actions

    }


    @When("user enters helpDesk username")
    public void user_enters_help_desk_username() {
        // Write code here that turns the phrase above into concrete actions

    }


}
