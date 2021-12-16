package SuphiBDDProject.pages;

import SuphiBDDProject.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends base{

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(id = "cvv_code")
    private WebElement cvvCode;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;



    public WebElement getCardNumber() {
        return cardNumber;
    }

    public WebElement getMonth() {
        return month;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getCvvCode() {
        return cvvCode;
    }

    public void getSubmitButton() {
        CommonUtils.clickWithWait(submitButton);
    }

}

