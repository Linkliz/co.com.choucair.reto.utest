# languge: en
  #Author: Lizeth Ortega
@stories
Feature: Sign Up uTest page
  As a user, I want to sign Up at a page uTest
  @scenario1
  Scenario: A new user at the platform uTest
    Given than brandon wants to sign up at the uTest page
    When fill in the form for registration
      | strFirstName   | strLastName   |  strEmailAddress       | strMount  | strDay  | strYear | strLanguages  | strCity |   strPostalCode    | strCountry    |  strComputer  |  strVersion |   strLanguage  |  strMovilDevice |   strModel |  strOperatingSystem  |   strPassword |   strConfirmPassword   |
      | Lizeth         |  Ortega       | elricliz96@gmail.com   | January   | 7       | 1996    | Spanish       | Calarcá | 632001             |  Colombia     | Windows       |   10        | Spanish        |    Xiaomi       |  Redmi 9   | Android 10           | Linkliz0321*  | Linkliz0321*           |
    Then see the welcome page to the uTest portal
      | strTextToWelcome                                                         |
      | Welcome to the world's largest community of freelance software testers! |
