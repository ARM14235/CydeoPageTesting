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

        @FindBy(xpath = "//h3[contains(text(),'WYSIWYG Editor')]")
        public WebElement hdrText;

        @FindBy(id = "tinymce")
        public WebElement bdyText;


        @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
        public WebElement myFrame;

//        @FindBy(xpath = "//p[.='sdf']")
//        public WebElement otherBody;
//
//
//        @FindBy(xpath="//span[contains(text(),'results,')]")
//        public WebElement result;
//
//
//        @FindBy(xpath="//button[@aria-label='Apply']")
//        public WebElement applyBtno;




}




