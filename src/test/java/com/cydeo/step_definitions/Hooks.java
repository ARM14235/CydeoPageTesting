package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.List;

public class Hooks {

    @Before
    public void user_is_on_cydeo_practice_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoURL"));

    }



    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()) {

                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());

            }

        Driver.closeDriver();
        }



    }


