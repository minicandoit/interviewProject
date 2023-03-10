package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LowestItemPage {

    public LowestItemPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "quantity")
    public WebElement Quantity;
    @FindBy(id = "add-to-cart-button")
    public WebElement AddToCartButton;

}
