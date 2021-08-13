package com.jcolina.core.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearch extends AbstractPage {
    private final String SEARCH_OPTION = "//dl[contains(.,'%s')]//dd/*";
    @FindBy(css = "#adv_code_search button")
    private WebElement searchTopButton;

    public AdvancedSearch() {
        super();
    }

    public void setSearchTextOption(final String optionName, final String optionValue) {
        By searchOptionLocator = By.xpath(String.format(SEARCH_OPTION, optionName));
        this.actionsManager.sendText(searchOptionLocator, optionValue);
    }

    public void setSearchSelectOption(final String optionName, final String optionValue) {
        By searchOptionLocator = By.xpath(String.format(SEARCH_OPTION, optionName));
        this.actionsManager.selectOptionByText(searchOptionLocator, optionValue);
    }

    public SearchResults clickSearchButton() {
        this.actionsManager.click(searchTopButton);
        return new SearchResults();
    }
}
