package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logintestcases { 
	
	String[][] data= {
			{"Admin","admin123"},
			{"Admin1","admin1234"},
			{"Admin","admin1234"},
			{"Admin1","admin123"}
	};
			
	
	
	
	
	@DataProvider(name="logindata")
	public String[][] logindata(){
	return data;
	}

	@Test(dataProvider="logindata")
	public void loginwithBothcorrect(String uname, String pword)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		  
 driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
 
   WebElement data3=driver.findElement(By.id("txtUsername"));
   data3.sendKeys("uname");
   
   WebElement data1=driver.findElement(By.id("txtPassword"));
   data1.sendKeys("pword");

  WebElement data4=driver.findElement(By.id("btnLogin"));
  data4.click();
  
		  driver.quit();
	}

}
