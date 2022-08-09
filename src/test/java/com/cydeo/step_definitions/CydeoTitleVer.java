package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CydeoTitleVer {
    String CydeoTitle;
    String CydeoURL;
    @When("get Cydeo title")
    public void getCydeoTitle() {
        CydeoTitle = Driver.getDriver().getTitle();

    }

    @Then("user should see Cydeo URL")
    public void userShouldSeeCydeoOnTitle() {
        CydeoURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(CydeoURL.contains("cydeo"));

    }

    @And("user should see Practice on title")
    public void userShouldSeePracticeOnTitle() {
        Assert.assertEquals("Practice", CydeoTitle);

    }
}
