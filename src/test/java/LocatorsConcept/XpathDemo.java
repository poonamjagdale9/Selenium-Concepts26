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
       /* boolean displaystatus = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
        System.out.println(displaystatus);

        String textValue = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
        System.out.println(textValue);*/

        // Xpath with contains- will expect 2 parameter
       // driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("Mac");

        // Xpath with starts with
       // driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("Mac");

        // handling dynamic attributes
        //*[id= 'start' or id='stop']
        //*[contains(@id,'st')]
        //*[starts-with(@id,'st')]

        // name=xyz001   xyz002   xyz0003  xyz004
        //*[contains(@name, 'xyz')]
        //*[contains(@name,'00')]
        //*[starts-with(@name, 'xyz')]

        //name 001xyz   002xyz  003xyz
        //*[contains(@name,'00')]
        //*[contains(@name, 'xyz')]
        //*[starts-with(@name, '00')]

        // name=101xyz 201xyz 301xyz 401xyz
        // we can use only contains
        // //*[contains(@name, 'xyz')]
        // //*[contains(@name, '01')]

        // chained xpath
        // //div[@id='logo']/a/img

        // xpath generation with comands in selectors hub - click on append on selectors option at corner
        //

        boolean logo=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
        System.out.println(logo);




    }
}
