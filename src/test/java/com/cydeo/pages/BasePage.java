package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

        public  BasePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }



        @FindBy(xpath = "//span[contains(@id,'link-text')]")
        public WebElement moreBtn;


        @FindBy(xpath="//span[.='Appreciation']")
        public WebElement apprecBtn;


        @FindBy(xpath="//body[@contenteditable='true']")
        public WebElement msgBox;

        @FindBy(xpath="//div[starts-with(@id,'blog_post_body')]")
        public WebElement msgFeed;


        @FindBy(xpath="//button[@id='blog-submit-button-save']")
        public WebElement sendKey;






        //LOG IN ELEMENTS
        @FindBy(xpath = "(//input[@class='login-inp'])[1]")
        public WebElement logInBox;

        @FindBy(xpath = "(//input[@class='login-inp'])[2]")
        public  WebElement passBox;


        @FindBy(xpath = "//input[@type='submit']")
        public  WebElement logInBtn;



}




