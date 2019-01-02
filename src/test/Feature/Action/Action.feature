Feature: Action
  Scenario: Add an active Action  
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Action menu item
   Then click on add Action button
   Then enter Name
   Then enter Description
   #Then enter Assigned by
   Then select Assigned to
   Then select status as Complete
   Then save action
   #Then verify Record Saved Successfull message
   Then click on cancel button
   #Then select Leave from confirmation message
   Then enter action name in search box
   Then verify searched action is available in the grid
	 #Then click on Sign Out
   Then Close Browser


 	
   
