Feature: Task Tab
  As a user, I should be able to assign
  tasks by clicking on Task tab under Active Stream."

  Background:User should be on on the homepage
    Given User is already login
    When user is on the homepage

  Scenario: Set a task to a top priority
    When user click on ""High Priority"" checkbox
    Then current task should be on top priority task

  Scenario: User can see text-bar displays
    When  user click on Visual Editor
    Then user should see the editor text-bar displays on top of the message box

    Scenario: User should be able to upload and download files
      When user click on upload files icon
      Then user able to upload "file and pictures" from local disk,
      And user able to "download" from external driver
      And user able to Select "document" from Bitrix24
      And use able to create "files" to upload

Scenario: User create a quote
  When user click on Comma icon
  Then able to create a "quote"

Scenario: User add mention
  When user click on Add mention icon
  And user select contacts from dropdown "list" from  mention icon
  Then use should be able to add mention



  5. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
  6. User should be able to attach link by clicking on the link icon.
  7. User should be able to click on ""Checklist"" to create checklists items(Things to do). User can add a checklist item by clicking on add button or check mark. User can add separator lines between checklist items. User can delete a checklist item by clicking on x mark.
  8. User can assign the tasks to employees by clicking on Add More and selecting contact from E-mail user, Employees and Departments and Recent contact lists. Employees can be added in different assignment categories: Created By, Participants and Observer.
  9. User can add Deadline, Time Planningby using date pickers.
  10. User can click on More to specify the task details."





  //  @hr

  Scenario: Login as hr
    When user enters hr username
    And user enters password
    Then user should see homepage