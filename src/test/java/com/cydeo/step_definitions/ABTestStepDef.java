package com.cydeo.step_definitions;

import com.cydeo.pages.ABTestingElemPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ABTestStepDef {
    ABTestingElemPage abTestObject = new ABTestingElemPage();

    @When("user clicks on AB Testing")
    public void user_clicks_on_ab_testing() {

       abTestObject.ABTesting.click();


    }
    @Then("user should see NO AB Testing")
    public void user_should_see_no_ab_testing() {

       Assert.assertTrue(abTestObject.NoABTest.isDisplayed());

    }
}
