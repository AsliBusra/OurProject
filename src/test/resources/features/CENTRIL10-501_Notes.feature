@CENTRIL10-526
Feature: Notes module functionality

  1.Verify that the user can create new note
  2.Verify that the user can switch Kanban-List view
  3.Verify that the user can discard changes
  4.Verify that the user can edit notes
  5.Verify that the user can delete notes


  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard

  @CENTRIL10-520
  Scenario: Verify that the user can create new note
    When user clicks Notes module button
    And user clicks Create button
    And user writes "something" in the text box
    And user clicks Save button
    Then user sees new created note "something"

  @CENTRIL10-521
  Scenario: Verify that the user can switch Kanban view
    When user clicks Notes module button
    And user clicks Kanban button
    Then user sees changed Notes display to Kanban

  @CENTRIL10-522
  Scenario: Verify that the user can switch List view
    When user clicks Notes module button
    And user clicks List button
    Then user sees changed Notes display to List

  @CENTRIL10-523
  Scenario: Verify that the user can discard changes
    When user clicks Notes module button
    And user clicks Create button
    And user clicks Discard button
    Then user sees the Notes page

  @CENTRIL10-524
  Scenario: Verify that the user can edit notes
    When user clicks Notes module button
    And user clicks Create button
    And user writes "something" in the text box
    And user clicks Save button
    And user clicks Edit button
    And user changes the text like "thanks" in the text box
    And user clicks Save button
    Then user sees new created note "thanks"

  @CENTRIL10-525
  Scenario: Verify that the user can delete notes
    When user clicks Notes module button
    And user clicks Create button
    And user writes "something" in the text box
    And user clicks Save button
    And user clicks Action dropdown
    And user select Delete option
    And user sees this warning message "Are you sure you want to delete this record ?"
    And user clicks Ok button and deletes newly created note
    Then user sees the Notes page
