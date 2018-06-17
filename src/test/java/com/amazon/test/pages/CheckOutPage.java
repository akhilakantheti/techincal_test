package com.amazon.test.pages;

import com.amazon.test.drivers.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends DriverFactory {
    @FindBy(xpath="//div[@id='hlb-subcart']/div/span/span/b")
        private WebElement basketSubTotal;
    public void assertCheckOut(String text)
    {
        String actual=basketSubTotal.getText();
        Assert.assertEquals(actual,text);

    }
}
