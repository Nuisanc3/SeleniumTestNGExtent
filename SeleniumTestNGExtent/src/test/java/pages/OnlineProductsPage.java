package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Utilities.GetUtility.getText;
import static pages.HomePage.find;

public class OnlineProductsPage {

    private static By formalShoesTitle = By.xpath("//h2[@class='FormalShoesTitle']");
    private static By sportsShoesTitle = By.xpath("//h2[@class='SportsShoesTitle']");
    private static By SneakerShoesTitle = By.xpath("//h2[@class='SneakerShoesTitle']");
    private By formalShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down formalshoedropdown']");
    private By sportsShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down sportsshoedropdown']");
    private By sneakerShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down sneakershoedropdown']");
    private By formalShoesFirstShoe = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]");
    private By sportShoesFirstShoe = By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[1]");

    public static void getFormalShoesTitleText() {
    String actualTitleFS =  getText(formalShoesTitle);
    String expectedTitleFS = "Formal Shoes";
        Assert.assertEquals(actualTitleFS, expectedTitleFS);
    }

    public static void getsportsShoesTitleText() {
        String actualTitleSS =  getText(sportsShoesTitle);
        String expectedTitleSS = "Sports Shoes";
        Assert.assertEquals(actualTitleSS, expectedTitleSS);
    }

    public static void getSneakerShoesTitleText() {
        String actualTitleSnS =  getText(SneakerShoesTitle);
        String expectedTitleSnS = "Sneaker Shoes";
        Assert.assertEquals(actualTitleSnS, expectedTitleSnS);
    }


    public static void clickFormalShoesDropdown() {

    }

    public static void clickSportsShoesDropdown() {
    }

    public static void clickSneakerShoesDropdown() {
    }

    public static String getFirstFormalShoesTitle() {
        return "";

    }

    public static String getFirstSportShoesTitle() {
        return "";

    }

}
