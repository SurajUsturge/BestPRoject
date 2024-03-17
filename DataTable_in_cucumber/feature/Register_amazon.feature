Feature: amazon register user

  Scenario: register user with valid credentials
    Given launch app and open url
    When user enter following credentials
      | Firstname and last name | ruaj bakshi   |
      | mobile number           |    9876565655 |
      | email                   | sdk@gmail.com |
      | password                | surj@gms      |
    Then user registered successfully