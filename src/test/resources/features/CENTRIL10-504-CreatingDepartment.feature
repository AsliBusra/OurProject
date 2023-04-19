Feature: Pos manager should be able to create Employees / Departments

  "Verify that the user can create new Department
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit (M.O.)"

  Background: Login to the dashboard

    Given user goes to login page
    Given user enters correct username
    Given user enters correct password
    Given user should land on the dashboard

  Scenario: User can create new Department
    When user clicks Employees button
    And user clicks Departments button
    And user clicks Create button
    And user writes a word as Department Name in the blank
    And user clicks Save button on the page
    Then user should see the new Department Name on the page


  Scenario: User can switch Kanban view
    When user clicks Employees button
    And user clicks Departments button
    And user clicks kanban button
    Then user should see the Departmens in Kanban view


  Scenario: User can switch List view
    When user clicks Employees button
    And user clicks Departments button
    And user clicks list button
    Then user should see the Departmens in List view


  Scenario: User can discard changes
    When user clicks Employees button
    And user clicks Departments button
    And user clicks Create button
    And user writes a word as Department Name in the blank
    And user clicks discard button
    And user sees the Warning message
    And user clicks Ok button
    Then user should see the Departments page

  Scenario: User can edit
    When user clicks Employees button
    And user clicks Departments button
    And user clicks Create button
    And user writes a word as Department Name in the blank
    And user clicks Save button on the page
    And user clicks Edit button
    And user writes more numbers as Department Name in the blank
    And user clicks Save button on the page
    Then user should see the new Department Name on the page









