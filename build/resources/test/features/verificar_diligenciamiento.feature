#Autor: Dayana Estrada

@stories
Feature:verification successful
  As a registered user, I want to verify the completion of the Block Validation screen.

  @scenario1
  Scenario:verification successful
    Given than dayana is registered she wants to verify completion
    | StrUser | StrPassword |
    | demo    |   demo      |
    When she enters all the required information
    |strRequired| strEmail      |strPasswordValidation| strConfirmPassword |   strDate          |     strUrl             | strDigitiesOnly| strRango |
    | admin1    |dasg@correo.com|      123456S        |       123456S      |  12062022          |  https://testing.com   |       33       |  7       |
    Then verification is successful
    |strTextoFinal|
    |             |

    @scenario2
    Scenario: check message when fields are empty
      Given that dayana wants to validate the message
        | StrUser | StrPassword |
        | demo    |   demo      |
      When she saves the form with empty fields
      Then check the message
      | strMessageRequired      |
      | This field is required. |

  @scenario3
  Scenario: check message when email is invalid
    Given that dayana wants to validate the message of the email
      | StrUser | StrPassword |
      | demo    |   demo      |
    When she saves the form with invalid email
      |strRequired| strEmail      |strPasswordValidation| strConfirmPassword |   strDate          |     strUrl             | strDigitiesOnly| strRango |
      | admin1    |dasgcorreo.com|      123456S        |       123456S      |  12062022          |  https://testing.com   |       33       |  7       |
    Then check the message of the email
     |strInvalidEmail                    |
     |Please enter a valid email address.|

  @scenario4
  Scenario: check message when password is invalid
    Given that dayana wants to validate the message of the password
      | StrUser | StrPassword |
      | demo    |   demo      |
    When she saves the form with invalid password
      |strRequired| strEmail      |strPasswordValidation| strConfirmPassword |   strDate          |     strUrl             | strDigitiesOnly| strRango |
      | admin1    |dasg@correo.com |      123S            |       1234         |  12062022          |  https://testing.com   |       33       |  7       |
    Then check the message of the password
      |     strInvalidPassword            |
      |Please enter at least 5 characters.|

  @scenario5
  Scenario: check message when url is invalid
    Given that dayana wants to validate the message of the url
      | StrUser | StrPassword |
      | demo    |   demo      |
    When she saves the form with invalid url
      |strRequired| strEmail      |strPasswordValidation| strConfirmPassword |   strDate          |     strUrl             | strDigitiesOnly| strRango |
      | admin1    |dasg@correo.com |      12355         |       12355        |  12062022        |       testing.com      |       33       |  7       |
    Then check the message of the invalid url
      |    srtInvalidUrls           |
      |Please enter a valid URL.    |

  @scenario6
  Scenario: check message when enter invalid digits
    Given that dayana wants to validate the message of the digits
      | StrUser | StrPassword |
      | demo    |   demo      |
    When she saves the form with invalid digits
      |strRequired| strEmail      |strPasswordValidation| strConfirmPassword |   strDate          |     strUrl             | strDigitiesOnly| strRango |
      | admin1    |dasg@correo.com|      123456S        |       123456S      |  12062022          |  https://testing.com   |      gggg      |  7       |

    Then check the message of the invalid digits
      |  strInvalidDigits       |
      |Please enter only digits.|

  @scenario7
  Scenario: check message when range is invalid
    Given that dayana wants to validate the message of the range
      | StrUser | StrPassword |
      | demo    |   demo      |
    When she saves the form with invalid range
      |strRequired| strEmail      |strPasswordValidation| strConfirmPassword |   strDate          |     strUrl             | strDigitiesOnly| strRango  |
      | admin1    |dasg@correo.com|      123456S        |       123456S      |  12062022          |  https://testing.com   |       33       |  20       |
    Then check the message of the invalid range
      |  strInvalidRange |
      |Please enter a value between 5 and 16.|