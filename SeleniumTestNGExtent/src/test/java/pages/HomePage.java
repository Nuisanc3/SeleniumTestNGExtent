package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private By hamburgerMenuButton = By.id("menuToggle");
    private By onlineProductsMenuItem = By.xpath("//li[text()='Online Products']");

    public static WebDriver driver;

    // Basically the idea here is to allow child classed to access this Driver and set the driver
    public void setDriver(WebDriver driver) {

        HomePage.driver = driver;
    }
    public static void clickHamburgerMenuButton() {

    }


    public static void clickOnlineProductsMenuItem() {

    }

    protected WebElement find(By locator) {

        return driver.findElement(locator);
    }


    protected void click (By locator) {
        find(locator).click();
    }
}
