package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
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

    @When("Click to Click for JS Prompt button")
    public void click_to_click_for_js_prompt_button() {
    basePage.jsPrompt.click();

    }

    @When("Send hello text to alert")
    public void send_hello_text_to_alert() {
        Alert myAlert = Driver.getDriver().switchTo().alert();
    myAlert.sendKeys("hello");
    myAlert.accept();
    }

    @Then("Verify “You entered:  hello text is displayed.")
    public void verify_you_entered_hello_text_is_displayed() {
    Assert.assertEquals("You entered: hello", basePage.jsMsg.getText());

    }
    }
