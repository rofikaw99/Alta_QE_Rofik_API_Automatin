Feature: As a user I want to perform login on facebook So that i can see my news feed

  Scenario: Login Facebook
    Given I open Facebook login page
    When I input email and password
    When I click button login
    Then I can see my news feed


