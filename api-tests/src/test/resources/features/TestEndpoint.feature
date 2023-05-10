@CI
Feature: Test feature

  Scenario: Test scenario
    Given get user test scenario by 1 id
    And validate response via json/schema/getUserByIdSchemaValidating.json jsonSchema