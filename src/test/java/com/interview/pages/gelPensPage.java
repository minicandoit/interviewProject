package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gelPensPage {
    public gelPensPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Price: Low to High']")
    public WebElement LowToHigh;
    @FindBy(id = "a-autoid-0-announce")
    public WebElement SortByButton;



}
