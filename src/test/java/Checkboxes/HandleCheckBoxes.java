package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {
    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.get("https://practice.expandtesting.com/checkboxes");
        driver.manage().window().maximize();
       boolean status1= driver.findElement(By.id("checkbox1")).isSelected();
       System.out.println(status1);

       //select specific check box
     /* driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        boolean status2= driver.findElement(By.id("checkbox1")).isSelected();
        System.out.println(status2);*/

        //select multiple check boxes
       List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class=form-check-input and @type=\"checkbox\"]"));
        for (int i=0; i<=checkboxes.size();i++){
            checkboxes.get(i).click();
        }
    }
}
