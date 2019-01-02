Feature: Delete Regions

  Scenario: Verfiy Delete functionality"TC-0083"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then search for Region "Region001"
    Then click on delete region
    Then click ok from confirmation message
    Then search for Region "Region001"
    Then verify deleted Region is not available in the grid
    Then Close Browser
