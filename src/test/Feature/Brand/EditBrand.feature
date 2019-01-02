Feature: Brand
  Scenario: Verify edit an existing brand "TC_0014"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Brands
   Then search for "Brand001"
   Then click on edit brand
   Then enter descripton as "This is edited "
   Then click update
   #Then verify update  Successfull message
   #Then Close Browser
  
   
   