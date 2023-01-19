Feature: search Gel Pen

  @Wip
  Scenario: Gel Pen Search test
    Given user is on the Amazon page
    When user type "gel pens" in the search box
    Then suggestion is displayed
    And Check the search result is containing "Pen" in its title
    And Changed the sort by as price low to high
    And click on the item that has lowest price in the search list
    And Change quantity to 2 then add to cart.
    And Empty cart
    Then validate "Your Amazon Cart is empty."message.