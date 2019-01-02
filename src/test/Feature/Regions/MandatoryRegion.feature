Feature: Regions

  Scenario: Verify Mandatory fields "TC-0079"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then click on add regions
    Then enter region code "Region001"
    Then save region
    Then verify mandatory field validation for code
    #Then click on Sign Out
    Then Close Browser
    
    