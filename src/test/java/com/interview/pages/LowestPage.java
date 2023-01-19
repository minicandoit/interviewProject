package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LowestPage {

    public LowestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']")
    public WebElement lowestItem;

}
