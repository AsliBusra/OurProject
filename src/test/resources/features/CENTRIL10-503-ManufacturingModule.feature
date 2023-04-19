@sevde

Feature: Manufacturing / Manufacturing Orders Module

  1.Verify that the user can create new Manufacturing Orders (M.O.)
  2.Verify that the user can switch Kanban-List view
  3.Verify that the user can discard changes
  4.Verify that the user can edit (M.O.)
  5.Verify that the user can delete (M.O.)


  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard


  Scenario: Verify that the user can create new Manufacturing Orders (M.O.)
    When user clicks Manufacturing module button
    And user makes sure he is on "Manufacturing Orders" page
    And user clicks Create button
    And user selects a product from the dropdown menu
    And user clicks Save button
    Then user sees his recently created "Manufacturing Order" on the page


  Scenario: Verify that the user can switch Kanban view
    When user clicks Manufacturing module button
    And user clicks Kanban button
    Then the display of Manufacturing Orders List changed to Kanban view


  Scenario: Verify that the user can switch Kanban view
    When user clicks Manufacturing module button
    And user clicks List button
    Then Manufacturing Orders are displayed in List view


  Scenario: Verify that the user can discard changes
    When user clicks Manufacturing module button
    And user clicks Create button
    And user selects a product from the dropdown menu
    And user clicks Discard button
    And "Warning" popup message should be displayed
    And user clicks on the "ok" button
    Then user should be directed back to "Manufacturing Orders" page automatically


  Scenario: Verify that the user can edit (M.O.)
    When user clicks Manufacturing module button
    And user makes sure he is on "Manufacturing Orders" page
    And user clicks Search button
    And user enters the reference title that he wants to edit which is "TY/2023/0175"
    And user clicks enter
    And user finds his M.O. and clicks on it
    And user clicks Edit button
    And user selects a new product name
    And user clicks Save button
    And user goes back to "Manufacturing Orders" page
    Then user makes sure his edited M.O. "TY/2023/0175" is listed


  Scenario: Verify that the user can delete (M.O.)
    When user clicks Manufacturing module button
    And user makes sure he is on "Manufacturing Orders" page
    And user clicks Create button
    And user selects a product from the dropdown menu
    And user clicks Save button
    And user clicks Cancel button
    And user clicks Action dropdown
    And user select Delete option
    And Confirmation popup message should be displayed
    Then user clicks on the Ok button
