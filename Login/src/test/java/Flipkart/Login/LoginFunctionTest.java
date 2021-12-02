package Flipkart.Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class LoginFunctionTest
{
	WebDriver driver;
  @Test
  public void f()
  {
	  driver.findElement(By.xpath("//input[@class = '_2IX_2- VJZDxU']")).sendKeys("9699146299");
	  driver.findElement(By.xpath("//input[@class = '_2IX_2- _3mctLh VJZDxU']")).sendKeys("nkp@8791NKP");
	  driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']")).click();	 
	  
	  
	 }
  
//  @Test
//  public void logout ()
//  {
////	  Actions a = new Actions (driver);
////	  WebElement webelement = driver.findElement(By.xpath("(//div[@class='_1psGvi _3BvnxG'])[1]"));
////	  a.moveToElement(webelement).perform();
////	  List <WebElement> ele = driver.findElements(By.xpath("(//div[@class='_1psGvi _3BvnxG'])[1]"));
////	  int siz = ele.size();
////	  System.out.println(siz);
//	  
//  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Velocity\\Chrome_Driver\\U2\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.navigate().to("https://www.flipkart.com/");
  }
  

  @AfterClass
  public void afterClass() {
  }

}
