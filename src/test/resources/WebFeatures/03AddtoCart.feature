Feature: Add to Cart Product

  @smoke
  Scenario: Customer will Add to Cart his preferred product
    Given Customer in the Daraz website page
    When customer will click his preferred T-shirt
    And choose the T-shirt size
    And customer will choose and click the size of the T-shirt
    And customer will click Add to Cart button
    And customer will go to cart to click checkbox and  delete product
    Then customer will click the Remove button to empty cart
