package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fluentwait {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\\\"");
        driver.manage().window().maximize();

        driver.findElement(By.xpath())
    }
}
