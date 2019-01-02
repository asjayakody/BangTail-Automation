Feature: Add Species

  Scenario: Verify add functionality"TC-0068"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Species
    Then click on Add Species
    Then enter name "Species003"
    Then click on active checkbox to create active Species
    Then save Species
    
    
    #Then Close Browser

 