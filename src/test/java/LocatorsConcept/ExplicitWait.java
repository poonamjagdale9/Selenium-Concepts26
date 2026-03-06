package LocatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String args[]){
        /*
        * Declaration
        * Usage
        * we need to use webdriver wait class
        * finding WebElement is inclusive in Explicit wait*/
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5)); // declaration

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
        driver.manage().window().maximize();

        WebElement txtUsername=
                mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
        //when we use Explicitwait it also returns a webelement directly so we can perform actions

        txtUsername.sendKeys("Admin");
     //   driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
       // driver.close();

       WebElement txtUserPSW= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        txtUserPSW.sendKeys("admin123");

        WebElement LGNButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")));
        LGNButton.click();

    }
}
