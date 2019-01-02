Feature: Brand

  Scenario: Verify add new brand "TC_0013"
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on data managment menu
    Then click on Brands
    Then click on Add Brand
    Then eneter brand name as "Brand001"
    Then enter descripton as "This a new brand"
    Then choose brand logo
    Then save brand
    Then click on cancel
    Then select Leave from confirmation message
    Then search for "Brand001"
    Then verify searched brand is available in the grid
    Then Close Browser
