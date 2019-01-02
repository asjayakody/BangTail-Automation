Feature: Brand
  Scenario: Verify Delete an existing brand "TC_0015"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Brands
   Then search for "Brand001"
   Then click on delete button to delete brand
   Then click ok from confirmation message
   Then search for "Brand001"
   Then verify searched brand is not available in the grid 
   Then Close Browser
    
   
   
   