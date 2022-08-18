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



        @FindBy(xpath = "//a[.='Order']")
        public WebElement ordersBtn;


        @FindBy(xpath="//select[contains(@name,'Order$ddlProduct')]")
        public WebElement familySelectionBar;


        @FindBy(xpath="//input[@type='submit']")
        public WebElement calculateBtn;

        @FindBy(xpath="//input[contains(@name,'nt$fmwOrder$txtName')]")
        public WebElement customerName;


        @FindBy(xpath="//input[contains(@name,'wOrder$TextBox2')]")
        public WebElement street;

        @FindBy(xpath="//input[contains(@name,'mwOrder$TextBox3')]")
        public WebElement city;


        @FindBy(xpath="//input[contains(@name,'wOrder$TextBox4')]")
        public WebElement state;

        @FindBy(xpath="//input[contains(@name,'Order$TextBox5')]")
        public WebElement zip;


        @FindBy(xpath="//input[contains(@id,'rder_cardList_0')]")
        public WebElement visa;

        @FindBy(xpath="//input[contains(@id,'wOrder_TextBox6')]")
        public WebElement cardNumber;


        @FindBy(xpath="//input[contains(@id,'er_TextBox1')]")
        public WebElement expDate;

        @FindBy(xpath="//a[contains(@id,'Order_InsertButton')]")
        public WebElement process;


        @FindBy(xpath="//strong[contains(text(),'has been successfully')]")
        public WebElement textVer;


        //LOG IN ELEMENTS
        @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
        public WebElement userName;

        @FindBy(xpath = "//input[@type='password']")
        public  WebElement password;


        @FindBy(xpath = "//input[@type='submit']")
        public  WebElement logIn;



}




