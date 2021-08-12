package com.jcolina.core.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults extends AbstractPage {
    @FindBy(css = ".d-md-block>[href*='Repositories']")
    private WebElement advancedSearchLink;
    @FindBy(xpath = "//li[contains(@class,'repo-list-item')]//a[@class='v-align-middle']")
    private List<WebElement> searchResultsRepoList;
    @FindBy(css = ".codesearch-results h3")
    private WebElement searchResultsLabel;
    private final String REPO_NAME_LINK = "//a[.='%s']";

    public SearchResults() {
        super();
    }

    public AdvancedSearch clickAdvancedSearchLink() {
        this.actionsManager.click(this.advancedSearchLink);
        return new AdvancedSearch();
    }

    public Integer getNumberOfResultsDisplayed() {
        return this.searchResultsRepoList.size();
    }

    public String getFirstResultName() {
        return this.actionsManager.getText(searchResultsRepoList.get(0));
    }

    public String getSearchResultsLabel() {
        return this.actionsManager.getText(this.searchResultsLabel);
    }

    public RepoHome openRepoInResults(final String repoName) {
        By repoNameLocator = By.xpath(String.format(REPO_NAME_LINK, repoName));
        this.actionsManager.click(repoNameLocator);
        return new RepoHome();
    }
}
