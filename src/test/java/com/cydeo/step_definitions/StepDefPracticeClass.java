package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
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

    @Given("Verify Simple dropdown default selected value is correct Expected: Please select an option")
    public void verify_simple_dropdown_default_selected_value_is_correct_expected_please_select_an_option() {
    Select simpleDropDown = new Select(basePage.simpleDrop);

        Assert.assertEquals("Please select an option", simpleDropDown.getFirstSelectedOption().getText());
    }
    @Given("Verify State selection default selected value is correct. Expected: Select a State")
    public void verify_state_selection_default_selected_value_is_correct_expected_select_a_state() {
    Select StateSelect = new Select(basePage.stateSelection);
    Assert.assertEquals("Select a State", basePage.stateSelection.getText());
    }
}
