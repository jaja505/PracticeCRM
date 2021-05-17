package com.nextbaseCRM.step_defenitions;

import com.nextbaseCRM.pages.TaskTabPage;
import com.nextbaseCRM.utilities.BrowserUtils;
import com.nextbaseCRM.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class TestTaskTab_StepDefinitions extends TaskTabPage {

    TaskTabPage taskTabPage = new TaskTabPage();

    @Given("User is already login")
    public void user_is_already_login() {
        taskTabPage.login();
        BrowserUtils.sleep(1);
        BrowserUtils.waitUntilUrlToBe("https://login1.nextbasecrm.com/stream/?login=yes");
        Assert.assertTrue(BrowserUtils.getCurrentPageURL().contains("https://login1.nextbasecrm.com/stream/"));
    }


    @When("user is on the homepage")
    public void user_is_on_the_homepage() {
        BrowserUtils.sleep(1);
        if (!BrowserUtils.getCurrentPageURL().contains("https://login1.nextbasecrm.com/stream/")) {
            taskTabPage.btnTaskMenuTab.click();
        }
        Assert.assertTrue(BrowserUtils.getCurrentPageURL().contains("https://login1.nextbasecrm.com/stream/"));

    }

    @When("user click on High Priority checkbox from task tab")
    public void user_click_on_high_priority_checkbox_from_task_tab() {
        taskTabPage.btnTaskMenuTab.click();
        taskTabPage.checkboxHighPriority.click();
        taskTabPage.checkboxHighPriority.getAttribute("value");

        Assert.assertEquals(taskTabPage.checkboxHighPriority.getAttribute("value"),"on"
        );
    }

    @When("user click on Visual Editor from task tab")
    public void user_click_on_visual_editor_from_task_tab() {
        taskTabPage.btnTaskMenuTab.click();
        taskTabPage.btlVisualEditor.click();
        Assert.assertTrue(taskTabPage.barVisualEditor.isDisplayed());

    }

    @Then("user should see the editor text-bar displays on top of the message box from task tab")
    public void user_should_see_the_editor_text_bar_displays_on_top_of_the_message_box_from_task_tab() {
        Assert.assertTrue(taskTabPage.barVisualEditor.isDisplayed());
    }


    @When("user click on upload files icon from task tab")
    public void user_click_on_upload_files_icon_from_task_tab() {

    }

    @Then("user able to upload {string} from local disk, on the task tab")
    public void user_able_to_upload_from_local_disk_on_the_task_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user able to {string} from external driver on the task tab")
    public void user_able_to_from_external_driver_on_the_task_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user able to Select {string} from Bitrix24 on the task tar")
    public void user_able_to_select_from_bitrix24_on_the_task_tar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("use able to create {string} to upload on the task tar")
    public void use_able_to_create_to_upload_on_the_task_tar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click on comma icon")
    public void user_click_on_comma_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("able to create a {string} from the task tab")
    public void able_to_create_a_from_the_task_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click on Add mention icon")
    public void user_click_on_add_mention_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user select contacts from dropdown {string} from task tab")
    public void user_select_contacts_from_dropdown_from_task_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("use should be able to add mention from task tab")
    public void use_should_be_able_to_add_mention_from_task_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user click on the link icon from task tab")
    public void user_click_on_the_link_icon_from_task_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to attach {string} from task tab")
    public void user_should_be_able_to_attach_from_task_tab(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user click on checklist to create a check list on task tab")
    public void user_click_on_checklist_to_create_a_check_list_on_task_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add a checklist {string} by click on add button or check mark")
    public void user_add_a_checklist_by_click_on_add_button_or_check_mark(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add separator lines between checklist items")
    public void user_add_separator_lines_between_checklist_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can delete a checklist {string} by clicking on x mark")
    public void user_can_delete_a_checklist_by_clicking_on_x_mark(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user can add Deadline on task tab")
    public void user_can_add_deadline_on_task_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user can plan when to start and finish from time planning")
    public void user_can_plan_when_to_start_and_finish_from_time_planning() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("deadline is created")
    public void deadline_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
