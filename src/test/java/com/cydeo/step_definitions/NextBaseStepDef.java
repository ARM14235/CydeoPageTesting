package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class NextBaseStepDef {
    BasePage basePage = new BasePage();

    @When("user Enter incorrect username: “incorrect”")
    public void user_enter_incorrect_username_incorrect() {
        basePage.userName.sendKeys("incorrect" + Keys.ENTER);
    }


    @When("user Enter incorrect password: “incorrect”")
    public void user_enter_incorrect_password_incorrect() {
        basePage.password.sendKeys("incorrect" + Keys.ENTER);
    }


    @When("user Click to login button.")
    public void user_click_to_login_button() {
        basePage.loginBtn.click();
    }




    @Then("Verify error message text is as expected: Expected: Incorrect login or password")
    public void verify_error_message_text_is_as_expected_expected_incorrect_login_or_password() {
    String expected = "Incorrect login or password";
    String actual = basePage.errorMsg.getText();

        Assert.assertEquals(expected, actual);

    }

}
