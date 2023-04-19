@CENTRIL10-563
Feature: Purchase_Vendor module functionality

  1.Verify that the user can create new Vendor
  2.Verify that the user can switch Kanban-List view
  3.Verify that the user can discard changes
  4.Verify that the user can edit Vendor
  5.Verify that the user can delete Vendor
  6.Verify that user can move to the next records page by right-left buttons

  Background: Go to Purchase/Vendors Page

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard
    Given user is on Vendors page

  @CENTRIL10-557
  Scenario: Verify that the user can create new Vendor
    When user clicks Create button
    And user enters "NewVendor1" onto name field
    And user clicks save button
    Then user sees "NewVendor1" as newly created Vendor

  @CENTRIL10-560
  Scenario: Verify that the user can switch Kanban-List view
    When user clicks List button
    Then user sees changed Vendors display to List
    When user clicks Kanban button
    Then user sees changed Vendors display to Kanban

  @CENTRIL10-561
  Scenario: Verify that the user can discard changes
    When user clicks Create button
    And user clicks Discard button
    Then user sees the Vendors page

  @CENTRIL10-558
  Scenario: Verify that the user can edit Vendor
    When user clicks Create button
    And user enters "NewVendor1" onto name field
    And user clicks save button
    And user clicks Edit button
    And user changes the text to "EditedVendor1" in the text box
    And user clicks Save button
    Then user sees "EditedVendor1" as newly created Vendor

  @CENTRIL10-559
  Scenario: Verify that the user can delete Vendor
    When user clicks Create button
    And user enters "ToBeDeleted" onto name field
    And user clicks save button
    And user clicks Action dropdown
    And user select Delete option
    And user sees this warning message "Are you sure you want to delete this record ?"
    And user clicks Ok button and deletes newly created Vendor
    Then user sees the newly created Vendor Bill "ToBeDeleted" is deleted

  @CENTRIL10-562
  Scenario: Verify that user can move to the next records page by right-left buttons
    When user clicks on right button
    Then user is directed to the next records page
    And user clicks on left button
    Then user is directed to the first records page





