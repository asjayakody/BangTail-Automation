Feature: Regions

  Scenario: Verify Search functionality"TC-0084"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then search for Region "Region001"
    Then verify searched Region is available in the grid
    #Then click on Sign Out
    Then Close Browser
    
    