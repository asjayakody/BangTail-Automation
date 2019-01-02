Feature: Contacts
  Scenario: Verify show inactive functionality "TC_0033"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Contacts
   Then search for inactive contact
   Then verify searched contact is not available in the grid
   Then check show inactives
   Then verify searched contact is available in the grid
   
   
 
   
   
   
   