package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class StepDefPracticeClass {
    BasePage basePage = new BasePage();


        @Given("Login Homepage Login with valid username and password")
        public void login_homepage_login_with_valid_username_and_password() {
            BrowserUtils.baseLogin("helpdesk1@cybertekschool.com", "UserUser");

        }
        @When("Click the MORE tab and select APPRECIATION")
        public void click_the_more_tab_and_select_appreciation() {
          basePage.moreBtn.click();
          basePage.apprecBtn.click();

        }
        @When("Write an Appreciation message")
        public void write_an_appreciation_message() {
            Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.cssSelector(".bx-editor-iframe")));
           basePage.msgBox.sendKeys("jUnitPractice");

        }
        @When("Click the SEND button")
        public void click_the_send_button() {
            Driver.getDriver().switchTo().parentFrame();
        basePage.sendKey.click();

        }
        @Then("Verify the Appreciation message is displayed on the feed")
        public void verify_the_appreciation_message_is_displayed_on_the_feed() {
        String actual = basePage.msgFeed.getText();
        String expected = "jUnitPractice";
        Assert.assertEquals(expected, actual);

        }

    }
