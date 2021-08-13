package com.jcolina.ui.cucumber.steps;

import com.jcolina.core.ui.pages.Home;
import com.jcolina.core.ui.pages.SearchResults;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeSteps {
    private final Home home;
    private SearchResults searchResults;

    public HomeSteps(Home home) {
        this.home = home;
    }

    @Given("I am on home page")
    public void iAmOnHomePage() {
        this.home.goToHomePage();
    }

    @And("I search for {string}")
    public void iSearchFor(String searchCriteria) {
        this.searchResults = this.home.searchRepo(searchCriteria);
    }

}
