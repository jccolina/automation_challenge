Feature: Search repositories

  Scenario: Search repo using advanced filters
    Given I am on home page
      And I search for "decider"
      And I go to advanced filters
    When I set the following text filters:
        | With this many stars     | >45                        |
        | With this many followers | >50                        |
      And I set the following selection filters:
        | With this license        | Boost Software License 1.0 |
        | Written in this language | JavaScript                 |
      And I press search button
    Then I should see "1 repository result" label in results
      And I should see 1 repos in search results
      And I should see the repo "mvoloskov/decider" in search results
      And I open the repo "mvoloskov/decider" in search results
      And I print the first 300 characters of readme file