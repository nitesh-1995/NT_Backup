
Feature: Testing on E-commerce Website
  
  Scenario: To validate the Login Process
    Given I want to enter URL
    |https://freecrm.com/|
    And I click on Login Link
    Then I enter the Username and Password
    |userName|  password  |
    |nitesh.tadadikar95@gmail.com|Nt@tadadikar1995|
    When I click on login button
    Then I confirm Login validation
    When I click on Welcome link
    Then I do logout operation
    And I close the window

