package org.dyndns.home.tasky;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TaskyTests {
    private static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "/Users/geek/src/selenium/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    @Order(1)
    void blankLogin() throws MalformedURLException {
        driver.navigate().to(new URL("https://tasky.home.dyndns.org"));

        if (driver.getTitle().equals("Welcome to Tasky")) {
            return;
        } else {
            Assertions.assertEquals("Log In - Tasky", driver.getTitle());
        }

        List<WebElement> elements = driver.findElements(By.xpath("//span"));
        Assertions.assertEquals(1, elements.size());

        WebElement element = driver.findElement(By.name("submit"));
        element.click();

        elements = driver.findElements(By.xpath("//span"));
        Assertions.assertEquals(3, elements.size());
        Assertions.assertEquals("[This field is required.]", elements.get(1).getText());
        Assertions.assertTrue(elements.get(1).isDisplayed());
        Assertions.assertEquals("[This field is required.]", elements.get(2).getText());
        Assertions.assertTrue(elements.get(2).isDisplayed());
    }

    @Test
    @Order(2)
    void login() throws MalformedURLException {
        driver.navigate().to(new URL("https://tasky.home.dyndns.org"));

        if (driver.getTitle().equals("Welcome to Tasky")) return;

        WebElement element = driver.findElement(By.id("username"));
        element.sendKeys("guest");
        element = driver.findElement(By.id("password"));
        element.sendKeys("guest");

        element = driver.findElement(By.name("submit"));
        element.click();
        Assertions.assertEquals("Welcome to Tasky", driver.getTitle());
    }

    @Test
    @Order(3)
    void gotoCreate() throws MalformedURLException {
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/add_task"));
        Assertions.assertEquals("Add Task", driver.findElement(By.tagName("h1")).getText());
    }

    @Test
    @Order(4)
    void create() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/add_task"));

        WebElement element = driver.findElement(By.id("task_text"));
        element.sendKeys("Go grocery shopping");
        element = driver.findElement(By.id("submit"));
        element.click();

        Assertions.assertEquals("Task added", driver.findElement(By.xpath("/html/body/ul/li")).getText());
    }

    @Test
    @Order(5)
    void gotoRead() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/list_tasks"));
        Assertions.assertEquals("List Tasks", driver.findElement(By.tagName("h1")).getText());
    }

    @Test
    @Order(6)
    void read() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/list_tasks"));

        List<WebElement> elements = driver.findElements(By.tagName("li"));
        Assertions.assertEquals(1, elements.size());
    }

    @Test
    @Order(7)
    void gotoUpdate() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/complete_task"));
        Assertions.assertEquals("Complete Task", driver.findElement(By.tagName("h1")).getText());
    }

    @Test
    @Order(8)
    void update() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/complete_task"));

        driver.findElement(By.id("submit")).click();

        Assertions.assertEquals("Task completed", driver.findElement(By.xpath("/html/body/ul/li")).getText());
    }

    @Test
    @Order(9)
    void gotoDelete() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/remove_task"));
        Assertions.assertEquals("Remove Task", driver.findElement(By.tagName("h1")).getText());
    }

    @Test
    @Order(10)
    void delete() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/remove_task"));

        driver.findElement(By.id("submit")).click();

        Assertions.assertEquals("Task removed", driver.findElement(By.xpath("/html/body/ul/li")).getText());
    }

    @Test
    @Order(11)
    void home() throws MalformedURLException {
        login();
        driver.navigate().to(new URL("https://tasky.home.dyndns.org/list_tasks"));

        driver.findElement(By.tagName("a")).click();
        Assertions.assertEquals("Welcome to Tasky", driver.getTitle());
    }

    @Test
    @Order(12)
    void logout() throws MalformedURLException {
        login();

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        Assertions.assertTrue(elements.size() > 1);
        elements.get(1).click();

        Assertions.assertEquals("Log In", driver.findElement(By.tagName("h1")).getText());
    }

//    @AfterAll
//    static void afterAll() {
//        driver.close();
//    }
}
