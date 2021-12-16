package SuphiBDDProject.pages;

import SuphiBDDProject.utils.CommonUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends base{

       @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
       private WebElement header;

       @FindBy(xpath = "//h3[.='Price: $20']")
       private WebElement price;

       @FindBy(xpath = "//select[@name='quantity']")
       private WebElement quantityButton;

       @FindBy(xpath = "//input[@value='Buy Now']")
       private WebElement buyNowButton;

       public WebElement getHeader() {
              return header;
       }

       public WebElement getPrice() {
              return price;
       }

       public void setQuantity(String quantity) {

              CommonUtils.selectFromDropDown(quantityButton,quantity);
       }

       public void setBuyNowButton() {
              CommonUtils.clickWithWait(buyNowButton);
       }



}
