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
         * Disadvantages of thread.sleep 1.Pause the exicution 2.even though element is found before the time still
         * excecution will wait for the given time some time element takes less time sometimes it takes more times 3.we need to write
         * thread.sleep multiple times where ever sychronisation issue we need to write thread.sleep
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

       /*if you dont give wait time you get NoSuchElementException.
        NoSuchElementException - When locator is not present on the web page
        this is due to synchronisation
        ElementNotFoundException - When your locator is incorrect (incorrect xpath)*/

        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("12345");

    }
}
