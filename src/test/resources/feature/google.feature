Feature: Test for google application

Scenario: Test for google tittle
   Given open the google application
    When User capture current page tittle
    Then Title should match
    