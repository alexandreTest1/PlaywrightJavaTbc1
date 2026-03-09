# TBC Automation Project

This project automates the testing of the https://tbcbank.ge website. Visually checks the page loading.
1. Calculates the loan amount by amount and period and checks that the correct values ​​are displayed on the screen.
2. Calculates the transfer fee by amount, currency and country and checks that the correct values ​​are displayed on the screen.
3. Checks that the offer list and banners are visible
4. Returns the appropriate values ​​using the filter panel and the offer list container
5. On the loans page, checks that the page content is loaded successfully and the Apply button is visible. When going to the credits page, it confirms that the URL host contains “tbccredit” / the domain is “tbccredit.ge”)
6. Opens the ATM and branch page on the iPhone 14 Pro Max - in the appropriate screen sizes and checks the location of the ATMs, and the working hours of the branches.
Using Playwright and POM (Page Object Model). The framework supports UI automation and the tests are written in Java using TestNG.




## Project Structure
```

src
  /main
    /java  - (Utility classes)
      /ge.tbc
      /data - Constants - Contains base URL, CALC_URL, MON_URL_ENG, OFFERS_URL, OFFERSLIST_URL, CRD_URL, ATM_URL
        /pages - Contains information about the addresses of elements 
          /steps  - CustomerLoanSteps - Contains page object classes for pages of the https://tbcbank.ge website.
                  
        
  /test
    /java
      /ge.tbc - BaseTest - Contains information for Playwright about opening and closing the Chromium browser in full screen for visual display, separately for each test
        /ge.tbc  - Tests - LoginTests conteins all test cases Contains TestNG configuration files.
        



## Prerequisites

- Java 17 
- Maven
- IntelliJ IDEA or any other preferred IDE
  




## Running Tests

To run the tests, use the following command:
```sh 
mvn clean test
``` using Playwright and POM (Page Object Model). The framework supports UI automation, and the tests are written in Java using TestNG.

