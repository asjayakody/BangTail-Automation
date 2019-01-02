Feature: Alters Mandatory fields

  Scenario: Verify Mandatory fields"TC_0011"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Alerts
    Then clikc on add alert
    Then enter alert name as "Alert001"
    Then save alert
    #Then verify mandatory fields validation
		Then Close Browser