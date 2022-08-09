package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"me.jvt.cucumber.report.PrettyReports:target/cucumber",
        "json:target/cucumber.json"},

        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@smoke"
)
public class CukesRunner {
}

//How Jenkins Work
//What are utility Methods
// Creat Object of The class rather than extending it.
