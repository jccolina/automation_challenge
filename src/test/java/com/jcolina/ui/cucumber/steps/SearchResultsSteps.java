package com.jcolina.ui.cucumber.steps;

import com.jcolina.core.ui.pages.SearchResults;
import com.jcolina.core.utils.TextUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultsSteps {
    private final SearchResults searchResults;
    private final String NUMBER_OF_RESULTS_REGEX = "([0-9]+,*[0-9]*)( repository result)";

    public SearchResultsSteps(SearchResults searchResults) {
        this.searchResults = searchResults;
    }

    @Given("I go to advanced filters")
    public void iGoToAdvancedFilters() {
        this.searchResults.clickAdvancedSearchLink();
    }

    @Then("I should see {string} repo in results")
    public void iShouldSeeRepoInResults(String expectedResultsLabel) {
        int actualNumberOfRepos = this.searchResults.getNumberOfResultsDisplayed();
        String actualResultsLabel = this.searchResults.getSearchResultsLabel();
        int expectedNumberOfRepos = Integer.parseInt(TextUtils.getRegexPattern(expectedResultsLabel, NUMBER_OF_RESULTS_REGEX, 1));
        Assert.assertEquals(expectedResultsLabel, actualResultsLabel);
        Assert.assertEquals(expectedNumberOfRepos, actualNumberOfRepos);
    }

    @And("I should see the repo {string} in search results")
    public void iShouldSeeTheRepoInSearchResults(String expectedRepoName) {
        String actualReponName = this.searchResults.getFirstResultName();
        Assert.assertEquals(expectedRepoName, actualReponName);
    }

    @And("I open the repo {string} in search results")
    public void iOpenTheRepoInSearchResults(String repoName) {
        this.searchResults.openRepoInResults(repoName);
    }
}
