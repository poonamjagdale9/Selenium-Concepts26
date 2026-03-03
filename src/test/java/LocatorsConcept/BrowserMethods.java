package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

    // //Browser methods
    //       /*
    //        close()- close only single browser
    //        Quit() - close multiple browser
    //        */

    public static void main(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.findElement(By.xpath("//a[@text()='Facebook']")).click();

        driver.close();

    }
}
