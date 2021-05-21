Feature: Create a post using new button

  @user1 @web
  Scenario: As a user I create a post using 'New post' button on posts list
    Given I set scenario "Post_creation_new_post_button" and version app "3.42.5"
    Given I navigate to page "http://localhost:2368/ghost/#/signin"
    Then I enter "Kraken1@gmail.com" into input field having id "ember8"
    Then I enter "Kraken1*" into input field having id "ember10"
    Then I click on element having id "ember12"
    Then I should see text "View site"
    Then I click on element having xpath "//a[@href='#/posts/']"
    Then I click on element having css selector ".gh-btn.gh-btn-green.ember-view"
    Then I enter "" into input field having css selector ".gh-editor-title"
    Then I enter "$name_2" into input field having css selector ".koenig-editor__editor"
    Then I enter "nullEJGVHFwWAI63AGyU5AfSE4ZKry3wYl5BX1pNrlSP7Mv7AEhEnB2oyR3P5Ty8aGETLwzkpXYm1RjuY99c7_QOEIw6qqt2lsDgjGDQaUN63zB84vqSIygFmD6KMnEsqDxnoE2StTfvx2dimES0LlaFrKvceVTW5A8anVgc2YT1NwGjvAnl5lSQTlQGqGpOVTeGkQZVvZlkD4HdDQ7enu7VT2vNfmK2LkM80yXBd6gua5_rnnvty67Tps945mgioaNqGyrD" into input field having css selector ".gh-editor-title"
    Then I click on element having css selector ".gh-publishmenu-trigger"
    Then I click on element having css selector ".gh-publishmenu-button"
    Then I should see text "Saving failed: Title cannot be longer tha 255 characters."


