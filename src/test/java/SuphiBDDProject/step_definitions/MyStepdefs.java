package SuphiBDDProject.step_definitions;

import SuphiBDDProject.pages.HomePage;
import SuphiBDDProject.pages.OrderPage;
import SuphiBDDProject.pages.PaymentSucessPage;
import SuphiBDDProject.utils.ConfigurationsReader;
import SuphiBDDProject.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class MyStepdefs {
    HomePage homePage= new HomePage();
    OrderPage orderPage= new OrderPage();
    PaymentSucessPage paymentSucessPage=new PaymentSucessPage();

    @Given("The user is on Guru Payment Gateway page")
    public void theUserIsOnGuruPaymentGatewayPage() {
        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
    }

    @When("The user wants to verify that the header is present as {string}")
    public void theUserWantsToVerifyThatTheHeaderIsPresentAs(String header) {
        Assert.assertEquals(homePage.getHeader().getText(),header);
    }

    @When("The user wants to verify that the toy price is {string}")
    public void theUserWantsToVerifyThatTheToyPriceIs(String price) {
        Assert.assertTrue(homePage.getPrice().getText().contains(price));
    }

    @When("The user wants to verify that the URL contains {string}")
    public void theUserWantsToVerifyThatTheURLContains(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
    }

    @When("The user wants to choose quantity as {string}")
    public void theUserWantsToChooseQuantityAs(String quantity) {
       homePage.setQuantity(quantity);
    }


    @Then("The user wants to click on buy button")
    public void theUserWantsToClickOnBuyButton() {
        homePage.setBuyNowButton();
    }

    @Then("The user enters their card information")
    public void theUserEntersTheirCardInformation(Map<String,String> dataTable) {
        orderPage.getCardNumber().sendKeys(dataTable.get("cardNumber"));
        orderPage.getMonth().sendKeys(dataTable.get("month"));
        orderPage.getYear().sendKeys(dataTable.get("year"));
        orderPage.getCvvCode().sendKeys(dataTable.get("cvvCode"));
    }

    @Then("The user wants to click on pay button")
    public void theUserWantsToClickOnPayButton() {
        orderPage.getSubmitButton();

    }

    @And("The user wants to verify {string} text is present")
    public void theUserWantsToVerifyPaymentSuccessfullTextIsPresent(String expected) {
        Assert.assertEquals(paymentSucessPage.getPaymentSuccess().getText(), expected);

    }

    @When("The user wants to choose different toys {string}")
    public void theUserWantsToChooseDifferentToys(String quantity) {
        homePage.setQuantity(quantity);

    }


}
