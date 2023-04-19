Feature: Pos manager should be able to create Project / Task
  Verify that the user can create new task
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit task
  Verify that the user can delete task


  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard


  Scenario: Verify user can create new task
    When user clicks Project Module button
    And user clicks Tasks button
    And user clicks List button
    And user clicks Create button
    And user writes FERİHA in the Task Title field
    And user clicks Save button
    Then user sees new created task FERİHA


  Scenario: Verify user can switch Kanban-List view
    When user clicks Project Module button
    And user clicks Tasks button
    When user clicks list button
    And user should see tasks with the List view
    And user clicks kanban button
    Then user should see tasks with the Kanban Board


  Scenario: User can edit Task
    When user clicks Project Module button
    And user clicks Tasks button
    And user clicks FERİHA task
    And user clicks Edit button
    And user clicks in Description field
    And user writes FERİHA in Description field
    Then user clicks Save button


  Scenario: User can discard changes
    When user clicks Project Module button
    And user clicks Tasks button
    And user clicks List button
    And user clicks Create button
    And user writes FERİHA in the Task Title field
    And user clicks Discard button
    And user sees the warning message
    Then user clicks Ok button


  Scenario: User can delete Task
    When user clicks Project Module button
    And user clicks Tasks button
    And user clicks List button
    And user clicks Create button
    And user writes DDDD in the Task Title field
    And user clicks Save button
    And user clicks Action dropdown
    And user select Delete option
    Then user clicks Ok button and deletes newly created task






