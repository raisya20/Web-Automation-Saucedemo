Feature: Checkout

  Background:
    Given on the login page
    When user input username "standard_user" and password "secret_sauce"
    And user click on login button

  @Checkout
  Scenario: Successful checkout process
    When user go to cart page
    When user click on the checkout button
    And user inputs first name "John", last name "Doe", and postal code "12345"
    And user click on the continue button
    Then system navigates to the "Checkout: Overview" page
    When user click on finish button
    Then system shows a success message "Thank you for your order!"

  @NegativeTest
  Scenario: Checkout with missing required fields
    #Given user is on inventory page
    When user add a product to the cart
    When user go to cart page
    When user click on the checkout button
    When user leaves the first name, last name, or postal code empty
    And user click on the continue button
    Then system shows error checkout message "Error: First Name is required"

