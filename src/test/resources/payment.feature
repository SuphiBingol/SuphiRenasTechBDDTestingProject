Feature:

  Background:

    Given The user is on Guru Payment Gateway page

  @Smoke
  Scenario: Verify header
    When The user wants to verify that the header is present as "Mother Elephant With Babies Soft Toy"

    @Smoke
    Scenario: Verify the toy price
      When The user wants to verify that the toy price is "$20"

      @Smoke
      Scenario:Verify the URL
      When The user wants to verify that the URL contains "payment-gateway"

        @Smoke
        Scenario: The user wants to choose quantity
          When The user wants to choose quantity as "5"
          Then The user wants to click on buy button
          Then The user enters their card information
          |cardNumber | 1234567890123456|
          |month   | 06              |
          |year    | 2023            |
          |cvvCode    | 345             |
          Then The user wants to click on pay button
          And The user wants to verify "Payment successfull!" text is present

  @Regression
  Scenario Outline: Choose different quantities
    When The user wants to choose different toys "<quantity>"
    Then The user wants to click on buy button
    Then The user enters their card information
      | cardNumber | 1234567890123456 |
      | month   | 06               |
      | year    | 2023             |
      | cvvCode    | 345              |

    Then The user wants to click on pay button
    And The user wants to verify 'Payment successfull!' text is present

    Examples:

      | quantity |
      | 5        |
      | 8        |
      | 9        |
      | 2        |
      | 4        |




