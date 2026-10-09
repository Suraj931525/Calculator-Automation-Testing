# Calculator Automation Testing Project

## 📌 Project Overview

This project focuses on testing calculator functionalities using Java, Maven, and TestNG. It covers arithmetic operations, scientific calculator functions, search button functionality, and footer links through organized test classes.

The main objective is to validate application functionality, identify defects, and improve software quality through test automation.

## 🎯 Project Objectives

* Automate calculator functionality testing.
* Verify arithmetic operations and scientific functions.
* Test search button functionality.
* Validate footer links and UI elements.
* Execute test cases using TestNG and Maven.
* Analyze test execution reports.

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Build Tool:** Maven
* **Testing Framework:** TestNG
* **IDE:** Eclipse
* **Version Control:** Git and GitHub
* **Automation Tool:** Selenium WebDriver (if configured in the project)

## 🧪 Test Scenarios Covered

### 1. Arithmetic Operations

* Verify calculator operator functionality.
* Validate arithmetic calculations.
* Check expected and actual results.

### 2. Scientific Calculator Testing

* Test sine (sin) functionality.
* Test cosine (cos) functionality.
* Test tangent (tan) functionality.
* Validate scientific calculation results.

### 3. Search Button Testing

* Verify search button functionality.
* Validate the search interaction.

### 4. Footer Links Testing

* Verify footer links.
* Validate navigation and UI elements.

### 5. Application Testing

* Execute application-level test cases.
* Validate expected behavior using assertions.

## 📂 Project Structure

```text
Calculator-Automation-Testing/
├── pom.xml
├── testng.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── test/calculator_testing/
│   │           ├── App.java
│   │           ├── Footer.java
│   │           ├── Operators.java
│   │           ├── Scientific_Calc.java
│   │           └── Search_Button.java
│   └── test/
│       └── java/
│           └── test/calculator_testing/
│               ├── Setup.java
│               ├── Operatorstest.java
│               ├── SinTest.java
│               ├── CosTest.java
│               ├── TanTest.java
│               ├── Scientific_calc.java
│               ├── Search_Buttontest.java
│               ├── Footerlinks.java
│               └── AppTest.java
└── README.md
```

## ⚙️ Prerequisites

* Java JDK compatible with the project
* Apache Maven
* Eclipse IDE or another Java IDE
* Git installed on your system
* A compatible browser and WebDriver, if browser automation is used

## ▶️ How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/YOUR-USERNAME/Calculator-Automation-Testing.git
   ```

2. Navigate to the project directory:

   ```bash
   cd Calculator-Automation-Testing
   ```

3. Run the test suite using Maven:

   ```bash
   mvn clean test
   ```

4. Review the console output and generated TestNG reports.

**Note:** The Maven command depends on the project's configuration and available test dependencies.

## 📊 Test Reports

TestNG can generate test execution reports showing passed, failed, and skipped test cases. Review these reports to understand test results and investigate failures.

## 📚 Key Learnings

* Java-based test automation.
* TestNG test execution and assertions.
* Maven project management.
* Functional testing of calculator features.
* Organizing test classes and test scenarios.
* Reviewing test reports and identifying failures.

## 🚀 Future Enhancements

* Add more positive and negative test scenarios.
* Improve assertions and test data management.
* Add screenshots for failed test cases.
* Maintain detailed defect reports.
* Integrate automated test execution with GitHub Actions.

## 👨‍💻 Author

**Suraj Patil**

Computer Science Engineering | Software Testing | QA Automation

## 📄 Disclaimer

This project is developed for learning and practicing software testing concepts. The listed tools and test scenarios should be verified against the actual project implementation.
