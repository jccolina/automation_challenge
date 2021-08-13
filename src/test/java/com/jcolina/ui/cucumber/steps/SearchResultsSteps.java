package com.jcolina.ui.cucumber.steps;

import com.jcolina.core.ui.pages.SearchResults;
import com.jcolina.core.utils.TextUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultsSteps {
    private final SearchResults searchResults;

    public SearchResultsSteps(SearchResults searchResults) {
        this.searchResults = searchResults;
    }

    @Given("I go to advanced filters")
    public void iGoToAdvancedFilters() {
        this.searchResults.clickAdvancedSearchLink();
    }

    @Then("I should see {string} label in results")
    public void iShouldSeeRepoInResults(String expectedResultsLabel) {
        String actualResultsLabel = this.searchResults.getSearchResultsLabel();
        Assert.assertEquals(expectedResultsLabel, actualResultsLabel);
    }

    @And("I should see the repo {string} in search results")
    public void iShouldSeeTheRepoInSearchResults(String expectedRepoName) {
        Assert.assertTrue("Repo: " + expectedRepoName + " is not present in search results.",
                this.searchResults.isRepoPresent(expectedRepoName));
    }

    @And("I open the repo {string} in search results")
    public void iOpenTheRepoInSearchResults(String repoName) {
        this.searchResults.openRepoInResults(repoName);
    }

    @And("I should see {int} repos in search results")
    public void iShouldSeeReposInSearchResults(int expectedNumberOfRepos) {
        int actualNumberOfRepos = this.searchResults.getNumberOfResultsDisplayed();
        Assert.assertEquals(expectedNumberOfRepos, actualNumberOfRepos);
    }
}
