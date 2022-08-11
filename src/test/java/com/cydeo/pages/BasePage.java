package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

        public BasePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//select[@id='dropdown']")
        public WebElement simpleDrop;

        @FindBy(xpath = "//select[@id='state']")
        public WebElement stateSelection;
//
//        @FindBy(xpath = "//label[@for='special-offers-free-shipping']")
//        public WebElement freeShipping;
//
//        @FindBy(xpath = "//label[contains(text(),'Under $25')]")
//        public WebElement under$25;
//
//
//        @FindBy(xpath="//span[contains(text(),'results,')]")
//        public WebElement result;
//
//
//        @FindBy(xpath="//button[@aria-label='Apply']")
//        public WebElement applyBtno;




}




