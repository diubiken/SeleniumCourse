Feature: fill New address

  Scenario: fill Address information
    Given Page opened in browser
    When "Mr" is entered in Alias box
    And "Opolska 123" is entered in Address box
    And "40-568" is entered in Zip/Postal Code box
    And "Katowice" is entered in City box
    And "United Kingdom" is selected in Country box
    And "+48500001002" is entered in Phone box
    And "SAVE" button is clicked
    Then Address is added and "Address successfully added!" is shown
