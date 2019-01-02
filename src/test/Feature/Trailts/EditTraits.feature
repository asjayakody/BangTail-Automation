Feature: Traits

  Scenario: Verify Edit Functionality"TC-0059"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Traits
    Then search for Trait "Trait001"
    Then click on edit trait
    Then enter Trailt code "Traitedit"
    Then enter Trailt name "Trait001_Edited"
    Then select display order
    Then enter min "6"
    Then enter max "9"
    Then enter cull "8"
    Then update trait
    Then click on cancel
    Then select Leave from confirmation message
    Then search for Trait "Traitedit"
    Then verify edited trait is available in the grid
    #Then click on Sign Out
    #Then Close Browser
    
    