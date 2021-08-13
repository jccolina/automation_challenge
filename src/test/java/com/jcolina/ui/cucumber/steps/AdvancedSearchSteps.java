package com.jcolina.ui.cucumber.steps;

import com.jcolina.core.ui.pages.AdvancedSearch;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.Map;

public class AdvancedSearchSteps {
    private final AdvancedSearch advancedSearch;

    public AdvancedSearchSteps(AdvancedSearch advancedSearch) {
        this.advancedSearch = advancedSearch;
    }

    @When("I set the following text filters:")
    public void iApplyTheFollowingTextFilters(Map<String, String> searchTextOptions) {
        for (Map.Entry<String, String> searchOption : searchTextOptions.entrySet()) {
            this.advancedSearch.setSearchTextOption(searchOption.getKey(), searchOption.getValue());
        }
    }

    @And("I set the following selection filters:")
    public void iApplyTheFollowingSelectionFilters(Map<String, String> searchSelectOptions) {
        for (Map.Entry<String, String> searchOption : searchSelectOptions.entrySet()) {
            this.advancedSearch.setSearchSelectOption(searchOption.getKey(), searchOption.getValue());
        }
    }

    @And("I press search button")
    public void iPressSearchButton() {
        this.advancedSearch.clickSearchButton();
    }
}
