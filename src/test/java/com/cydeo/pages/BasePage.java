package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        public BasePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath="(//input[@class='login-inp'])[1]")
        public WebElement userName;

        @FindBy(xpath = "(//input[@class='login-inp'])[2]")
        public WebElement password;

        @FindBy(xpath = "//input[@class='login-btn']")
        public WebElement loginBtn;

        @FindBy(xpath = "//div[@class='errortext']")
        public WebElement errorMsg;

        //----------


        @FindBy(xpath="(//a[@class='gb_d'])[1]")
        public WebElement gmailLink;



}




