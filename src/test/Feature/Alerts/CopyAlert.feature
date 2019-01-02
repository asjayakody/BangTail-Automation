Feature: Alters Copy

  Scenario: Verify copy an existing alert"TC_0012"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Alerts
    Then search for alert "Alert001"
    Then click on copy alert
    Then enter alert name as "Alert_Copy"
    Then enter description as "Alert Description Copy"
  	Then save alert
    Then click on cancel
    Then select Leave from confirmation message
    Then search for alert "Alert_Copy"
    Then verify copied alert is available in the grid
    Then Close Browser