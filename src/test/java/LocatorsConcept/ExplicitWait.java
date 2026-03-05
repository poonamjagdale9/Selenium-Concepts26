package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {
    public static void main(String args[]){
        /*
        * Declaration
        * Usage*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
        driver.close();
    }
}
