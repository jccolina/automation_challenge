package com.jcolina.core.ui.driver;

import com.jcolina.core.ui.browser.BrowserName;
import com.jcolina.core.utils.Constants;
import com.jcolina.core.utils.EnvReader;
import org.openqa.selenium.WebDriver;

/**
 * Implements singleton pattern to handle a single driver for all the pages
 */
public class DriverManager {
    private static DriverManager driverManager = new DriverManager();
    private WebDriver driver;

    private DriverManager(){
        String browser = EnvReader.getInstance().getValue(Constants.BROSWER_JSON_PATH);
        this.driver = DriverFactory.getDriver(BrowserName.valueOf(browser.toUpperCase()));
        Runtime.getRuntime().addShutdownHook(new Thread(() -> DriverManager.getInstance().getDriver().quit()));
    }

    public static DriverManager getInstance(){
        return driverManager;
    }

    public WebDriver getDriver() {
        return this.driver;
    }


}
