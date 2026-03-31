package tests;

import utils.ConfigReader;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test(groups = "smoke")
    public void testLogin() {
        String username = ConfigReader.getUsername();
        String password = ConfigReader.getPassword();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        driver.quit();
    }
}