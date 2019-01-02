Feature: Label
  Scenario: Verify Mandatory fields "TC-0047"
   Given browser is open and logged in as admin user
   Then click expand icon to expand main menu
   Then click on data managment menu
   Then click on Label menu
   Then click on add label button
   Then enter label name
   Then save label
   Then verify label validation message for level
   
   