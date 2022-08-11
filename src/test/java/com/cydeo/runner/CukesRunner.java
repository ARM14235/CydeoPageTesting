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
        dryRun = true,
        tags = "@wip"
)
public class CukesRunner {
}
