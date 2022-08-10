package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CydeoElemntsDisplay {

BasePage basePage = new BasePage();
    List<WebElement> linksList = basePage.allLinks;

    @Given("Print out the number of the links on the page.")
    public void print_out_the_number_of_the_links_on_the_page() {
        System.out.println("linksList.size() = " + linksList.size());
    }
    @When("Print out the texts of the links.")
    public void print_out_the_texts_of_the_links() {
        for (WebElement eachLink : linksList){
            System.out.println("eachLink.getText() = " + eachLink.getText());
            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
        }
    }
}
