# Automation Testing for Sauce Demo

This repository contains automation tests for the [Sauce Demo](https://www.saucedemo.com/) website. The framework is built using **Selenium**, **TestNG**, **Page Object Model (POM)** with **Page Factory**, **Cucumber Hooks**, and **Extent Reports**. The goal of this project is to create an easily maintainable and scalable automation framework for testing e-commerce features.

## Features

- **Login Testing**: Positive and negative test cases for the login functionality.
- **Add to Cart**: Tests for adding products to the shopping cart.
- **Checkout Flow**: End-to-end tests for product checkout functionality.
- **Cucumber Framework**: Easily readable Gherkin steps for defining feature files and scenarios.
- **TestNG Integration**: Efficient test execution and reporting.
- **Page Object Model**: Ensures maintainability and reusability of code by separating test logic from the page interaction logic.
- **Extent Reports**: Generates detailed HTML reports for test execution results.

## Resources

Test Cases: [SauceDemo Automation Test Cases](https://docs.google.com/spreadsheets/d/1Yibl_7FgoWAe0E_scjkTyTt1KXzSfMKLS25UL9ZB6fs/edit?gid=1263057882#gid=1263057882)
Demo Video: [Watch on YouTube](https://youtu.be/A5RqzEYgcoQ)

## Setup

### Prerequisites

- Java 17 or higher
- Maven
- ChromeDriver (make sure it's compatible with your Chrome version)
- IntelliJ IDEA or any Java IDE
- Selenium WebDriver
- TestNG
- Cucumber

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/raisya20/saucedemo-automation.git
   
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).

3. Install dependencies using Maven:
   
   ```bash
    mvn clean install

5. Download and configure ChromeDriver (compatible with your Chrome version).

6. Ensure that all paths (e.g., ChromeDriver) are correctly set in the TestRunner class.


