Feature: Post creation plus button

  @user1 @web
  Scenario: As a user I create a post using plus button on home page
    Given I set scenario "Post_creation_plus_button" and version app "3.42.5"
    Given I navigate to page "http://localhost:2368/ghost/#/signin"
    Then I enter "Kraken1@gmail.com" into input field having id "ember8"
    Then I enter "Kraken1*" into input field having id "ember10"
    Then I click on element having id "ember12"
    Then I should see text "View site"
    Then I click on element having css selector ".gh-secondary-action.gh-nav-new-post.ember-view"
    Then I enter "1100604258" into input field having css selector ".gh-editor-title"
    Then I enter "$name_2" into input field having css selector ".koenig-editor__editor"
    When I click on element having css selector "a[href='#/posts/']"
    Then I wait for 2 seconds
    Then I should see text "1100604258"

