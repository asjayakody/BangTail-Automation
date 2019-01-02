
Feature: Export Templates
  
  @tag1
  Scenario: Edit Export Template
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Export Templates menu item
   Then enter Export Templates name in search box
   Then click edit Icon
   Then edit name
   Then select Entity Type
   Then edit description
   Then click on Update button
   Then verify update  Successfull message "Success!Template Successfully updated "
   Then click on cancel button
   #Then click on Sign Out
   #Then Close Browser