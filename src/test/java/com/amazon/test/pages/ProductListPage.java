package com.amazon.test.pages;

import com.amazon.test.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends DriverFactory {
    @FindBy(css="h2.a-size-medium")
    private List<WebElement> allItems;

    public void items()throws InterruptedException
    {   staticWait(1000);
        System.out.println("The items visible on the page is "+" "+allItems.size());
        allItems.get(1).click();
    }
}
