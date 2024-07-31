# PRODIGY_SD_05 - Web Scraping Project
## Overview
Welcome to the PRODIGY_SD_05 repository. This project is part of the Prodigy InfoTech Software Development Internship program. In this task, you will find a Java-based web scraping application that extracts product information from the "Books to Scrape" website.

## Project Description
This project demonstrates how to scrape data from an e-commerce website and store it in a CSV file. The application connects to the "Books to Scrape" website, extracts book titles, prices, and ratings, and saves this data to a CSV file.

## Features
- Scrapes book information from the "Books to Scrape" website.
- Extracts book title, price, and rating.
- Saves the scraped data into a CSV file for further analysis.

## Technologies Used
- Java 17: Programming language used for the project.
- Jsoup: Library for parsing HTML and extracting data.
- OpenCSV: Library for writing data to CSV files.

## Prerequisites
- Java 17 or higher installed on your machine.
- Maven for dependency management (optional if not using Maven, manually add JAR files).

## Setup Instructions
- Clone the Repository
```bash
git clone https://github.com/SurajSenapati24/PRODIGY_SD_05.git
cd PRODIGY_SD_05
```
- Add Dependencies

If using Maven, add the following dependencies to your pom.xml file:
xml Copy code

```bash
  <dependencies>
      <dependency>
          <groupId>org.jsoup</groupId>
          <artifactId>jsoup</artifactId>
          <version>1.15.3</version>
      </dependency>
      <dependency>
          <groupId>com.opencsv</groupId>
          <artifactId>opencsv</artifactId>
          <version>5.7.1</version>
      </dependency>
  </dependencies>
```
-If not using Maven, download the required JAR files and add them to your classpath.

## Compile and Run
-Compile the Java project using:

Copy code
```bash
mvn clean compile
```
- Run the application using:
Copy code
```bash
mvn exec:java -Dexec.mainClass="com.scrape.WebScraper"
```
- Ensure that the BookScraper.java file is located in the src/main/java/com/scrape directory.

## Check Output
After running the application, check the books.csv file in the project directory. It should contain the scraped book data.

## Code Explanation
BookScraper.java: Contains the main logic for scraping the "Books to Scrape" website. Extracts book titles, prices, and ratings, and writes the data to a CSV file.

## Notes
This project is designed to be a learning tool and should be used in compliance with the target website’s terms of service and scraping policies. For more complex scenarios or websites with dynamic content, consider using tools like Selenium.

## License
This project is for educational purposes and does not come with any warranties. Please adhere to the legal requirements and respect the website's terms of service. 
