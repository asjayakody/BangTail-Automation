Feature: Traits

  Scenario: Verify add functionality"TC-0057"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Traits
    Then click on add Traits
    Then enter Trailt code "Trait001"
    Then enter Trailt name "Trait001"
    Then select display order
    Then enter min "6"
    Then enter max "9"
    Then enter cull "8"
    Then save Trait
    Then click on cancel
    Then select Leave from confirmation message
    Then search for Trait "Trait001"
    Then verify searched trait is available in the grid
    #Then click on Sign Out
    #Then Close Browser
    
    