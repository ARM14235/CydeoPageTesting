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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.Set;

public class StepDefPracticeClass {
    BasePage basePage = new BasePage();

    @When("user log in")
    public void user_log_in() {
BrowserUtils.baseLogin("Tester", "test");
    }
    @And("Select familyAlbum from product, set quantity to two")
    public void selectFamilyAlbumFromProductSetQuantityToTwo() throws InterruptedException {
        Thread.sleep(2000);
        basePage.ordersBtn.click();
        Thread.sleep(2000);
        Select select = new Select(basePage.familySelectionBar);
        select.selectByVisibleText("FamilyAlbum");
       WebElement quantity = Driver.getDriver().findElement(By.xpath("//input[contains(@name,'$txtQuantity')]"));
       quantity.clear();
       quantity.sendKeys("2");
    }

    @And("Click to Calculate button")
    public void click_to_calculate_button() throws InterruptedException {
        Thread.sleep(2000);
    basePage.calculateBtn.click();
    }

    @And("Generate: name, street, city, state, zip code")
    public void generate_name_street_city_state_zip_code() throws InterruptedException {
        Faker faker = new Faker();
        basePage.customerName.sendKeys(faker.name().firstName());
        Thread.sleep(2000);
        basePage.street.sendKeys(faker.address().streetAddress());
        Thread.sleep(2000);
        basePage.city.sendKeys(faker.address().city());
        Thread.sleep(2000);
        basePage.state.sendKeys(faker.address().state());
        Thread.sleep(2000);
        basePage.zip.sendKeys("22042");
    }
    @And("Click on visa radio button")
    public void click_on_visa_radio_button() {
    basePage.visa.click();
    }
    @And("Generate card number using JavaFaker")
    public void generate_card_number_using_java_faker() throws InterruptedException {
        Faker faker2 = new Faker();
    Thread.sleep(2000);
        basePage.cardNumber.sendKeys(faker2.numerify("700505050"));
    }
    @And("Click on Process")
    public void click_on_process() throws InterruptedException {

        basePage.expDate.sendKeys("11/20");
        Thread.sleep(2000);
    basePage.process.click();
    }
    @Then("Verify success message “New order has been successfully added.")
    public void verify_success_message_new_order_has_been_successfully_added() {
        assertEquals("New order has been successfully added.", Driver.getDriver().findElement(By.xpath("//strong[contains(text(),'New order has be')]")).getText());
    }

}
