package NewTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
* Launch the browser
* Open url https://demo.opencart.com
* validate title should be "your store"
* close browser */
public class FirstTestCase {
    public static void main(String args[]){
        // launching the browser

        //ChromeDriver driver= new ChromeDriver();  // object of chrome driver
       WebDriver driver1 = new ChromeDriver(); // Webdriver is the parent class- this is most commanly used

        // Open URL
        driver1.get("https://google.com");

        // validate the title
       String Title=  driver1.getTitle();
       System.out.println(Title);
       if(Title.equals("Google")){
           System.out.println("Test pass");
       }
       else{
           System.out.println("Test failed");
       }
      driver1.close();

        //Second test
     /* driver1.get("https://demo.nopcommerce.com");
       String actualTitle = driver1.getTitle();
       if (actualTitle.equals("nopCommerce demo store.")){
           System.out.println(" Second test pass ");
       }
       else {
           System.out.println("Second test failed");
       }
       driver1.close();*/
    }
}
