
@CENTRIL10-555
Feature: Employees / Badges Module

  1.Verify that the user can create new Badges
  2.Verify that the user can switch Kanban-List view
  3.Verify that the user can discard changes
  4.Verify that the user can edit Badges


  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard

  @CENTRIL10-549
  Scenario: Verify that the user can create new Badges
    When user clicks Employees module button
    And user click Budges subModule button
    And user makes sure he is on "Badges" page
    And user clicks Create button
    And user types "New questions" on badge name area
    And user clicks Save button
    Then user sees his recently created badge on the page

  @CENTRIL10-550
  Scenario: Verify that the user can switch Kanban view
    When user clicks Employees module button
    And user click Budges subModule button
    And user clicks Kanban button
    Then the display of Badges List changed to Kanban view

  @CENTRIL10-551
  Scenario: Verify that the user can switch List view
    When user clicks Employees module button
    And user click Budges subModule button
    And user clicks List button
    Then Badges are displayed in List view

  @CENTRIL10-552
  Scenario: Verify that the user can discard changes
    When user clicks Employees module button
    And user click Budges subModule button
    And user clicks Create button
    And user types "New questions" on badge name area
    And user clicks Discard button
    And "Warning" popup message should be displayed
    And user clicks on the "ok" button
    Then user should be directed back to "Badges" page automatically

  @CENTRIL10-553
  Scenario: Verify that the user can edit Badges
    When user clicks Employees module button
    And user click Budges subModule button
    And user makes sure he is on "Badges" page
    And user clicks Search button
    And user enters the reference title that he wants to edit which is "New questions"
    And user clicks enter
    And user finds his Badges and clicks on it
    And user clicks Edit button
    And user types a new product  name
    And user clicks Save button
    And user goes back to "Badges"  page
    And user clicks List button
    Then user makes sure his edited Badge "New answers" is listed