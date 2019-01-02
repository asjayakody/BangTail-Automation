Feature: Bangtail Login page
  Scenario: Verify admin user can login to Bangtail with valid credentials
    Given browser is open and logged in as admin user
    Then click on Administrator icon
    Then click on Sign Out
    Then Close Browser
    
