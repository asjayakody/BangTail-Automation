Feature: Breed
  Scenario: Verify edit an existing breed  "TC_0028"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Breed
   Then search breed "Breed001"
   Then click on edit breed
   Then enter breed code as "Breed_edit"
   Then enter breed name as "Breed001_edited"
   Then update breed
   #Then Close Browser
    
   
  