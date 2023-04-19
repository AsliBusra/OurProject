@burhan
Feature: Creating Manufacturing/Operations/Unbuild Orders

  1.Verify that the user can create new Unbuild Orders (U.O.)
  2.Verify that the user can switch Kanban-List view
  3.Verify that the user can discard changes
  4.Verify that the user can edit (U.O.)
  5.Verify that the user can delete (U.O.)"



  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard
    Given user clicks Manufacturing module button
    Given user clicks Unbuild Orders button

  Scenario: Verify that the user can create new Unbuild Orders (U.O.)
    When user clicks Create button
    And user selects a product from the dropdown menu
    And user enters number in the quantity box
    And user clicks Save button
    Then user sees his recently created "Unbuild Orders" on the page


  Scenario: Verify that the user can switch Kanban-List view
    When user clicks Kanban button
    Then Unbuild Orders are displayed in Kanban view
    And user clicks List button
    Then Unbuild Orders are displayed in List view


  Scenario: Verify that the user can discard changes
    When user clicks Create button
    And user selects a product from the dropdown menu
    And user clicks Discard button
    And "Warning" popup message should be displayed
    And user clicks on the "ok" button
    Then user should be directed back to "Unbuild Orders" page automatically



