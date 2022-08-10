package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class CydeoElemntsDisplay {
BasePage basePage = new BasePage();
    @Given("All elements on Pages are displayed")
    public void all_elements_on_pages_are_displayed() {
        Assert.assertTrue(basePage.home.isDisplayed());
        Assert.assertTrue(basePage.retrievePassBtn.isDisplayed());
        Assert.assertTrue(basePage.emailBox.isDisplayed());
        Assert.assertTrue(basePage.poweredByCydeo.isDisplayed());
        Assert.assertTrue(basePage.forgotPassword.isDisplayed());
        Assert.assertTrue(basePage.emailText.isDisplayed());

    }

}
