package com.google.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Google extends BasePage {

    @FindBy(xpath = "//a[.='Gmail']")
    public WebElement gmail;
}
