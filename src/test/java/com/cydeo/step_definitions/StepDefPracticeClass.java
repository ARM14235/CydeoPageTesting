package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.Set;

public class StepDefPracticeClass {
BasePage basePage = new BasePage();

    @Given("User logged in to SmartBear.com")
    public void user_logged_in_to_smart_bear_com() {
    BrowserUtils.baseLogin("Tester", "test");

    }
    @When("Click on Order")
    public void click_on_order() {
    basePage.ordersBtn.click();
    }

    @And("Select familyAlbum from product, set quantity to two")
    public void selectFamilyAlbumFromProductSetQuantityToTwo() {
        Select select = new Select(basePage.familySelectionBar);
        select.selectByVisibleText("FamilyAlbum");

        WebElement quantity = Driver.getDriver().findElement(By.xpath("//input[contains(@name,'rder$txtQuantity')]"));
        quantity.click();
        quantity.sendKeys("2");

    }

    @When("Click to Calculate button")
    public void clickToCalculateButton() {
        basePage.calculateBtn.click();
    }
    @When("Generate: name, street, city, state, zip code using Java Faker")
    public void generate_name_street_city_state_zip_code_using_java_faker() {
        Faker faker = new Faker();
        basePage.customerName.sendKeys(faker.name().firstName());
        basePage.street.sendKeys(faker.address().streetAddress());
        basePage.city.sendKeys(faker.address().city());
        basePage.state.sendKeys(faker.address().state());
        basePage.zip.sendKeys("22041");
    }

    @And("Click on visa radio button")
    public void clickOnVisaRadioButton() {
        basePage.visa.click();
    }

    @When("Generate card number using JavaFaker")
    public void generateCardNumberUsingJavaFaker() {
        Faker faker2 = new Faker();
        basePage.cardNumber.sendKeys("12345678910112");
    }

    @And("Click on Process")
    public void clickOnProcess() {
        basePage.expDate.sendKeys("11/21");
        basePage.process.click();
    }

    @Then("Verify success message New order has been successfully added.")
    public void verify_success_message_new_order_has_been_successfully_added() {

        assertEquals("New order has been successfully added.", basePage.textVer.getText());

    }
}
