package com.nextbaseCRM.pages;

import com.nextbaseCRM.utilities.ConfigurationReader;
import com.nextbaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name ="USER_LOGIN" )
    public WebElement inputUsername;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement btnLogin;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPassword;

    @FindBy(id = "USER_REMEMBER")
    public WebElement checkboxRememberMe;


    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }

    public void login(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("helpDesk1"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        btnLogin.click();
    }




}
