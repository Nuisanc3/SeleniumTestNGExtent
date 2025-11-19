package testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import pages.OnlineProductsPage;

import java.io.File;
import java.io.IOException;

import static pages.HomePage.driver;

public class BaseTest {

    // This following section is important for reporting
    // Add maven dependency - Extent reports
    // Then google Extent report usage - From official site look how to use it.
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        //following line is for creating the report attachment.
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        // We do want the reporter to be attached
        extent.attachReporter(spark); // Now report will start getting generated
        HomePage.clickHamburgerMenuButton();
        HomePage.clickOnlineProductsMenuItem();

    }

    @Test
    public static void validateTitlesOnTheOnlineProductsPage() throws InterruptedException {
        test = extent.createTest("Validate shoe titles on the products page",
                "This test validates that the different shoe types are correct on the online products page");
        OnlineProductsPage.getFormalShoesTitleText_Verify();
        OnlineProductsPage.getsportsShoesTitleText_Verify();
        OnlineProductsPage.getSneakerShoesTitleText_Verify();
       //  extent.flush(); // This is mandatory so that report gets generated. Added in the AfterSuite class
    }

    @Test
    public static void validateFirstFormalShoes() throws InterruptedException {
        test = extent.createTest("Validate shoe titles on the first formal shoe",
                "This test validates that the first formal shoe");
        OnlineProductsPage.clickFormalShoesDropdown();
        OnlineProductsPage.getFirstFormalShoesTitle_Verify();
    }

    @Test
    public static void validateFirstSportsShoes() throws InterruptedException {
        test = extent.createTest("Validate shoe titles on the first sports shoe",
                "This test validates that the first sports shoe");
        OnlineProductsPage.clickSportsShoesDropdown();
        OnlineProductsPage.getFirstSportShoesTitle_Verify();
    }

@AfterTest
    public void takeScreenshot(WebDriver driver) throws IOException, IOException {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File( "/src/../ExecImages/" + System.currentTimeMillis() + ".png");
            System.out.println("Screenshot located at" + destination);

        }
    }

    @AfterSuite
    public static void tearDown()
    {
        driver.quit();
        extent.flush();
    }
}
