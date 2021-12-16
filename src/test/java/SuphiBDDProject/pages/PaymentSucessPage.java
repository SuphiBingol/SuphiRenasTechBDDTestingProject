package SuphiBDDProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentSucessPage extends base {

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement paymentSuccess;

    public WebElement getPaymentSuccess() {
        return paymentSuccess;
    }

}

