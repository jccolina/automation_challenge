package com.jcolina.ui.cucumber.hooks;

import com.jcolina.core.ui.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class OverallHooks {
    @After
    public static void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            WebDriver driver = DriverManager.getInstance().getDriver();
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
    }

}
