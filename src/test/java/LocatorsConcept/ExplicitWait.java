package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String args[]){
        /*
        * Declaration
        * Usage
        * we need to use webdriver wait class*/
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5)); // declaration
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
        driver.manage().window().maximize();
     //   driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
        driver.close();

    }
}
