package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String args[]){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Xpath with the single attribute-- for search box
        //driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("Mac");

        // Xpath with multiple attributes
        driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Mac");

    }
}
