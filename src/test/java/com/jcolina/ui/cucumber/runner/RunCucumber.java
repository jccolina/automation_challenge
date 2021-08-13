package com.jcolina.ui.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:reports/tests-output.json",
                "de.monochromata.cucumber.report.PrettyReports:reports/"
        },
        features = "src/test/resources/scenarios",
        glue = "com.jcolina.ui.cucumber"
)
public class RunCucumber {
}
