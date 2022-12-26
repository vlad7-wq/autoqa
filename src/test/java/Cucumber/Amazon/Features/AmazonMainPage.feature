@AmazonMainPage.feature
  Feature: Put value into search field

    Scenario: put value into search field
      Given I am on the "https://www.amazon.com/" site
      Given set location to a "Poland"
      When i put "samsung" value into search field and press enter
#      Then search result page is displayed items according to our request ("samsung")
      When I click on item from search page
#      Then I redirected to an item page
      When I click on add to cart button
      Then item displaying in cart "samsung"