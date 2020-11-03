package seleniumTests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    void beforeEach()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/geek/src/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
//        driver.get("https://google.com");
    }

    @Test
    void test() {
        WebElement aboutAnchorTag = driver.findElement(By.tagName("a"));
        Assertions.assertEquals("About", aboutAnchorTag.getText());
    }

    @Test
    void back() {
        driver.navigate().to("https://duckduckgo.com" );
        driver.navigate().back();
        Assertions.assertEquals("Google", driver.getTitle());
    }

    @Test
    void forward() {
        driver.navigate().back();
        driver.navigate().forward();
        Assertions.assertEquals("Google", driver.getTitle());
    }

    @Test
    void testHasItemsAnchors() {
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        List<String> anchorContents = new ArrayList<>();
        for (WebElement anchor : anchors) {
            anchorContents.add(anchor.getText());
        }
        assertThat(anchorContents, hasItems("About", "Privacy", "Terms"));
    }

    @Test
    void testAboutUrl() throws InterruptedException {
        WebElement anchor = driver.findElement(By.tagName("a"));
        anchor.click();
        Assertions.assertEquals("https://about.google/?fg=1&utm_source=google-US&utm_medium=referral&utm_campaign=hp-header", driver.getCurrentUrl());
    }

    @Test
    void writeInSearchBar() {
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Power Rangers");
        query.submit();

        Assertions.assertEquals("Power Rangers - Google Search", driver.getTitle());
    }

    @AfterEach
    void afterEach() {
        driver.close();
//        driver.quit();
    }


}
