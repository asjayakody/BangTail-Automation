Feature: Breed
  Scenario: Verify copy an existing Breed  "TC_0032"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Breed
   Then search breed "Breed001"
   Then click copy breed
   Then enter breed code as "Breed_copy"
   Then enter breed name as "Breed001_copy"
   Then save breed
   #Then Close Browser
    
   
  