package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonSplashPage {

    public AmazonSplashPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement SearchBox;
    @FindBy(id = "nav-search-submit-button")
    public WebElement SearchButton;
    @FindBy(xpath = "//div[@class='s-suggestion s-suggestion-ellipsis-direction']")
    public List<WebElement> SearchOptions;

    @FindBy(id = "nav-cart")
    public WebElement CartButton;


}
