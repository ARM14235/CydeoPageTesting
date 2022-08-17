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



        @FindBy(xpath = "//a[.='Order']")
        public WebElement ordersBtn;


        @FindBy(xpath="//select[contains(@name,'ctl00$Main')]")
        public WebElement familySelectionBar;


        @FindBy(xpath="//input[@type='submit']")
        public WebElement calculateBtn;

        @FindBy(xpath="//input[contains(@name,'Order$txtName')]")
        public WebElement customerName;


        @FindBy(xpath="//input[contains(@name,'TextBox2')]")
        public WebElement street;

        @FindBy(xpath="//input[contains(@name,'der$TextBox3')]")
        public WebElement city;


        @FindBy(xpath="//input[contains(@name,'der$TextBox4')]")
        public WebElement state;

        @FindBy(xpath="//input[contains(@id,'nt_fmwOrder_TextBox5')]")
        public WebElement zip;


        @FindBy(xpath="(//input[@type='radio'])[1]")
        public WebElement visa;

        @FindBy(xpath="//input[contains(@name,'r$TextBox6')]")
        public WebElement cardNumber;


        @FindBy(xpath="//input[contains(@name,'rder$TextBox1')]")
        public WebElement expDate;

        @FindBy(xpath="//a[.='Process']")
        public WebElement process;



        //LOG IN ELEMENTS
        @FindBy(xpath = "//input[@type='text']")
        public WebElement userName;

        @FindBy(xpath = "//input[@type='password']")
        public  WebElement password;


        @FindBy(xpath = "//input[@type='submit']")
        public  WebElement logIn;



}




