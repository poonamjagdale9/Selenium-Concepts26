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

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
        System.out.println();

    }
}
