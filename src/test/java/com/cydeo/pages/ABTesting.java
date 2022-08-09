package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTesting {

     public ABTesting(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

    @FindBy(xpath = "//a[.='A/B Testing']")
    public WebElement ABTesting;


     @FindBy(xpath="//h3[.='No A/B Test']")
    public WebElement NoABTest;


}
