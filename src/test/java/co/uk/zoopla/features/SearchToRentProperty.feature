Feature: Search property for rent
  As a customer
  I want to search property for rent
  So I can get information about available property

  Background:
    Given I navigate to zoopla homepage

  Scenario Outline: Customer can search for property to rent

    When I click on To Rent
    And I enter a "<Location>" in the search text box
    And I select "<MinPrice>" from Min price dropdown
    And I select "<MaxPrice>" from Max price dropdown
    And I select "<Property>" from Property type dropdown
    And I select "<Bed>" from Bedrooms dropdown
    And I accept all cookies
    And I click on Search button
    Then a list of "<PropertyType>" in "<Location>" are displayed
    And I click on one of the results links

    Examples:
      |Location| MinPrice|MaxPrice|Property|Bed|PropertyType|
      |Aberdeen|£120,000|£230,000|Houses |3+ | Houses     |
#      |London    |£250,000|£400,000|Farms/land|No min| Property|
#      |Coventry|£120,000|£230,000|Flats |3+ | Flats     |
#      |Birmingham|         |       |      |   |           |
