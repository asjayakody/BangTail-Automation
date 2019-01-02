Feature: Breed
  Scenario: Verify show inactive functionality  "TC_0033"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Breed
   Then search breed "Breed002"
   Then verify searched breed is not available 
   Then check show inactives to show inactive breeds
   Then verify searched inactive breed is available in the grid
   #Then Close Browser
    
   
  