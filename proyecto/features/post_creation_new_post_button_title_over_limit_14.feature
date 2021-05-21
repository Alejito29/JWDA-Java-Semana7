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
    Then I enter "null3969758741819858416105039461118731682319945880471384491207377897579185116393561334227414627585916018234604867037831200190639207227576620449158626368866531088212029781880672133895535170247034818164535671078047376753395909156136347252205679786010581468232224" into input field having css selector ".gh-editor-title"
    Then I click on element having css selector ".gh-publishmenu-trigger"
    Then I click on element having css selector ".gh-publishmenu-button"
    Then I should see text "Saving failed: Title cannot be longer tha 255 characters."


