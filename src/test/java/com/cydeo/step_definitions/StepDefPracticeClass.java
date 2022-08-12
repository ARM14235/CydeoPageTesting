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

    @When("Clear text from comment body")
    public void clear_text_from_comment_body() {
 Driver.getDriver().switchTo().frame(basePage.myFrame);
        basePage.bdyText.clear();
        basePage.bdyText.sendKeys("Hello World");
    }

    @Then("Verify Hello World text is written in comment body")
    public void verify_hello_world_text_is_written_in_comment_body() {
Assert.assertEquals("Hello World", basePage.bdyText.getText());
    }
    @Then("Verify header An iFrame containing the TinyMCE WYSIWYG Editor is displayed")
    public void verify_header_an_i_frame_containing_the_tiny_mce_wysiwyg_editor_is_displayed() {
Driver.getDriver().switchTo().parentFrame();
Assert.assertTrue(basePage.hdrText.getText().contains("TinyMCE WYSIWYG Editor"));
    }
    }
