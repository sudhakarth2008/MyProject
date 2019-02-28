package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterClass; 
import org.testng.Assert;
import org.testng.annotations.*;
public class firsttestngfile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\sudhakar\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe";
   WebDriver driver;
    
    
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
           driver = new ChromeDriver();
      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
          driver.get(baseUrl);
  
      }
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
     @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}