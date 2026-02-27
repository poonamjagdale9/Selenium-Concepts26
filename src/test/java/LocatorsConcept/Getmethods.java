package LocatorsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

    public static void main(String args []){
        WebDriver driver = new ChromeDriver();
        // driver constructor will launch our browser with the help of get method
        driver.get("https://demo.nopcommerce.com/");

        // getTitle returns title of the webpage
        String pagetitle = driver.getTitle();
        System.out.println("Page title is :"pagetitle);

        //getCurrentUrl- will get current webpage Url
        

    }
}
