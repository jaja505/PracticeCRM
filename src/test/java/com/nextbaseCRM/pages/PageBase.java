package com.nextbaseCRM.pages;

import com.nextbaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends LoginPage {


    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement btnMessageMenuTab;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement btnTaskMenuTab;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement btnEventMenuTab;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement btnPollMenuTab;

    @FindBy(id = "feed-add-post-form-tab-more")
    public WebElement btnMoreMenuTab;

    @FindBy(id = "logo_24_text")
    public WebElement btnCRM24HomePage;

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement btnActivityStream;


}
