package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StepDefPracticeClass {

BasePage basePage = new BasePage();



    @Given("Confirm checkbox #{int} is NOT selected by default")
    public void confirm_checkbox_is_not_selected_by_default(Integer int1) {
        basePage.checkBox1.isSelected();
    }
    @When("Confirm checkbox #{int} is SELECTED by default.")
    public void confirm_checkbox_is_selected_by_default(Integer int1) {
        basePage.checkBox2.isSelected();
    }
    @When("Click checkbox #{int} to select it.")
    public void click_checkbox_to_select_it(Integer int1) {
    basePage.checkBox1.click();
    }
    @When("Click checkbox #{int} to deselect it.")
    public void click_checkbox_to_deselect_it(Integer int1) {
    basePage.checkBox2.click();
    }
    @When("Confirm checkbox #{int} is SELECTED.")
    public void confirm_checkbox_is_selected(Integer int1) {
    basePage.checkBox1.isSelected();
    }
    @Then("Confirm checkbox #{int} is NOT selected.")
    public void confirm_checkbox_is_not_selected(Integer int1) {
    basePage.checkBox2.isSelected();
    }

}
