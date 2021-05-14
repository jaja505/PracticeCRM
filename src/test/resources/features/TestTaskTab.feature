@WIP
Feature: Task Tab
  As a user, I should be able to assign
  tasks by clicking on Task tab under Active Stream."

  Background:User should be on on the homepage
    Given User is already login
    When user is on the homepage

  Scenario: Set a task to a top priority
    When user click on High Priority checkbox from task tab
 #   Then current task should be on top priority task

  Scenario: User can see text-bar displays
    When  user click on Visual Editor from task tab
    Then user should see the editor text-bar displays on top of the message box from task tab

    Scenario: User should be able to upload and download files
      When user click on upload files icon from task tab
      Then user able to upload "file and pictures" from local disk, on the task tab
      And user able to "download" from external driver on the task tab
      And user able to Select "document" from Bitrix24 on the task tar
      And use able to create "files" to upload on the task tar

Scenario: User create a quote
  When user click on comma icon
  Then able to create a "quote" from the task tab

Scenario: User add mention
  When user click on Add mention icon
  And user select contacts from dropdown "list" from task tab
  Then use should be able to add mention from task tab

  Scenario: User attach a link
    When user click on the link icon from task tab
    Then user should be able to attach "link" from task tab

    Scenario: User should be able to create a checklist
      When user click on checklist to create a check list on task tab
      And user add a checklist "item" by click on add button or check mark
      And user add separator lines between checklist items
      Then user can delete a checklist "item" by clicking on x mark

  Scenario: User can add Deadline, Time Planning by using date choosen.
  When user can add Deadline on task tab
  And user can plan when to start and finish from time planning
  Then deadline is created







