Feature: Weighing Create Session  New Animal

  Scenario: Weighing_Create_Session_New_Animal"TC-<>"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on Sessions
    Then click on Weighing
    Then check create session checkbox
    Then enter session name "AFT-0086"
    Then select weighing category
    Then click on save & next
    Then click on EID 
    Then enter EID "44"
    Then click ok 
    Then select ok to create new animal
    Then enter new EID "AUT-00-00011"
    Then select sex
    Then enter weight "600"
    Then click save&new
    Then click on cancel to exit
    Then click on cancel to exit from session page
    Then click expand icon to expand main menu
	 	Then click on Animal Managment
		Then click on Manage Animals
		Then search animal by using Visual/EID "AUT-00-00011"
		Then click on Visual/EID 
		Then go to Weights tab
		Then verify Live WT
		
		
		
    
    
    
    
    
    
    
    
    
    