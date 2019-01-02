Feature: Contacts
  Scenario: Verify add new contact "TC_0034"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Contacts
   Then click on add contacts button
   Then enter contact code
   Then enter traading name	
   Then select contact category
   Then enter first name
   Then enter email
   Then save contact
   #Then verify Record Saved Successfull message for contact
   Then click on cancel button
   Then search new contact
   Then verify search contact is available in search results
   
   