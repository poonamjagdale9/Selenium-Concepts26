package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommands {
    public static void main(String args[]){
        /*
         * Wait commands
         * Synchronization
         * Every wait statement has advantages and disadvantages
         * Thread.sleep - is coming from java not from Webdriver
         * Selenium webdriver provides only
         * 1] implicit wait
         * 2] explicit wait/fluent wait
         * */

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("12345");

    }
}
