package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Fluentwait {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        // Fluent wait declaration
        Wait<WebDriver> mywait= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);

        driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\\\"");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        driver.close();
    }
}
