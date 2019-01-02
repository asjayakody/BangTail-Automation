Feature: Add Regions

  Scenario: Verify add functionality"TC-0078"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then click on add regions
    Then enter region code "Region001"
    Then enter region name "Region Description"
    Then save region
    Then click on cancel
    Then search for Region "Region001"
    Then verify searched Region is available in the grid
    Then Close Browser

  Scenario: Verify add inactive Region "Pre condition for TC-0085"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then click on add regions
    Then enter region code "Region002"
    Then enter region name "Region Description"
    Then uncheck active check box for create inactive region
    Then save region
    Then Close Browser

  Scenario: Verify show inactive functionality "TC-0085"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then search for Region "Region002"
    Then click show inactives regions
    Then verify inactive Region is available in the grid
    Then Close Browser
