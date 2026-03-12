package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleCheckBoxes {
    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.get("https://practice.expandtesting.com/checkboxes");
        driver.manage().window().maximize();
       boolean status1= driver.findElement(By.id("checkbox1")).isSelected();
       System.out.println(status1);
    }
}
