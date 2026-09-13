
# OpenCart Selenium Automation Framework

## Project Overview

This project is a Selenium WebDriver automation testing framework developed using Java to automate functional and regression testing of the OpenCart e-commerce application.

The framework follows the Page Object Model (POM) design pattern and is designed for reusable, maintainable, and scalable test automation.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Data-Driven Testing
- Hybrid Automation Framework
- Apache POI
- Log4j2
- Extent Reports
- Git and GitHub

## Automation Features

- Automated account registration testing
- Login testing
- Functional testing
- Regression testing
- Cross-browser testing
- Reusable page object classes
- TestNG test execution
- Test reporting
- Data-driven test automation

## Project Structure

```text
opencart
├── src
│   ├── test
│   │   └── java
│   │       ├── pageObjects
│   │       ├── testCases
│   │       └── testBase
│   └── test
│       └── resources
├── pom.xml
├── testng.xml
└── README.md
```

## Framework Design

The framework uses the Page Object Model to separate page locators and reusable page methods from test cases.

Test execution flow:

1. Launch browser.
2. Open OpenCart application.
3. Execute test cases.
4. Validate expected results.
5. Generate test reports.

## How to Run the Project

### Prerequisites

- Java JDK
- Eclipse IDE or IntelliJ IDEA
- Maven
- Chrome / Edge browser

### Steps

1. Clone the repository.

```bash
git clone https://github.com/gjayaprakashv7-creator/opencart.git
```

2. Open the project in Eclipse or IntelliJ IDEA.
3. Update the application URL and test data according to your local setup.
4. Update the required configuration.
5. Run the TestNG test cases or testng.xml suite.

## Sample Test Cases

| Test Case | Description |
|---|---|
| Account Registration | Verify new user registration |
| Login | Verify valid user login |
| Logout | Verify user logout |
| Functional Testing | Validate application functionality |
| Regression Testing | Execute regression test scenarios |

## Author

Jayaprakash G

Java Selenium Automation Test Engineer | QA Engineer

## Disclaimer

This is a personal learning and automation testing project created to demonstrate Selenium WebDriver, Java, and TestNG framework skills.
