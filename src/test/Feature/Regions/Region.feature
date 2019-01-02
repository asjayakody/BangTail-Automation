Feature: Regions

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

  Scenario: Verify Mandatory fields "TC-0079"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then click on add regions
    Then enter region code "Region001"
    Then save region
    Then verify mandatory field validation for code
    Then Close Browser

  Scenario: Verify Search functionality"TC-0084"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then search for Region "Region001"
    Then verify searched Region is available in the grid
    Then Close Browser

  Scenario: Verify copy functionality"TC-0081"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Regions
    Then search for Region "Region001"
    Then click on copy feature
    Then enter region code "RegionCopy"
    Then enter region name "Description_copy"
    Then save region
    Then click on cancel
    Then search for Region "RegionCopy"
    Then verify copied Region is available in the grid
    Then Close Browser

    
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
    
    
    
    
    
    