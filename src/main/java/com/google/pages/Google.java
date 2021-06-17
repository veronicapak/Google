package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Google {

    public Google(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
