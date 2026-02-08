package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String args[]){

        /*css Cascading Style Sheet
        // tag id  tag#id
        //tag class  tag.classname
        tag attribute tag[attribute ="value"]
                tag class attribute tag.classname[attribute="value"]*/

        WebDriver driver = new ChromeDriver();
        driver.get("https:demo.nopcommerce.com");
        driver.manage().window().maximize();

        // Tag with ID
        /*driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
        // we can find elements without tag name also
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");*/

        //tag and a class - if class name is lenthy we can remove half part
        // tag with class we use dor(.)
       /* driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");*/

        //tag and Attribute - Syntax- tag attribute tag[attribute ="value"]
        //placeholder="Search store"
        driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-shirt");


    }
}
