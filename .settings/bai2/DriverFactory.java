package bai2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver createDriver(String browser) {

        // Detect môi trường CI (GitHub Actions)
        boolean isCI = System.getenv("CI") != null;

        // Default browser
        if (browser == null || browser.isEmpty()) {
            browser = "chrome";
        }

        switch (browser.toLowerCase()) {
            case "firefox":
                return createFirefoxDriver(isCI);
            case "chrome":
            default:
                return createChromeDriver(isCI);
        }
    }

    private static WebDriver createChromeDriver(boolean headless) {
        ChromeOptions options = new ChromeOptions();

        if (headless) {
            options.addArguments("--headless=new"); 
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
        } else {
            options.addArguments("--start-maximized");
        }

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    private static WebDriver createFirefoxDriver(boolean headless) {
        FirefoxOptions options = new FirefoxOptions();

        if (headless) {
            options.addArguments("-headless");
        }

        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(options);
    }
}