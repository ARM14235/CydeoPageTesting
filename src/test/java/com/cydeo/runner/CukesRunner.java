package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "me.jvt.cucumber.report.PrettyReports:target/cucumber",
//ABCD
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@webAppLogin"
)
public class CukesRunner {
}
