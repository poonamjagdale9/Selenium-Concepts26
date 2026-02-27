package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Getmethods {

    public static void main(String args []){
        WebDriver driver = new ChromeDriver();
        // driver constructor will launch our browser with the help of get method
        driver.get("https://demo.nopcommerce.com/");

        // getTitle returns title of the webpage
        String pagetitle = driver.getTitle();
        System.out.println("Page title is :"+ pagetitle);

        //getCurrentUrl- will get current webpage Url
        String url = driver.getCurrentUrl();
        System.out.println("Current Url is :" + url);

        //getPageSource -sometime we need to do validation on page source
        // so this is useful
        String pagesource = driver.getPageSource();
       // System.out.println("Page source is :"+ pagesource);

        //getwindowhandle - this will return id for that single window
        // window Id will change everytime- it get generated on runtime
        String windowId = driver.getWindowHandle();
       // System.out.println("current window Id is: "+ windowId);

        //getwindowhandles - this will return id's of multiple windows
        // this is useful when checking we are gwtting Id for all the open windows or not
        //String windowids = driver.getWindowHandles();

        driver.findElement(By.linkText("Facebook")).click(); // this will open new browser window
        Set<String> windows = driver.getWindowHandles(); // set collection does not allow the duplicates
        System.out.println(windows); //[969FFE120D644FA90ED3B5B97FCD8CB6, B702F0833DFDB75B9C909BFD49D0F15C]
        //What is the use of window id's when we want to close perticular window 


    }
}
