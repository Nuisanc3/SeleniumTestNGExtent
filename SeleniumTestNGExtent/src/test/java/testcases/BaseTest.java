package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OnlineProductsPage;

import static pages.HomePage.driver;

public class BaseTest {

    @BeforeTest
    public static void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        HomePage.clickHamburgerMenuButton();
        HomePage.clickOnlineProductsMenuItem();

    }

    @Test
    public static void validateTitlesOnTheOnlineProductsPage() throws InterruptedException {
        OnlineProductsPage.getFormalShoesTitleText_Verify();
        OnlineProductsPage.getsportsShoesTitleText_Verify();
        OnlineProductsPage.getSneakerShoesTitleText_Verify();
    }

    @Test
    public static void validateFirstFormalShoes() {
        OnlineProductsPage.clickFormalShoesDropdown();
        OnlineProductsPage.getFirstFormalShoesTitle_Verify();
    }

    @Test
    public static void validateFirstSportsShoes() {
        OnlineProductsPage.clickSportsShoesDropdown();
        OnlineProductsPage.getFirstSportShoesTitle_Verify();
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }
}
