package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class YahooTitleVer {


    String actualYahooTitle =  Driver.getDriver().getTitle();;
    String expectedTitle = "Yahoo";
    @When("user is verifying yahoo title")
    public void userIsVerifyingYahooTitle() {
        Assert.assertTrue(actualYahooTitle.contains(expectedTitle));


    }


}
