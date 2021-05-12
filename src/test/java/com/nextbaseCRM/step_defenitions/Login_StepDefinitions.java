package com.nextbaseCRM.step_defenitions;

import com.nextbaseCRM.pages.LoginPage;
import com.nextbaseCRM.utilities.BrowserUtils;
import com.nextbaseCRM.utilities.ConfigurationReader;
import com.nextbaseCRM.utilities.Driver;
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
        BrowserUtils.URLVerification("https://login1.nextbasecrm.com/");

    }


    @When("user enters marketing username")
    public void user_enters_marketing_username() {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("marketing1"));

    }


    @When("user enters helpDesk username")
    public void user_enters_help_desk_username() {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("helpDesk1"));

    }


}
