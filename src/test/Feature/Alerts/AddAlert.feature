Feature: Add Alters

  Scenario: Verify add new alert"TC_0007"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Alerts
    Then clikc on add alert
    Then enter alert name as "Alert001"
    Then enter description as "Alert Description"
    Then save alert
    Then click on cancel
    Then select Leave from confirmation message
    Then search for alert "Alert001"
    Then verify searched alert is available in the grid
		#Then click on Sign Out
    Then Close Browser
    