package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import bai2.DriverFactory;

public class LoginTest {

    @Test(groups = "smoke")
    public void testGoogle() {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}