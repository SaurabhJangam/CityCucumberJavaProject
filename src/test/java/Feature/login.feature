Feature: FREE CRM LOGIN FEATURE

#  Scenario: FREE CRM Login Test Scenario
#
#    Given User is already on login page
#    When title of login is FREE CRM
#    Then user enters "Saurabh" and "12345"
#    And user click on login button
#    And user is on home page


  Scenario Outline: FREE CRM Login Test Scenario

    Given User is already on login page
    When title of login is FREE CRM
    Then user enters "<username>" and "<password>"
    And user click on login button
    And user is on home page

    Examples:
      | username | password |
      | Saurabh  | 12345    |
      | Amruta   | 78954    |




#  Scenario: User is able to create new contact
#
#    Given User is already on home page
#    When user mouse overs contact link
#    Then user click on new contact link
#    Then user enters firstname and lastname
#    Then user clicks on save button
#    Then verify new conect created
