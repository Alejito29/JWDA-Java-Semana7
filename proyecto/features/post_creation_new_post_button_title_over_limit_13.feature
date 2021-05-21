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
    Then I enter "null53617495150990246388871876514323400191228630244106869697320092262851540572473213823379619441655156832596691252907247103078875118410668131580925163180866487366338147010698927631071225607965418247163124175244381428719674973165780233803100129831585366494" into input field having css selector ".gh-editor-title"
    Then I click on element having css selector ".gh-publishmenu-trigger"
    Then I click on element having css selector ".gh-publishmenu-button"
    Then I should see text "Saving failed: Title cannot be longer tha 255 characters."


