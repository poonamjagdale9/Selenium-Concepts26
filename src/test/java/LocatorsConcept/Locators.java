package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.PrintStream;
import java.util.List;

public class Locators {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        // By ID
        driver.findElement(By.id("gh-ac")).sendKeys("MAc");
        boolean logoStatus = driver.findElement(By.id("gh-logo")).isDisplayed();
        System.out.println(logoStatus);

        //class name total number of header links
        List<WebElement> headerLinks =driver.findElements(By.className("vl-flyout-nav__link-container"));
        System.out.println("Header link count is"+headerLinks.size());

        //Linktext or partial linktext
        driver.findElement(By.linkText("eBay Live")).click();



    }
}
