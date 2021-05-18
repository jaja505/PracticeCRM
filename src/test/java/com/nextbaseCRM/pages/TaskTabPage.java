package com.nextbaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskTabPage extends PageBase {

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement checkboxHighPriority;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement btlVisualEditor;

    @FindBy(id = "bx-html-editor-tlbr-cnt-lifefeed_task_form")
    public WebElement barVisualEditor;

    @FindBy( id= "bx-b-uploadfile-task-form-lifefeed_task_form")
    public WebElement btlUploadFile;

    @FindBy(xpath = "(//table[@class='diskuf-selector-table wd-fa-add-file-light-table'])[5]")
    public WebElement displayUploadFilesOption;

    @FindBy(xpath = "(//div[@class='diskuf-uploader'])[5]")
    public WebElement btlUploadFilesAndImages;





}
