Feature: Booking on Ryanair website

  Scenario: Checkout using an invalid credit card

    Given I make a booking from "Dublin" to "Biarritz" on "15/09/2018" for "2" adults and "1" child
    When I pay for booking with card details "5555 5555 5555 5557", "10/2018" and "265"
    Then I should get payment "declined" message