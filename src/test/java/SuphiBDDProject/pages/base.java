package SuphiBDDProject.pages;

import SuphiBDDProject.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class base {

    public base() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
