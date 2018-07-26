$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Booking.feature");
formatter.feature({
  "line": 1,
  "name": "Booking on Ryanair website",
  "description": "",
  "id": "booking-on-ryanair-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 54029490829,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Checkout using an invalid credit card",
  "description": "",
  "id": "booking-on-ryanair-website;checkout-using-an-invalid-credit-card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I make a booking from \"Dublin\" to \"Biarritz\" on \"15/09/2018\" for \"2\" adults and \"1\" child",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I pay for booking with card details \"5555 5555 5555 5557\", \"10/2018\" and \"265\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get payment \"declined\" message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Dublin",
      "offset": 23
    },
    {
      "val": "Biarritz",
      "offset": 35
    },
    {
      "val": "15/09/2018",
      "offset": 49
    },
    {
      "val": "2",
      "offset": 66
    },
    {
      "val": "1",
      "offset": 81
    }
  ],
  "location": "BookingSteps.iMakeABookingFromToOnForAdultsAndChild(String,String,String,int,int)"
});
formatter.result({
  "duration": 5258742446,
  "error_message": "java.lang.NullPointerException\r\n\tat Steps.BookingSteps.iMakeABookingFromToOnForAdultsAndChild(BookingSteps.java:31)\r\n\tat ✽.Given I make a booking from \"Dublin\" to \"Biarritz\" on \"15/09/2018\" for \"2\" adults and \"1\" child(Booking.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "5555 5555 5555 5557",
      "offset": 37
    },
    {
      "val": "10/2018",
      "offset": 60
    },
    {
      "val": "265",
      "offset": 74
    }
  ],
  "location": "BookingSteps.iPayForBookingWithCardDetailsAnd(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "declined",
      "offset": 22
    }
  ],
  "location": "BookingSteps.iShouldGetPaymentMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4573024439,
  "status": "passed"
});
});