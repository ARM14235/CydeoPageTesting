package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CydeoProject extends BasePage {
    @Given("User is on Cydeo Practice Page")
    public void user_is_on_cydeo_practice_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));

    }
    @When("user clicks on AB Testing")
    public void user_clicks_on_ab_testing() {

        ABTesting.click();

    }
    @Then("user should see NO AB Testing")
    public void user_should_see_no_ab_testing() {

        Assert.assertTrue(NoABTest.isDisplayed());

    }
}
