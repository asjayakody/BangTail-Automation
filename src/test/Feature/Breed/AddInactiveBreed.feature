Feature: Breed
  Scenario: Verify add inactive breed "Pre-condition for TC_0027"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Breed
   Then click on add breed
   Then enter breed code as "Breed002"
   Then enter breed name as "Breed002"
   Then enter breed description as"this an inactive breed"
   Then uncheck is active
   Then save breed
   #Then Close Browser
    
   
  