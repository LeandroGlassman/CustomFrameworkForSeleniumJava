Feature: TextBox

  Scenario: User enter to textbox area and complete all the fields
    Given A user who want to submit the form in textbox
    When User complete all the fields
    And clicks on the submit button
    Then The data he just entered appears below
