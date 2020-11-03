package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
    // Properties
    @FindBy(name="q")
    private WebElement searchBar;


    @FindBy(xpath = "//div/div/a")
    private WebElement about;

    // Constructor
    public GoogleHome(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    // Actions
    public void clickOnAbout() {
        about.click();
    }
    public void searchForNinjaTurtles() {
        searchBar.sendKeys("Ninja Turtles", Keys.RETURN);
    }
}
