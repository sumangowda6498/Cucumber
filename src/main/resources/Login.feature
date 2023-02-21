Feature: Login functionality
  Inorder to do internet Banking
  as a valid Para Banking Customer
  I want to login successfully

  Scenario Outline: Login successful
    Given I am in the login page
    When  I enter valid <username> and <password>
    Then I should take to the Overviewpage

    Examples:
      |username|password|
      |"tautester"|"password"|






