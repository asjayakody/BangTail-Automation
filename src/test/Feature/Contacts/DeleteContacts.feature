Feature: Contacts
  Scenario: Verify Delete an existing Contact "TC_0036"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Contacts
   Then search new contact
   Then click on delete
   Then click ok from confirmation message
   Then search new contact
   Then verify searched contact is not available in the grid
   
   
   	