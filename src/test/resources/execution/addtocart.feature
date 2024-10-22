Feature: Check Shopping Cart fungtionality Adding and removing iteams
 Scenario: User searches and adds items to the cart
    Given the user is logged in
    When the user searches for "Twenties Girl" and adds it to the cart
    And the user searches for "zero Option" and adds it to the cart
    And the user searches for "The Shape Of Snakes" and adds it to the cart
    And the user searches for "The Girl Who Played With Fire" and adds it to the cart
    And the user searches for "The Chestnut Tree" and adds it to the cart

    When the user checks the cart total
    Then the total price should be 876.00

    
    When the user add "shattered icon" priced at 99.00
    Then the total price 975.00