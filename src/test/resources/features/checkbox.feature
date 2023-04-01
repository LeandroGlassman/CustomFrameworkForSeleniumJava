Feature: Checkbox

  Scenario: User can select the home checkbox
    Given a user inside checkbox section
    When user clicks on home checkbox
    Then all the checkbox of the path are now selected
