package com.amazon.test.pages;

import com.amazon.test.drivers.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory{
    @FindBy(xpath = "//div[@id='nav-logo']/a/span")
    private WebElement amazon;
    @FindBy(css="#twotabsearchtextbox")
    private WebElement search;
    @FindBy(className = "nav-input")
    private WebElement searchMagnifier;
    public void checkAssertion(String text)
    {
        String actual=amazon.getText();
        Assert.assertEquals(actual,text);
    }
    public void searchItem(String item)
    {
        search.sendKeys(item);
    }
    public void enterSearch()
    {
        searchMagnifier.sendKeys(Keys.ENTER);
    }
}
