Feature: Treatment sessions

  #Scenario: Validate user can add a treatment from a product to a new Processing Session "BT-5081"
  #Given browser is open and logged in as admin user
  #Then click expand icon to expand main menu
  #Then click on Sessions
  #Then click on Treatments
  #Then add new Processing Session
  #Then enter Processing Session name "SS-10"
  #Then click on Add
  #Then select newly added Processing Session
  #Then click on Go to Treatments
  #Then select Practitioner
  #Then select Add from product
  #Then click Add Products
  #Then click on Select Batch
  #Then select valid bacth
  #Then save product
  #Then click on save&close
  #Then select newly added Processing Session
  #Then click on Go to Treatments
  #Then verify added product is displayed in the grid
  #Then Close Browser
  #
  #
  #
  #Scenario: Validate user can add a treatment from a protocol to a new Processing Session "BT-5080"
  #
    #Given browser is open and logged in as admin user
    #Then click expand icon to expand main menu
    #Then click on Sessions
    #Then click on Treatments
    #Then add new Processing Session
    #Then enter Processing Session name "SS-11"
    #Then click on Add
    #Then select newly added Processing Session
    #Then click on Go to Treatments
    #Then select Practitioner
    #Then select value from Add from a Protocol
    #Then click Add Products
    #Then click on Select Batch
    #Then select valid bacth
    #Then save product
    #Then click on save&close
    #Then select newly added Processing Session
    #Then click on Go to Treatments
    #Then verify added product from protocol is displayed in the grid
    #Then Close Browser

    
  #Scenario: Validate user can add a animal to a new treatment session "BT-5082"
  #
    #Given browser is open and logged in as admin user
    #Then click expand icon to expand main menu
    #Then click on Sessions
    #Then click on Treatments
    #Then add new Processing Session
    #Then enter Processing Session name "SS-18"
    #Then click on Add
    #Then select newly added Processing Session
    #Then click on Go to Treatments
    #Then select Practitioner
    #Then select value from Add from a Protocol
    #Then click Add Products
    #Then click on Select Batch
    #Then select valid bacth
    #Then save product
    #Then click on save&close
    #Then select newly added Processing Session
    #Then search animal by using Visual/EID "SDF-97-23862"
    #Then select animal from the grid
    #Then click on Add Animals to Treatment
    #Then click on Show Animals in Session
    #Then verify moved animal is available in the grid
    #Then Close Browser
    
    
  #Scenario: Verify Treatment details from Animal management which are added from newly created session in treatment management "BT-5083"
  #
    #Given browser is open and logged in as admin user
    #Then click expand icon to expand main menu
#	 	Then click on Animal Managment
#		Then click on Manage Animals
#		Then search animal by using Visual/EID "SDF-97-23862"
#		Then click on Visual/EID 
#		Then select Treatments tab
#		Then verify product field 
#		Then verify Batch NO
#		Then Close Browser
    
   
        
  Scenario: Validate user can add a animal to a Existing treatment session  "BT-5089"
  
    Given browser is open and logged in as admin user
    Then click expand icon to expand main menu
    Then click on Sessions
    Then click on Treatments
    #Then add new Processing Session
    #Then enter Processing Session name "SS-18"
    #Then click on Add
    #Then select newly added Processing Session
    Then select an already created processing session "SS-10"
    
    #Then click on Go to Treatments
    #Then select Practitioner
    #Then select value from Add from a Protocol
    #Then click Add Products
    #Then click on Select Batch
    #Then select valid bacth
    #Then save product
    #Then click on save&close
    #Then select newly added Processing Session
    #Then search animal by using Visual/EID "SDF-97-23862"
    #Then select animal from the grid
    #Then click on Add Animals to Treatment
    #Then click on Show Animals in Session
    #Then verify moved animal is available in the grid
    #Then Close Browser
    #
    
    
    
    
    
    
    
    
    