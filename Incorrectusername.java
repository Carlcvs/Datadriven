package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Incorrectusername {

	@Test
	@Parameters({"username","password"})

	public void loginwithincorrectusername(String uname, String pword)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		  
 driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
 
   WebElement data3=driver.findElement(By.id("txtUsername"));
   data3.sendKeys("Admin1");
   
   WebElement data1=driver.findElement(By.id("txtPassword"));
   data1.sendKeys("admin123");
 
  WebElement data4=driver.findElement(By.id("btnLogin"));
  data4.click();
  
		  driver.quit();
	}
}
