# LUMAJavaSeleniumTestNGAllure
[![Java CI with Maven](https://github.com/ArinaJur/LUMAJavaSeleniumTestNGAllure/actions/workflows/build.yml/badge.svg)](https://github.com/ArinaJur/LUMAJavaSeleniumTestNGAllure/actions/workflows/build.yml)
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LUMA Java Selenium TestNG Allure</title>
</head>
<body>

<h2>Project Description</h2>
<p>This project is a comprehensive test automation suite for the LUMA application, utilizing Java with Selenium WebDriver, TestNG for test management, and Allure for reporting. The suite is designed to provide robust and efficient end-to-end testing capabilities, ensuring the quality and reliability of the LUMA application.</p>

<h2>Features</h2>
<ul>
    <li><strong>Java</strong>: The core programming language used for writing test scripts.</li>
    <li><strong>Selenium WebDriver</strong>: Used for browser automation, enabling interaction with the LUMA application's web elements.</li>
    <li><strong>TestNG</strong>: Provides advanced test configuration, management, and execution capabilities.</li>
    <li><strong>Allure</strong>: Integrated for generating detailed and visually appealing test reports.</li>
    <li><strong>Maven</strong>: Used for project build and dependency management.</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
    <li><strong>Java Development Kit (JDK)</strong>: Version 8 or higher.</li>
    <li><strong>Maven</strong>: For managing project dependencies and build lifecycle.</li>
    <li><strong>Selenium WebDriver</strong>: Compatible version for your browser.</li>
    <li><strong>TestNG</strong>: Testing framework.</li>
    <li><strong>Allure</strong>: For generating test reports.</li>
</ul>

<h3>Installation</h3>
<ol>
<li><strong>Clone the Repository</strong>
<pre>
<code>
git clone https://github.com/ArinaJur/LUMAJavaSeleniumTestNGAllure.git
cd LUMAJavaSeleniumTestNGAllure
</code>
</pre>
</li>

<li><strong>Install Dependencies</strong>
<pre>
<code>
mvn clean install
</code>
</pre>
</li>

<li><strong>Run Tests</strong>
<pre>
<code>
mvn test
</code>
</pre>
</li>

<li><strong>Generate Allure Report</strong>
<pre>
<code>
mvn allure:report
mvn allure:serve
</code>
</pre>
</li>
</ol>

<h2>Project Structure</h2>
<pre>
<code>
LUMAJavaSeleniumTestNGAllure/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── lumaproject/
│   │               └── pages/
│   └── test/
│       └── java/
│           └── com/
│               └── lumaproject/
│                   └── base/
│                   └── data/
│                   └── test/
│                   └── util/
├── pom.xml
└── README.md
└── testng.xml
    </code>
</pre>
<ul>
    <li><strong>src/main/java</strong>: Contains the Page Object Model code.</li>
    <li><strong>src/test/java</strong>: Contains the test cases.</li>
    <li><strong>pom.xml</strong>: Maven configuration file.</li>
</ul>

<h2>Usage</h2>
<ul>
    <li><strong>Writing Tests</strong>: Create your test classes in the <code>src/test/java/com/yourpackage/</code> directory.</li>
    <li><strong>Running Tests</strong>: Use TestNG annotations to configure and run your tests.</li>
    <li><strong>Viewing Reports</strong>: After running tests, generate and view reports using Allure commands.</li>
</ul>

<h2>License</h2>
<p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>

</body>
</html>
