package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelTest {
    WebDriver driver;
    GoogleHome googleHome;

    @BeforeClass
    void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "/Users/geek/src/selenium/chromedriver");
        driver = new ChromeDriver();
        googleHome = new GoogleHome(driver);
    }

    @BeforeMethod
    void beforeMethod() {
        driver.get("https://google.com");
    }

    @Test()
    void testSearch() {
        googleHome.searchForNinjaTurtles();
    }

    @Test()
    void testAbout() {
        googleHome.clickOnAbout();
    }

    @AfterClass
    void afterClass() {
        driver.close();
    }
}
