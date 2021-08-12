package com.jcolina.core.ui.pages;

import com.jcolina.core.ui.driver.ActionsManager;
import com.jcolina.core.utils.Constants;
import com.jcolina.core.ui.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ActionsManager actionsManager;

    public AbstractPage() {
        this.driver = DriverManager.getInstance().getDriver();
        this.wait = new WebDriverWait(this.driver, Constants.WAIT_TIMEOUT_IN_SECONDS);
        this.actionsManager = new ActionsManager(this.driver, this.wait);

        PageFactory.initElements(this.driver, this);
    }

}
