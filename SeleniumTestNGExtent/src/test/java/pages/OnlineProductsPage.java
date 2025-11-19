package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Utilities.GetUtility.getText;
import static pages.HomePage.click;
import static pages.HomePage.find;
import static testcases.BaseTest.test;

public class OnlineProductsPage {

    private static By formalShoesTitle = By.xpath("//h2[@class='FormalShoesTitle']");
    private static By sportsShoesTitle = By.xpath("//h2[@class='SportsShoesTitle']");
    private static By SneakerShoesTitle = By.xpath("//h2[@class='SneakerShoesTitle']");
    private static By formalShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down formalshoedropdown']");
    private static By sportsShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down sportsshoedropdown']");
    private static By sneakerShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down sneakershoedropdown']");
    private static By formalShoesFirstShoe = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]");
    private static By sportShoesFirstShoe = By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[1]");

    public static void getFormalShoesTitleText_Verify() {
    String actualTitleFS =  getText(formalShoesTitle);
    String expectedTitleFS = "Formal Shoes";
        Assert.assertEquals(actualTitleFS, expectedTitleFS);
        if (actualTitleFS.equals(expectedTitleFS)) {
            test.log(Status.PASS, "Tests passed for the title verification for formal shoes");
        }
    }

    public static void getsportsShoesTitleText_Verify() {
        String actualTitleSS =  getText(sportsShoesTitle);
        String expectedTitleSS = "Sports Shoes";
        Assert.assertEquals(actualTitleSS, expectedTitleSS);
        if (actualTitleSS.equals(actualTitleSS)) {
            test.log(Status.PASS, "Tests passed for the title verification for sports shoes");
        }
    }

    public static void getSneakerShoesTitleText_Verify() {
        String actualTitleSnS =  getText(SneakerShoesTitle);
        String expectedTitleSnS = "Sneakers";
        Assert.assertEquals(actualTitleSnS, expectedTitleSnS);
        if (actualTitleSnS.equals(expectedTitleSnS)) {
            test.log(Status.PASS, "Tests passed for the title verification for sneaker shoes");
        }
    }


    public static void clickFormalShoesDropdown() throws InterruptedException {
        Thread.sleep(2000);
        click(formalShoesDropdown);


    }

    public static void clickSportsShoesDropdown() throws InterruptedException {
        Thread.sleep(2000);
        click(sportsShoesDropdown);

    }

    public static void clickSneakerShoesDropdown() {
    }

    public static void getFirstFormalShoesTitle_Verify() {
        String actualFirstShoeFS = getText(formalShoesFirstShoe);
        String expectedFirstShoeFS = "   Classic Cheltenham";
        Assert.assertEquals(actualFirstShoeFS, expectedFirstShoeFS);
        if (actualFirstShoeFS.equals(expectedFirstShoeFS)) {
            test.log(Status.PASS, "Tests passed for the title verification for FIRST formal shoes");
        }
    }

    public static void getFirstSportShoesTitle_Verify() {
        String actualFirstShoeSS = getText(sportShoesFirstShoe);
        String expectedFirstShoeSS = "   Ultimate";
        Assert.assertEquals(actualFirstShoeSS, expectedFirstShoeSS);
        if (expectedFirstShoeSS.equals(expectedFirstShoeSS)) {
            test.log(Status.PASS, "Tests passed for the title verification for FIRST sports shoes");
        }

    }

}
