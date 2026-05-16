# Amazon Automation Framework

A professional and optimized E-Commerce Automation Framework built using **Selenium WebDriver**, **Java**, and **TestNG** following the **Page Object Model (POM)** design pattern. The project is fully integrated with **Maven** and configured for Continuous Integration (CI) via **Jenkins**.

## 🚀 Features & Architecture
- **Page Object Model (POM):** Clean separation of page elements/actions from test logic, preventing code duplication and ensuring easy maintenance.
- **Strict Inheritance Control:** Elimination of duplicate WebDriver instances (`NullPointerException` safe architecture) by passing drivers through constructors in Page Classes.
- **Dynamic Window Handling:** Smart capability to handle dynamic browser tabs and child windows seamlessly during runtime.
- **TestNG Integration:** Managed execution flows leveraging `testng.xml` for structural test suites.
- **CI/CD Ready:** Configured via `pom.xml` (using `maven-surefire-plugin`) to run flawlessly inside a Jenkins pipeline.

---

## 🛠️ Tech Stack & Dependencies
- **Language:** Java
- **Automation Tool:** Selenium WebDriver (v4.43.0)
- **Test Framework:** TestNG (v7.12.0)
- **Build Tool:** Maven
- **Driver Management:** WebDriverManager (v6.3.4)
- **CI/CD:** Jenkins

---

## 📂 Project Structure
```text
AmazonAutomate/
│
├── src/
│   ├── main/java/                  # Logic and Page layers
│   │   ├── Base/
│   │   │   └── BaseClass.java      # Handles browser initialization & teardown
│   │   │
│   │   ├── Pages/                  # Repository of Page Objects (Constructor driven)
│   │   │   ├── ProductDetailsPage.java
│   │   │   ├── SearchProduct.java
│   │   │   └── SearchResultsPage.java
│   │   │
│   │   └── Utilities/              # Utility files (Placeholder)
│   │
│   ├── main/resources/             # Environmental resources
│   │
│   ├── test/java/                  # Test Scripts layer
│   │   └── Test/                   # Modular Test Cases (Extends BaseClass)
│   │       ├── ProductDetailsPageTest.java
│   │       ├── SearchProductTest.java
│   │       └── SearchResultsPageTest.java
│   │
│   └── test/resources/             # Test-specific resources
│
├── testng.xml                      # Test Suite configuration file
├── pom.xml                         # Maven project configuration file
└── .gitignore                      # Excludes target/ and temporary IDE build files

```

---

## 💻 How To Run

### 1. Via Eclipse / IntelliJ:

Right-click on `testng.xml` and select **Run As -> TestNG Suite**.

### 2. Via Command Line (CMD):

Navigate to the project root directory and run:

```bash
mvn clean test

```

### 3. Via Jenkins CI:

1. Create a **Maven Project** or **Freestyle Project** in Jenkins.
2. Set the custom workspace path pointing to the project folder.
3. In the Build Step, provide the following command:
```bash
clean test

```


4. Click **Build Now**.

---

## 📊 Sample Execution Output (Jenkins Console)

```text
[INFO] Running TestSuite
38,998
New Window Title: OnePlus Nord 6 | 8GB+256GB | Fresh Mint | Amazon.in
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

```

```
