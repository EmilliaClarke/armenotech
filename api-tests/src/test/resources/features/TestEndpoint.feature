#Neg/Pos cases for payments info

@CI
Feature: Armenotech payments info
  AS a user I
  I WANT to get valid response
  SO THAT I can proceed working with app correctly

  Scenario: User gets 200 STC for valid request
    Given get payments by country: WWC and asset: ATUSD id
    And validate response via json/schema/getPaymentyCountryAssetValidating.json jsonSchema

  Scenario: User gets 200 STC for valid request
    Given get payments by country: Spain and asset: ATUAH id
    And validate response via json/schema/getPaymentyCountryAssetValidating.json jsonSchema

  Scenario: User gets 200 STC for valid request
    Given get payments by country: CHL and asset: ATCLP id
    And validate response via json/schema/getPaymentyCountryAssetValidating.json jsonSchema

  Scenario: User gets 200 STC for empty request
    Given get payments by country:  and asset:  id
    And validate response via json/schema/getPaymentyCountryAssetValidating.json jsonSchema

  Scenario: User gets 405 STC for invalid post
    Given send invalid post method to get payments by country: WWC and asset: ATUSD id

