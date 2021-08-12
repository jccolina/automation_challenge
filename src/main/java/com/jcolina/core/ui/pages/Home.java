package com.jcolina.core.ui.pages;

import com.jcolina.core.utils.Constants;
import com.jcolina.core.utils.EnvReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends AbstractPage {
    private final String HOME_URL = EnvReader.getInstance().getValue(Constants.URL_JSON_PATH);
    @FindBy(css = "[data-test-selector='nav-search-input']")
    private WebElement searchTextField;

    public Home() {
        super();
    }

    public void goToHomePage() {
        this.driver.get(HOME_URL);
    }

    public SearchResults searchRepo(String repoName) {
        this.actionsManager.click(searchTextField);
        this.actionsManager.sendText(searchTextField, repoName);
        this.actionsManager.sendText(searchTextField, Keys.ENTER);
        return new SearchResults();
    }
}
