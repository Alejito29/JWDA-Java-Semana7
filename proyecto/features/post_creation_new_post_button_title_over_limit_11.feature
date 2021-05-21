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
    Then I enter "nullFri May 21 16:37:08 COT 20214909927993r1_hBL0geFri May 21 16:37:08 COT 20211319863661h53yw8WBVqFri May 21 16:37:08 COT 2021124783897835qrAMH_FfFri May 21 16:37:08 COT 2021595573541hj94jpZZx_Fri May 21 16:37:08 COT 20211091260212e3zWkHhA5BFri May 21 16:37:08 COT 202117764161671tWT6TbwvX" into input field having css selector ".gh-editor-title"
    Then I click on element having css selector ".gh-publishmenu-trigger"
    Then I click on element having css selector ".gh-publishmenu-button"
    Then I should see text "Saving failed: Title cannot be longer tha 255 characters."


