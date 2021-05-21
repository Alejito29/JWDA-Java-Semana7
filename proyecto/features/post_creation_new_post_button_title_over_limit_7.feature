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
    Then I enter "nullgFVaPMBf3aVF5sJVrq6pIP3MsS6AqoZHh3WiJwL6WVU86CggOXXxZqfj75w3nwcjeLmBBvFowslxNQVS783aBab4l114GJTrsMJWEkdlqt0nf9QeMAu2DG22ds7vgrPYRUN6dDBIFzRWK3NvsPl6B1qYeZloN7tPDcv8VCdaIJwTxqTQ5PNdL5d0GVDc5JsAH2WsVVLlbYe45WFhk5zi4AHgsQMddlEDDTx3tL01R2gn31eVALUUfRI7L636zk7LIes0" into input field having css selector ".gh-editor-title"
    Then I click on element having css selector ".gh-publishmenu-trigger"
    Then I click on element having css selector ".gh-publishmenu-button"
    Then I should see text "Saving failed: Title cannot be longer tha 255 characters."


