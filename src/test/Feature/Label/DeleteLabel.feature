Feature: Label
  Scenario: Delete label "TC-0051"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Label menu
   Then search for label
   Then click on delete button
   Then click ok from confirmation message
   Then search for label
 	Then verify searched label is not available in the grid
   
  

   
   
   
     

   
   
   