import org.openqa.selenium.WebDriver;
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

        

    }



}
