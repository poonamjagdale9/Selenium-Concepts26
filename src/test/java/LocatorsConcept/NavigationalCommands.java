package LocatorsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String args[]) throws MalformedURLException {
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

        driver.navigate().to("https://demo.nopcommerce.com/"); // this is direct way

        // URL class
      /*  URL myurl= new URL("\"https://demo.nopcommerce.com/"); // this is indirect way, it will internally call get method only
        driver.navigate().to(myurl); // this method is from java not from selenium*/

        // Navigate back() // we can use this with single url also
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://google.com");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        // Navigate to forward
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        // To refresh the page
        driver.navigate().refresh();




    }
}
