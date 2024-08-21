# MiniProject2

This is a Selenium WebDriver project written in Java, using TestNG for testing. The project includes basic automated tests for the Amazon India website.

## Prerequisites

- Java 22
- Maven
- ChromeDriver

## Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/belaletech/selenium_Maven.git
    ```

2. Navigate to the project directory:
    ```bash
    cd MiniProject2
    ```

3. Ensure that the path to `chromedriver.exe` in `miniTest.java` is correct.

4. Run the tests using Maven:
    ```bash
    mvn test
    ```

## Tests

- **verifyTitle**: Validates the title of the Amazon India homepage.
- **verifyLogo**: Confirms that the Amazon logo is displayed.
- **searchProduct**: Searches for "MacBook" on Amazon India.

## Dependencies

The project uses the following dependencies:

- Selenium Java (4.23.0)
- TestNG (7.10.2)

These are managed through the `pom.xml` file.

## License

This project is licensed under the MIT License.
