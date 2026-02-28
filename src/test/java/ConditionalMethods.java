import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    /*Conditional method access these commands through Webelement
    *returns boolean values true or false
    // isDisplayed - it will check element display or not
    isEnabled() - elements disable or workig or not
    isSelected() - specially redio button and check boxex are selected or not
     */

    public static void main(String args []){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();

        // when we dont use isDisplay method then it will return Webelement
        WebElement logo1 = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        logo1.isDisplayed();
        System.out.println(logo1);
        
        boolean logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
        System.out.println(logo);


    }



}
