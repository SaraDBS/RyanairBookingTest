package Steps;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Sara on 21/07/2018.
 */
public class BookingSteps extends RyanairBasePage {

    public BookingSteps(BaseUtil base) { super(base); }

    HomePage homePage;
    SelectingFarePage farePage;
    SelectingSeatsPage seatsPage;
    SignUpToCheckoutPage signUpPage;
    CheckoutAndPaymentPage checkoutPage;

    @Given("^I make a booking from \"([^\"]*)\" to \"([^\"]*)\" on \"([^\"]*)\" for \"([^\"]*)\" adults and \"([^\"]*)\" child$")
    public void iMakeABookingFromToOnForAdultsAndChild(String from, String to, String dateOfTrip, int nAdults, int nChildren) {

        String day = dateOfTrip.split("/")[0];
        String month = dateOfTrip.split("/")[1];
        String year = dateOfTrip.split("/")[2];

        homePage.makeABooking(to, day, month, year, nAdults, nChildren);
        farePage.selectFlightAndPrice();
        seatsPage.selectSeats(nAdults+nChildren);
        seatsPage.dismissAddOnsAndClickCheckout();
        seatsPage.dismissAddOnsAndClickCheckout();
        signUpPage.signUpAndSubmit();
        checkoutPage.fillPassengerDetails(nAdults+nChildren);

    }

    @When("^I pay for booking with card details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iPayForBookingWithCardDetailsAnd(String ccNumber, String expiryDate, String securityCode) throws Throwable {

        checkoutPage.fillBillingAddressDetails();
        String expiryMonth = expiryDate.split("/")[0];
        String expiryYear = expiryDate.split("/")[1];
        checkoutPage.fillCreditCardDetails(ccNumber, expiryMonth, expiryYear, securityCode);
    }

    @Then("^I should get payment \"([^\"]*)\" message$")
    public void iShouldGetPaymentMessage(String declinedMessage) {

        Assert.assertTrue(checkoutPage.getPaymentDeclinedMessage().toLowerCase().contains(declinedMessage));

    }

}
