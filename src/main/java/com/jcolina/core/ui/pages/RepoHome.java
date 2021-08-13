package com.jcolina.core.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepoHome extends AbstractPage {
    @FindBy(css = "[data-target='readme-toc.content']")
    private WebElement readmeText;

    public RepoHome() {
        super();
    }

    public String getReadmeText() {
        return this.actionsManager.getText(readmeText);
    }
}
