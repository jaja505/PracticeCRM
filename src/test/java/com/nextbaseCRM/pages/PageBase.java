package com.nextbaseCRM.pages;

import com.nextbaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {


    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement btnTaskMenuTab;


}
