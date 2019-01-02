
Feature: Export Templates

  
  Scenario: Delete Export Templates
  Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Export Templates menu item
   Then enter Export Templates name in search box
   Then click delete button
   Then click on ok from confirmation message box
   Then enter Export Templates name in search box
   Then verify searched action is not available in the grid
   Then click on cancel button
	 #Then click on Sign Out
   #Then Close Browser
		
    