package NewTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //Constructor
    LoginPage( WebDriver driver){
        this.driver = driver;
    }

    //Locators

       By txt_login_log = By.xpath("//input[@placeholder='Username']");
        By txt_psw_log = By.xpath("//input[@placeholder='Password']");
        By txt_login_btn = By.xpath("//button[normalize-space()='Login']");

        
        //Action methods
    public void seUserName(String user){
        driver.findElement(txt_login_log).sendKeys(user);
    }
    public void setPassword(String psw){
        driver.findElement(txt_psw_log).sendKeys(psw);
    }

    public void clickLogin(){

        driver.findElement(txt_login_btn).click();
    }


}
