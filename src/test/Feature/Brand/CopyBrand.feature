Feature: Brand
  Scenario: Verify copy an existing brand "TC_0018"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Brands
   Then click on Add Brand
   Then eneter brand name as "Brand001_copied"
   Then enter descripton as "This is copied"
   Then choose brand logo
   Then click update
   #Then verify update  Successfull message
    
   
   
   