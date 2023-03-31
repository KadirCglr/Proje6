Feature: Login Step


  Scenario Outline: Login Functionality

    Given Navigate to site

    When gecerli kullanici adi "<name>" ve password "<code>" ile login olunuz

    Then login oldugunuzu dogrulayiniz
    And logout olunuz
    Examples:
      | name   | code   |
      | kadirD | 352347 |

  Scenario Outline: Logout
    Given Navigate to site

    When gecersiz kullanici adi "<name>" ve password "<code>" ile login olunuz

    Then login olmadiginizi dogrulayiniz

    Examples:
      | name  | code |
      | kadir | 1232 |




