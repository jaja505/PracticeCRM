@login
Feature: NextBaseCRM login feature
  As a user, I should be able to login with correct credentials to different account.
  Account are: hr, marketing, helpDesk


  @hr
  Scenario: Login as hr
    When user enters hr username
    And user enters password
    Then user should see homepage

  @marketing
  Scenario: Login as marketing
    When user enters marketing username
    And user enters password
    Then user should see homepage

  @helpDesk
  Scenario: Login as helpDesk
    When user enters helpDesk username
    And user enters password
    Then user should see homepage