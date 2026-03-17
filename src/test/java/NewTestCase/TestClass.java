package NewTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
            driver.get("https:www.google.com");
            driver.findElement(By.id("L2AGLb")).click();
            driver.findElement(By.id("APjFqb")).sendKeys("Argoes");




        }
}
