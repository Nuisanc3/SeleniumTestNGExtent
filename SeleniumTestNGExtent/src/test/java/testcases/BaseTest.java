package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static pages.HomePage.driver;

public class BaseTest {

    @BeforeTest
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }

    @Test
    public static void validateTitlesOnTheOnlineProductsPage() throws InterruptedException {
        HomePage.clickHamburgerMenuButton();
        HomePage.clickOnlineProductsMenuItem();


    }
}
