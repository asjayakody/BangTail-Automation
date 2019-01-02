Feature: Delete alerts

  Scenario: Verify Delete an existing alert"TC_0009"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Alerts
    Then search for alert "Alert_Edited"
    Then click on delete alert 
    Then click ok from confirmation message
    Then search for alert "Alert_Edited"
    Then verify deleted alert is not available in the grid
    Then Close Browser