package com.interview.stepDefinitions;

import com.interview.pages.*;
import com.interview.utilities.BrowserUtils;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class search_StepDefinitions {
AmazonSplashPage amazonSplashPage=new AmazonSplashPage();
gelPensPage gelPensPage=new gelPensPage();
LowestPage lowestPage=new LowestPage();
LowestItemPage lowestItemPage=new LowestItemPage();
Cartpage cartpage=new Cartpage();


    @Given("user is on the Amazon page")
    public void user_is_on_the_amazon_page() {
        String url= ConfigurationReader.getProperty("AmazonHomePage");
        Driver.getDriver().get(url);
        BrowserUtils.sleep(3);
    }

    @When("user type {string} in the search box")
    public void user_type_in_the_search_box(String string) {
        amazonSplashPage.SearchBox.sendKeys(ConfigurationReader.getProperty("keyword"));
        BrowserUtils.sleep(3);
    }
    @Then("suggestion is displayed")
    public void suggestion_is_displayed() {
        for (WebElement eachOption : amazonSplashPage.SearchOptions) {
            System.out.println("eachLink = " + eachOption.getText());
           String eachText=eachOption.getText();
           // BrowserUtils.sleep(1);
            Assert.assertTrue(eachOption.isDisplayed());
            Assert.assertTrue(eachText.contains("pen"));
        }
    }
    @Then("Check the search result is containing {string} in its title")
    public void check_the_search_result_is_containing_in_its_title(String string) {
        //did it in the For loop
        //click search button
        amazonSplashPage.SearchButton.click();
        BrowserUtils.sleep(3);

    }
    @Then("Changed the sort by as price low to high")
    public void changed_the_sort_by_as_price_low_to_high() {
        gelPensPage.SortByButton.click();

        gelPensPage.LowToHigh.click();
    }
    @Then("click on the item that has lowest price in the search list")
    public void click_on_the_item_that_has_lowest_price_in_the_search_list() {
lowestPage.lowestItem.click();
    }
    @Then("Change quantity to {int} then add to cart.")
    public void change_quantity_to_then_add_to_cart(Integer int1) {
       // lowestItemPage.Quantity
        Select select=new Select(lowestItemPage.Quantity);
        select.selectByValue("2");
        //add to cart
        lowestItemPage.AddToCartButton.click();
        //Go to cart
        amazonSplashPage.CartButton.click();

    }
    @Then("Empty cart")
    public void empty_cart() {
cartpage.DeleteButton.click();
    }



    @Then("validate {string}message.")
    public void validateMessage(String arg0) {
cartpage.EmptyLabel.isDisplayed();
Assert.assertTrue(cartpage.EmptyLabel.getText().contains("Your Amazon Cart is empty."));
        Driver.getDriver().close();

    }
}
