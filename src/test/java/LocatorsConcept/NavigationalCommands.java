package LocatorsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String args[]){
       /* Navigational commands
       * navigate().to()
       * navigate().back()
       * navigate.forward()
       * navigate().refresh()
       * //Difference between two methods
       * Navigate.to() method internally call get() only
       * get method uses String parameter only, where navigate().to()mentod uses Strin parameter as well as
       * URL objects as well
       * */

        WebDriver driver = new ChromeDriver();
       // driver.get("https://demo.nopcommerce.com/");
        // same we can achieve by using navigate command

        driver.navigate().to("https://demo.nopcommerce.com/");
    }
}
