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
       // driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Mac");

        // Xpath with 'and' 'or' operator
        // with 'and' operator both the attributes ahould be true
       //  driver.findElement(By.xpath("//input[@name='q' and @id='small-searchterms']")).sendKeys("Mac");

         //with 'or' operator both the attributes ahould be true
       // driver.findElement(By.xpath("//input[@name='q' or @id='small-searchterms']")).sendKeys("Mac");

        //Xpath with inner text - by using text method
        // //a[text() ='Computers']
       // driver.findElement(By.xpath("//a[text() ='Computers']")).click();

        // find the elements by text only without attribute or link
        boolean displaystatus = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
        System.out.println(displaystatus);
        
        String textValue = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
        System.out.println(textValue);
    }
}
