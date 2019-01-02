Feature: Breed
  Scenario: Verify add new breed"TC_0027"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Breed
   Then click on add breed
   Then enter breed code as "Breed001"
   Then enter breed name as "Breed001"
   Then enter breed description as"this a new breed"
   Then save breed
   Then click on cancel
   Then search breed "Breed001"
	 Then verify searched breed is available in the grid
   Then Close Browser
    
   
  