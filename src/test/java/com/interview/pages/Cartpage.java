package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {

    public Cartpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement DeleteButton;
    @FindBy(xpath = "//div[@class='a-row sc-cart-header']")
    public WebElement EmptyLabel;

}
