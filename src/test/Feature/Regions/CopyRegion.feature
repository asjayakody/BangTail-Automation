Feature: Copy Regions

  Scenario: Verify copy functionality"TC-0081"
  Given browser is open and logged in as admin user
  Then click expand icon to expand main menu
  Then click on data managment menu
  Then click on Regions
  Then search for Region "Region001"
  Then click on copy feature
  Then enter region code "RegionCopy"
  Then enter region name "Description_copy"
  Then save region
  Then click on cancel
  Then search for Region "RegionCopy"
  Then verify copied Region is available in the grid
  Then Close Browser
  
  #Scenario: Verify duplicate copy records"TC-0082"
  #Given browser is open and logged in as admin user
  #Then click expand icon to expand main menu
  #Then click on data managment menu
  #Then click on Regions
  #Then search for Region "Region001"
  #Then click on copy feature
  #Then save region
  #Then verify duplicate Region Code error message
  #Then Close Browser
  
  
 
    
    
