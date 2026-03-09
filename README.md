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

