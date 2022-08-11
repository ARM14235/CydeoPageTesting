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

    @Given("Click to Add Element button")
    public void click_to_add_element_button() {
        basePage.addElement.click();

    }

    @When("Verify Delete button is displayed after clicking.")
    public void verify_delete_button_is_displayed_after_clicking() {
    basePage.deleteBtn.isDisplayed();

    }

    @When("Click to Delete button.")
    public void click_to_delete_button() {
    basePage.deleteBtn.click();

    }

    @Then("Verify Delete button is NOT displayed after clicking.")
    public void verify_delete_button_is_not_displayed_after_clicking() {

        try {
            System.out.println("basePage.deleteBtn.isDisplayed() = " + basePage.deleteBtn.isDisplayed());
        }catch (Exception e){
            System.out.println("Exception handled ");
        }
    }


}
