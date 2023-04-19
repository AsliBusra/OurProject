@CENTRIL10-497
Feature: Creation of new contacts

  Jira Ticket:CENTRIL10-497
  Agile story:As a POS Manager I should be able to create CONTACTS
  AC:
  Verify that the user can create new contact
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit contact
  Verify that the user can delete contact
  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard

  @CENTRIL10-528
  Scenario:  User should be able to create new contact
    When User clicks the Contacts button
    And user clicks create button
    And user clicks name box
    And user enters any name in name box
    And user clicks the Company button
    And user selects  the company
    And user enters the Contact type
    And user enters street1 box
    And user  enters street2 box
    And user  enters city name
    And user enters the ZIP
    Then user clicks the save button

  @CENTRIL10-529
  Scenario: User should switch Kanban-List view
    When User clicks the Contacts button
    And  User clicks Kanban button
    Then the display of Contacts List changed to Kanban view
    And User clicks List  button
    Then the display of Contacts in Kanban changed to List view

  @CENTRIL10-530
  Scenario: User should discard the changes
    When User clicks the Contacts button
    And user clicks create button
    And user clicks name box
    And user enters any name in name box
    And User clicks discard button
    Then user sees the Warning message

  @CENTRIL10-531
  Scenario:  User should edit contact
    When User clicks the Contacts button
    And user clicks create button
    And user clicks name box
    And user enters any name in name box
    And user clicks the save button
    And user clicks the edit button
    And user enters new info to the street1 box
    Then user sees the changes on the contact screen

  @CENTRIL10-532
  Scenario: User should delete any contact
    When User clicks the Contacts button
    And user clicks create button
    And user clicks name box
    And user enters any name in name box
    And user clicks the save button
    And user clicks Action dropdown button
    And user select the Delete option
    And user sees  warning message as "Are you sure you want to delete this record ?"
    And user clicks Ok button and deletes previously created contact
    Then user sees the Contacts page