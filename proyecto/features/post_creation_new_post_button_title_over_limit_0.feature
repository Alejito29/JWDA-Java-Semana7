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
    Then I enter "nullFri May 21 16:37:08 COT 20211999644233POw5YxZELIFri May 21 16:37:08 COT 2021763680884ZVrMBhIB_EFri May 21 16:37:08 COT 20211156894816a138VhLtrrFri May 21 16:37:08 COT 20212061583865ukvDqcvW9yFri May 21 16:37:08 COT 2021703584148w4VKsJSpP1Fri May 21 16:37:08 COT 2021345085374q2SudlzzAd" into input field having css selector ".gh-editor-title"
    Then I click on element having css selector ".gh-publishmenu-trigger"
    Then I click on element having css selector ".gh-publishmenu-button"
    Then I should see text "Saving failed: Title cannot be longer tha 255 characters."


