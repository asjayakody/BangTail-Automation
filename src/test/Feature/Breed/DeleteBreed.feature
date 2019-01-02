Feature: Breed
  Scenario: Verify Delete an existing breed"TC_0029"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Breed
   Then search breed "Breed001"
   Then delete breed
   Then click ok from confirmation message
   Then search breed "Breed001"
   Then verify searched breed is not available in the grid
	 #Then Close Browser
    
   
  