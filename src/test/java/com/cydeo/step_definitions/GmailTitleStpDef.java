package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class GmailTitleStpDef {
    BasePage basePage = new BasePage();
    @When("Click to Gmail from top right and verify title Gmail.")
    public void click_to_gmail_from_top_right_and_verify_title_gmail() {
       basePage.gmailLink.click();
       Assert.assertTrue(Driver.getDriver().getTitle().contains("Gmail"));
    }
    @Then("Go back to Google by using the and verify Title is google.")
    public void go_back_to_google_by_using_the_back_and_verify_title_is_google() {
    Driver.getDriver().navigate().back();
    Assert.assertEquals("Google", Driver.getDriver().getTitle());

    }
}
