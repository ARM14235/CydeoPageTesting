package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StepDefPracticeClass {
BasePage basePage = new BasePage();
Select multiSelc = new Select(basePage.multiple);

    @When("Select all the options from multiple select dropdown.")
    public void select_all_the_options_from_multiple_select_dropdown() {
        for (WebElement each : multiSelc.getOptions()) {
            each.click();
            System.out.println(each.getText());
            multiSelc.deselectAll();

        }
    }
    }