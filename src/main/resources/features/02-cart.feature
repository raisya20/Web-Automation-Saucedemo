Feature: Cart

  Background:
    Given on the login page
    When user input username "standard_user" and password "secret_sauce"
    And user click on login button

  @RegressionTest
  Scenario: Add product to cart
    When user add a product to the cart
    Then verify the cart contains one product

  @RegressionTest
  Scenario: Remove product from cart
    And user remove the product by clicking the remove button
    Then verify the cart is empty

  @RegressionTest
  Scenario: Add 2 Products to Cart
    When user add two products to the cart
    Then verify the cart contains two products



