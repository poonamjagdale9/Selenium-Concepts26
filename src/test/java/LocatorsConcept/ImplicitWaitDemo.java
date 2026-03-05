package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Implicit wait
        /*always write implicit wait after creating the driver instance so we do not
        need to write wait for every element where synchronisation issue happens
        it will aplly for every statement of the code if we have 100 line of code it will apply
        for every line of the code, it will be active until we close our driver/browser
        * Implicit wait will not west the time like Thread .sleep if element found in 2se
        rest
        Disadvantages - Implicit wait will wait only for given time, if element does not found in that time it
        will throw NoSuchElement exception.
        */
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");


        //Explicit wait
        

    }
}
