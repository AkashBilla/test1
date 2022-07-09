@CancelBookingPage
Feature: Validating Adactin CancelBooking Page

  Scenario Outline: Validating adactin cancel booking page by cancelling generated order id
    Given User is on the adactin login page
    When User should login using "<userName>" and "<passWord>"
    Then After login User should verify successful login message "Hello viicckkiiee!"
    When User should search hotel using "<location>" , "<hotel>" , "<roomType>" , "<noOfRoom>" , "<dateIn>" , "<dateOut>" , "<adultCount>" and "<childCount>"
    Then After searching hotel User should verify "Select Hotel" message
    When User should select a hotel and click continue
    And After selecting a hotel successfully User should verify "Book A Hotel" message
    And User should book the hotel with all mandatory fields like "<firstName>","<lastName>","<address>" and save the order id
      | CreditCardType   | CreditCardNo     | ExpMonth | ExpYear | CVV |
      | American Express | 5432167899876234 | June     |    2022 | 324 |
      | VISA             | 4432143899876243 | July     |    2022 | 234 |
      | Master Card      | 6432167899876278 | August   |    2022 | 456 |
    And After booking hotel successfully User should verify "Booking Confirmation" message
    And User should cancel the generated order id
    Then After cancelling the order id User should verify cancellation msg "The booking has been cancelled."

    Examples: 
      | userName    | passWord | location | hotel       | roomType | noOfRoom | adultCount | childCount | dateIn     | dateOut    | firstName | lastName | address |
      | viicckkiiee | EQ5857   | Sydney   | Hotel Creek | Standard | 2 - Two  | 2 - Two    | 2 - Two    | 22/06/2022 | 22/06/2022 | Rahim     | Sterling | England |

  Scenario Outline: Validating adactin cancel booking page by cancelling existing order id
    Given User is on the adactin login page
    When User should login using "<userName>" and "<passWord>"
    Then After login User should verify successful login message "Hello viicckkiiee!"
    When User should cancel the existing order id "<OrderId>"
    Then After cancelling the order id User should verify cancellation msg "The booking has been cancelled."

    Examples: 
      | userName    | passWord |
      | viicckkiiee | EQ5857   |
