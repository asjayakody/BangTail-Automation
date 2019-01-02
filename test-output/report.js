$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/BangtailRepo/BangtailAutoBDDNew/src/test/Feature/Sessions/TreatmentSessions.feature");
formatter.feature({
  "line": 1,
  "name": "Treatment sessions",
  "description": "",
  "id": "treatment-sessions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate user can add a treatment from a product to a new Processing Session \"BT-5081\"",
  "description": "",
  "id": "treatment-sessions;validate-user-can-add-a-treatment-from-a-product-to-a-new-processing-session-\"bt-5081\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browser is open and logged in as admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click expand icon to expand main menu",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on Sessions",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on Treatments",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "add new Processing Session",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter Processing Session name \"SS-10\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Add",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "select newly added Processing Session",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on Go to Treatments",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "select Practitioner",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "select Add from product",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click Add Products",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on Select Batch",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "select valid bacth",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "save product",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on save\u0026close",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "select newly added Processing Session",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on Go to Treatments",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "verify added product is displayed in the grid",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.browser_is_open_and_logged_in_as_admin_user()"
});
formatter.result({
  "duration": 7192745667,
  "status": "passed"
});
formatter.match({
  "location": "MainMenuDef.click_expand_icon_to_expand_main_menu()"
});
formatter.result({
  "duration": 6187588165,
  "status": "passed"
});
formatter.match({
  "location": "WeighingSessionsDef.click_on_Sessions()"
});
formatter.result({
  "duration": 5126808100,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Treatments()"
});
formatter.result({
  "duration": 7709448438,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.add_new_Processing_Session()"
});
formatter.result({
  "duration": 5138867866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SS-10",
      "offset": 31
    }
  ],
  "location": "TreatmentsSessionsDef.enter_Processing_Session_name(String)"
});
formatter.result({
  "duration": 2234367938,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Add()"
});
formatter.result({
  "duration": 350418572,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_newly_added_Processing_Session()"
});
formatter.result({
  "duration": 5353092353,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Go_to_Treatments()"
});
formatter.result({
  "duration": 814604762,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_Practitioner()"
});
formatter.result({
  "duration": 5317404554,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_Add_from_product()"
});
formatter.result({
  "duration": 3190827189,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_Add_Products()"
});
formatter.result({
  "duration": 3353956752,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Select_Batch()"
});
formatter.result({
  "duration": 3157467639,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_valid_bacth()"
});
formatter.result({
  "duration": 3170505460,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.save_product()"
});
formatter.result({
  "duration": 178195338,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_save_close()"
});
formatter.result({
  "duration": 2545670766,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_newly_added_Processing_Session()"
});
formatter.result({
  "duration": 5141058132,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Go_to_Treatments()"
});
formatter.result({
  "duration": 690243131,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.verify_added_product_is_displayed_in_the_grid()"
});
formatter.result({
  "duration": 5155165238,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.close_Browser()"
});
formatter.result({
  "duration": 298125121,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Validate user can add a treatment from a protocol to a new Processing Session \"BT-5080\"",
  "description": "",
  "id": "treatment-sessions;validate-user-can-add-a-treatment-from-a-protocol-to-a-new-processing-session-\"bt-5080\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "browser is open and logged in as admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "click expand icon to expand main menu",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click on Sessions",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click on Treatments",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "add new Processing Session",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "enter Processing Session name \"SS-11\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click on Add",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "select newly added Processing Session",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click on Go to Treatments",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "select Practitioner",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "select value from Add from a Protocol",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "click Add Products",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "click on Select Batch",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "select valid bacth",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "save product",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "click on save\u0026close",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "select newly added Processing Session",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "click on Go to Treatments",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "verify added product from protocol is displayed in the grid",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.browser_is_open_and_logged_in_as_admin_user()"
});
formatter.result({
  "duration": 5492069315,
  "status": "passed"
});
formatter.match({
  "location": "MainMenuDef.click_expand_icon_to_expand_main_menu()"
});
formatter.result({
  "duration": 6118894710,
  "status": "passed"
});
formatter.match({
  "location": "WeighingSessionsDef.click_on_Sessions()"
});
formatter.result({
  "duration": 5177043566,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Treatments()"
});
formatter.result({
  "duration": 7630866098,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.add_new_Processing_Session()"
});
formatter.result({
  "duration": 5150323238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SS-11",
      "offset": 31
    }
  ],
  "location": "TreatmentsSessionsDef.enter_Processing_Session_name(String)"
});
formatter.result({
  "duration": 2190153231,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Add()"
});
formatter.result({
  "duration": 136205868,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_newly_added_Processing_Session()"
});
formatter.result({
  "duration": 5302764136,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Go_to_Treatments()"
});
formatter.result({
  "duration": 851806969,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_Practitioner()"
});
formatter.result({
  "duration": 5186816516,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_value_from_Add_from_a_Protocol()"
});
formatter.result({
  "duration": 3195040846,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_Add_Products()"
});
formatter.result({
  "duration": 3348406203,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Select_Batch()"
});
formatter.result({
  "duration": 3256335596,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_valid_bacth()"
});
formatter.result({
  "duration": 3152603972,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.save_product()"
});
formatter.result({
  "duration": 158537684,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_save_close()"
});
formatter.result({
  "duration": 2435904317,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.select_newly_added_Processing_Session()"
});
formatter.result({
  "duration": 5195361290,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.click_on_Go_to_Treatments()"
});
formatter.result({
  "duration": 681325456,
  "status": "passed"
});
formatter.match({
  "location": "TreatmentsSessionsDef.verify_added_product_from_protocol_is_displayed_in_the_grid()"
});
formatter.result({
  "duration": 5096345844,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.close_Browser()"
});
formatter.result({
  "duration": 234474753,
  "status": "passed"
});
});