package com.jcolina.core.ui.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsManager {
    private WebDriver driver;
    private WebDriverWait wait;

    public ActionsManager(final WebDriver driver,final WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void click(final By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void click(final WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void sendText(final By locator, final String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(text);
    }

    public void sendText(final WebElement element, final Keys key) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(key);
    }

    public void sendText(final WebElement element, final String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public String getText(final WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void selectOptionByText(final By locator, final String option) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select selector = new Select(element);
        selector.selectByVisibleText(option);
    }

}
