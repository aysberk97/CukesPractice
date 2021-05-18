Feature: Guru99 Test Cases

#  @guru99
#  Scenario: Verify account message
#    Given The user wants to go to guru99
#    When The user wants to enter username as "1303" and password as "Guru99"
#    Then The user wants to see Mini Statement
#    Then The user wants to see account number as "3308"
#    Then The user wants to submit
#    And The user wants to verify message as "Last Three Transaction Details for Account No: 3308"


  @smoke
  Scenario: Verify new customer added successfully
    Given As a user I want Go to Guru99 Demo Site
    When the user wants to check text "Guru99 Bank" is present
    Then the user wants Login into application with given credentials
    Then the user wants Verify that the Home page contains text as "Manger Id : mngr325907"
    And  the user wants Click on new customer button and verify you are in New Customer Entry Page
    Then the user wants Fill the information for new customer
     |Customer Name|Gender|Date of Birth| Address          |City   |State|PIN    |Mobile Number|E-mail               |Password      |
     |Ahmet   |Male  |07/15/1800   |350 Manhattan ave |NYC|NY   |212121 |098765432    |saafda@fdsd.com |SIYABEND2147  |
    Then the user wants Verify new customer added successfully