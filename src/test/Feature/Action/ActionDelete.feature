Feature: Action Delete
  Scenario: Verify delete an existing action
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Action menu item
   Then enter action name in search box
   Then click delete button
   Then click on ok from confirmation message box
   Then enter action name in search box
   Then verify searched action is not available in the grid
	 #Then click on Sign Out
   Then Close Browser
		

 	
   
