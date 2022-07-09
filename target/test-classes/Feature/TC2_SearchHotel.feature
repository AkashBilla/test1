@SearchPage
Feature: Validating Adactin SearchHotel Page

  Scenario Outline: Validating adactin search hotel page using all fields
    Given User is on the adactin login page
    When User should login using "<userName>" and "<passWord>"
    Then After login User should verify successful login message "Hello viicckkiiee!"
    When User should search hotel using "<location>" , "<hotel>" , "<roomType>" , "<noOfRoom>" , "<dateIn>" , "<dateOut>" , "<adultCount>" and "<childCount>"
    Then After searching hotel User should verify "Select Hotel" message

    Examples: 
      | userName    | passWord | location | hotel       | roomType | noOfRoom | dateIn     | dateOut    | adultCount | childCount |
      | viicckkiiee | EQ5857   | Sydney   | Hotel Creek | Double   | 2 - Two  | 22-06-2022 | 22-06-2022 | 2 - Two    | 1 - One    |

  Scenario Outline: Validating adactin search hotel page using only mandatory fields
    Given User is on the adactin login page
    When User should login using "<userName>" and "<passWord>"
    Then After login User should verify successful login message "Hello viicckkiiee!"
    When User should search hotel using mandatory fields "<location>" , "<dateIn>" and "<dateOut>"
    Then After searching hotel User should verify "Select Hotel" message

    Examples: 
      | userName    | passWord | location | dateIn     | dateOut    |
      | viicckkiiee | EQ5857   | Sydney   | 22-06-2022 | 22-06-2022 |

  Scenario Outline: Validating adactin search hotel page using invalid CheckIn Date
    Given User is on the adactin login page
    When User should login using "<userName>" and "<passWord>"
    Then After login User should verify successful login message "Hello viicckkiiee!"
    When User should search hotel using mandatory fields "<location>" , "<dateIn>" and "<dateOut>"
    Then After searching hotel User should verify Date out-of-range error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName    | passWord | location | DateIn     | dateOut   |
      | viicckkiiee | EQ5857   | Sydney   | 22-06-2023 | 22-6-2022 |

  Scenario Outline: Validating adactin search hotel page without entering any fields
    Given User is on the adactin login page
    When User should login using "<userName>" and "<passWord>"
    Then After login User should verify successful login message "Hello viicckkiiee!"
    When User should search hotel without entering any fields
    Then After searching hotel User should verify not selecting location error message "Please Select a Location"

    Examples: 
      | userName    | passWord |
      | viicckkiiee | EQ5857   |
