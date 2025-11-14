package Utilities;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class Utility {
        public static WebDriver driver;

        public static void setUtilityDriver(){
            driver = HomePage.driver;
        }
    }
