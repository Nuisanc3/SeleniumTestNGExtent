package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pages.HomePage.driver;

public class GetUtility {

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }
}
