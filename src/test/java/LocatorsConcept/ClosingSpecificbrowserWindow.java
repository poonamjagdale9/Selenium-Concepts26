package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificbrowserWindow {
    public static void main(String args[]){
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Facebook")).click();

        Set<String> windowIds = driver.getWindowHandles();

        for (String windwID: windowIds){
            String title = driver.switchTo().window(windwID).getTitle();
            System.out.println(title);

            if (title.equals("https://demo.nopcommerce.com/")){
                driver.close();
            }
        }

    }
}
