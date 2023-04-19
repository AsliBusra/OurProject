@CENTRIL10-548
Feature: Point Of Sale Configuration

  US(CENTRIL10-499): POS Manager should be able to create new Point Of Sale Configuration

  AC:
  1_Verify that the user can create new Point Of Sale
  2_Verify that the user can switch Kanban-List view
  3_Verify that the user can discard changes
  4_Verify that the user can edit Point Of Sale
  5_Verify user cannot create new Point of Sale without Point of Sale name
  6_Verify user cannot create new Point of Sale without Operation type


  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard
    Given user clicks Point of Sale module button
    Given user clicks Point of Sale side bar menu button

  @CENTRIL10-542
  Scenario: Verify that the user can create new  Point Of Sale
    When user clicks Create button
    And user enters "newpos1" as Point of Sale name
    And user selects Operation Type
    And user clicks save button
    Then user sees "newpos1" as new created Point of Sale's name

  @CENTRIL10-543
  Scenario: Verify that the user can switch Kanban-List view
    When user clicks Kanban button
    Then user sees the page in Kanban format
    And user clicks List button
    Then user sees the page in List format

  @CENTRIL10-544
  Scenario: Verify that the user can discard changes
    When user clicks Create button
    And user clicks Discard button
    Then user sees the Notes page

  @CENTRIL10-545
  Scenario: Verify that the user can edit Point of Sale
    When user clicks Create button
    And user enters "newpos2" as Point of Sale name
    And user selects Operation Type
    And user clicks save button
    Then user sees "newpos2" as new created Point of Sale's name
    And user clicks Edit button
    And user changes Point of Sale name as "newpos3"
    And user clicks Save button
    Then user sees "newpos3" as editted Point of Sale's name

  @CENTRIL10-546
  Scenario: Verify that user cannot create new Point of Sale without Point of Sale name
    When user clicks Create button
    And user clicks Save button
    Then user cannot create new Point of Sale without Point of Sale name

  @CENTRIL10-547
  Scenario: Verify that user cannot create new Point of Sale without Operation type
    When user clicks Create button
    And user enters "newpos4" as Point of Sale name
    And user clicks Save button
    Then user cannot create new Point of Sale without Operation type