package NewTestCase;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    LoginPage lp = new LoginPage(driver);

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() {
        lp.setPassword("admin");
        lp.setPassword("admin123");
        lp.clickLogin();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    void tearDown(){
        driver.close();
    }

}
