package LocatorsConcept;

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

    }
}
