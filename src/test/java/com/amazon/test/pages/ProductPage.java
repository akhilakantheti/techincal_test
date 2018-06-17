package com.amazon.test.pages;

import com.amazon.test.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends DriverFactory {

    @FindBy(id="add-to-cart-button")
    private WebElement addToBasket;

    public void addItem()
    {
        addToBasket.click();
    }
}
