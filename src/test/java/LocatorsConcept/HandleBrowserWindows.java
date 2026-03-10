package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Facebook")).click();

        Set<String> windowIds = driver.getWindowHandles();
        // convert Set in tolist because set does not have get method to
        // so we can not access single window id
        List<String> windowlist = new ArrayList<>(windowIds);

        String parentId = windowlist.get(0);
        String childId = windowlist.get(1);
        
    }
}
