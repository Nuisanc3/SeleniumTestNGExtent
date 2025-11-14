package pages;

import org.openqa.selenium.By;

public class OnlineProductsPage {

    private By formalShoesTitle = By.xpath("//h2[@class='FormalShoesTitle']");
    private By sportsShoesTitle = By.xpath("//h2[@class='SportsShoesTitle']");
    private By SneakerShoesTitle = By.xpath("//h2[@class='SneakerShoesTitle']");
    private By formalShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down formalshoedropdown']");
    private By sportsShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down sportsshoedropdown']");
    private By sneakerShoesDropdown = By.xpath("//i[@class='fa fa-angle-double-down sneakershoedropdown']");
    private By formalShoesFirstShoe = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]");
    private By sportShoesFirstShoe = By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[1]");

    public static String getFormalShoesTitleText() {
    }

    public static String getsportsShoesTitleText() {
    }

    public static String getSneakerShoesTitleText() {
    }


    public static void clickFormalShoesDropdown() {
    }

    public static void clickSportsShoesDropdown() {
    }

    public static void clickSneakerShoesDropdown() {
    }

    public static String getFirstFormalShoesTitle() {

    }

    public static String getFirstSportShoesTitle() {

    }

}
