package com.amazon.test.stepdefs;

import com.amazon.test.pages.CheckOutPage;
import com.amazon.test.pages.HomePage;
import com.amazon.test.pages.ProductListPage;
import com.amazon.test.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.ca.I;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToBasketSteps {
    HomePage homePage;
    ProductListPage productlistPage;
    ProductPage productPage;
    CheckOutPage checkOutPage;
    public AddToBasketSteps()
    {
        homePage=new HomePage();
        productlistPage=new ProductListPage();
        productPage=new ProductPage();
        checkOutPage=new CheckOutPage();
    }

    @Given("^User is on the homepage of the amazon site \"([^\"]*)\"$")
    public void userIsOnTheHomepageOfTheAmazonSite(String text)
    {
        homePage.checkAssertion(text);
    }
    @When("^User enters \"([^\"]*)\" in search textbox$")
    public void userEntersInSearchTextbox(String searchitem) throws Throwable
    {
        homePage.searchItem(searchitem);
    }
    @And("^User clicks on search button$")
    public void userClicksOnSearchButton()
    {
        homePage.enterSearch();
    }
    @When("^User selects a product$")
    public void userSelectsAProduct()throws InterruptedException
    {
        productlistPage.items();
    }
    @And("^User adds the product to basket$")
    public void userAddsTheProductToBasket()
    {
        productPage.addItem();
    }
    @Then("^User should view the product added to basket \"([^\"]*)\"$")
    public void userShouldViewTheProductAddedToBasket(String text)
    {
        checkOutPage.assertCheckOut(text);
    }
}
