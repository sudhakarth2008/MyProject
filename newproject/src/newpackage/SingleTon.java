package newpackage;
import org.openqa.selenium.WebDriver;
	

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class SingleTon {

	
	private SingleTon()
	{
		System.out.println("Private COnstructor");
	}
	
	private static SingleTon SN= null;
	
	public static SingleTon getInstance(String str)
	{
		if(SN == null)
		{
			 SN= new SingleTon();
			System.out.println("Text is :"+str);
		     
		}
		
		
		
		return SN;
		
	}
	
	
	

    

}