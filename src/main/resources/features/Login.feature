@LoginTest

Feature: Login with exiting User

  Scenario: Login into the web app with exiting User
    Given I have open the web app

    And I insert Username into the Username text field
    And I insert Password into the Password text field
    And I Click Login button
    Then I should See Landing Page of the web app