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

        @FindBy(xpath = "//input[@name='checkbox1']")
        public WebElement checkBox1;

        @FindBy(xpath = "//input[@name='checkbox2']")
        public WebElement checkBox2;
//
//        @FindBy(xpath = "//label[.='E-mail']")
//        public WebElement emailText;
//
//        @FindBy(xpath = "//input[@type='text']")
//        public WebElement emailBox;
//
//
//        @FindBy(xpath="//button[@type='submit']")
//        public WebElement retrievePassBtn;
//
//
//        @FindBy(xpath="//div[@style='text-align: center;']")
//        public WebElement poweredByCydeo;




}




