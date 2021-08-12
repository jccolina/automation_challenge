package com.jcolina.ui.cucumber.steps;

import com.jcolina.core.ui.pages.RepoHome;
import com.jcolina.core.utils.TextUtils;
import io.cucumber.java.en.And;

public class RepoHomeSteps {
    private final RepoHome repoHome;

    public RepoHomeSteps(RepoHome repoHome) {
        this.repoHome = repoHome;
    }

    @And("I print {int} characters of readme file")
    public void iPrintCharactersOfReadmeFile(int numberOfChars) {
        String readmeText = this.repoHome.getReadmeText();
        TextUtils.printCharsFromText(readmeText, numberOfChars);
    }
}
