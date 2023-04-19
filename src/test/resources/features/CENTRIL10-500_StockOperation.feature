@CENTRIL10-512
Feature: Inventory / Transfers / Stock operation functionality and verifications

  1.Verify that the user can create new Stock operation
  2.Verify that the user can switch Kanban-List view
  3.Verify that the user can discard changes
  4.Verify that the user can edit Stock operation
  5.Verify that the user can delete Stock operation

  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard

  @CENTRIL10-507
  Scenario: User should be able to create new Stock Operation
    When user clicks Inventory module
    And user clicks Transfer button
    And  user clicks create button
    And user selects first option from partner dropdown
    And user clicks Additional Info button
    And user select first option from the operation type dropdown
    And user clicks save button
    Then user should create her new Stock Operation

  @CENTRIL10-508
  Scenario: Verify user can switch Kanban-List view
    When user clicks Inventory module
    And user clicks Transfer button
    And user clicks kanban button
    And user should see stocks with the Kanban Board
    And user clicks List view button
    Then user should see stocks with the List view

  @CENTRIL10-509
  Scenario: User should be able to discard the changes
    When user clicks Inventory module
    And user clicks Transfer button
    And  user clicks Create button
    And user clicks source document box and write the document number
    And user clicks discard button
    And user should see the warning message
    And user accept the alert
    Then user should be on the stock operations page

  @CENTRIL10-510 @wip
  Scenario: User should be able to edit her stock
    When user clicks Inventory module
    And user clicks Transfer button
    And  user select first operation
    And user clicks Edit button
    And user clicks noteButton
    And user clicks noteBox and write "Hello new one!"
    And user clicks save button
    Then user should see the changes about her stock

  @CENTRIL10-511 @urgent @bug
  Scenario: User should be able to delete a stock operation
    # In this scenario, the user needs to be able to delete their stock.
    # However, the user cannot delete a stock move set to 'Done'.
    When user clicks Inventory module
    And user clicks Transfer button
    And user select first operation
    And user clicks Action dropdown
    And user select Delete option
    And user sees this warning message "Are you sure you want to delete this record ?"
    And user clicks Ok button
    And user should see an warning message saying "You cannot cancel a stock move that has been set to 'Done'."
    And user clicks Ok button
    Then user should be on the transfers page






