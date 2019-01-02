Feature: Edit Alters

  Scenario: Verify edit an existing alert"TC_0008"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Alerts
    Then search for alert "Alert001"
    Then click on edit alert
    Then enter alert name as "Alert_Edited"
    Then enter description as "Alert Description Edited"
    Then update alert
    Then click on cancel
    Then select Leave from confirmation message
    Then search for alert "Alert_Edited"
    Then verify edited alert is available in the grid
    Then Close Browser