package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private static By hamburgerMenuButton = By.xpath("//input[@type='checkbox']");
    private static By onlineProductsMenuItem = By.xpath("//li[text()='Online Products']");

    public static WebDriver driver;

    // Basically the idea here is to allow child classed to access this Driver and set the driver
    public void setDriver(WebDriver driver) {

        HomePage.driver = driver;
    }
    public static void clickHamburgerMenuButton() {
        click(hamburgerMenuButton);
    }


    public static void clickOnlineProductsMenuItem() throws InterruptedException {
        Thread.sleep(2000);
        click(onlineProductsMenuItem);

    }

    protected static WebElement find(By locator) {

        return driver.findElement(locator);
    }


    protected static void click(By locator) {
        find(locator).click();
    }
}
