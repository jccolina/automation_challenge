package com.jcolina.core.ui.driver;

import com.jcolina.core.ui.browser.Browser;
import com.jcolina.core.ui.browser.BrowserName;
import com.jcolina.core.ui.browser.Chrome;
import com.jcolina.core.ui.browser.Firefox;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {
    private static final Map<BrowserName, Supplier<Browser>> DRIVERS = new HashMap<>();

    static {
        DRIVERS.put(BrowserName.CHROME, Chrome::new);
        DRIVERS.put(BrowserName.FIREFOX, Firefox::new);
    }

    public static WebDriver getDriver(final BrowserName browser) {
        return DRIVERS.get(browser).get().getDriver();
    }
}
