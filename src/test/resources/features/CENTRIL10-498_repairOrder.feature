
@CENTRIL10-519
Feature: New Repair Orders
  User Story :

  POS Manager should be able to create new Repair Orders

  AC :
  Verify that the user can create new  Repair Order
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit Repair Order
  Verify that the user can delete Repair Order


  Background:
    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard


  @CENTRIL10-514
  Scenario: Verify User creates new Repair Orders
    When user clicks "Repairs" icon
    Then user clicks "create" button
    And user types "random name" in the repair reference field.
    Then user types "random name" in the product to repair field
    And user clicks save button
    Then verify user creates new repair order

  @CENTRIL10-515
  Scenario: Verify user can switch Kanban-List view
    When user clicks "Repairs" icon
    Then user clicks list button
    And user verifies to change on the list page
    When user clicks kanban button
    And user verifies to change on the kanban page


  @CENTRIL10-516
  Scenario: user can discard changes
    When user clicks "Repairs" icon
    And user clicks "create" button
    And user clicks Discard ıcon
    Then user sees the repair  page

  @CENTRIL10-517
  Scenario:Verify that the user can edit Repair Order
    When user clicks "Repairs" icon
    Then user clicks "create" button
    And user types "random name" in the repair reference field.
    Then user types "random name" in the product to repair field
    And user clicks save button
    When user clicks edit ıcon
    Then user cleans the Repair Reference field
    And user types "random name" in the repair reference field.
    And user clicks save button

  @CENTRIL10-518
  Scenario: Verify that the user can delete Repair Order
    When user clicks "Repairs" icon
    Then user clicks "create" button
    Then user cleans the Repair Reference field
    And user clicks save button
    Then user sees error message


