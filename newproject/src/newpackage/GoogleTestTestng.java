package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterClass; 
import org.testng.Assert;
import org.testng.annotations.*;
public class GoogleTestTestng {
     WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudhakar\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
       
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
    }
    
    @Test
    public void googleTitleTest() {
        String title = driver.getTitle();
        System.out.println(title);
    }
    
    @AfterTest
    public void tearDown() {
    	
        driver.quit();
    }
}