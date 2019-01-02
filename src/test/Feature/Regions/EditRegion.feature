Feature: Regions

  Scenario: Verify Edit Functionality"TC-0080"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then search for Region "Region001"
    Then click on edit Region
    Then enter region code "RegionEdit"
    Then enter region name "Description_Edit"
    Then update Region
    Then click on cancel
    Then select Leave from confirmation message
    Then search for Region "RegionEdit"
    Then verify edited Region is available in the grid
    #Then click on Sign Out
    Then Close Browser
    
    