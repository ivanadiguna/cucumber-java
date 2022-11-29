@YoutubeMusic
Feature: Youtube music smoke test

  @explorePage
  Scenario: Access Explore Page
      Given open the youtube music
      When click explore tab
      Then explore page will be displayed

  @signIn
  Scenario: Sign in to youtube music
    Given open the youtube music
    When click sign in button
    And input username and password
    And click login button
    Then account has been logged in

  @searchMusic
  Scenario: Search music in Youtube music
    Given open the youtube music
    When click search button
    And input value in the search bar
    Then searched value will be appear
