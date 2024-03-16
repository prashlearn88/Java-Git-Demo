package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigateURL {
	@Parameters("Browser")
	@Test
	public void navigatetoURL(String browserName)
	{
		
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Browser name is :"+browserName);
			 driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
			driver.manage().window().maximize();
			String text=driver.findElement(By.xpath("//div//h1[text()='Peace of mind is just a few clicks away!']")).getText();
			Assert.assertEquals(text,"Peace of mind is just a few clicks away!","Not Match");
			driver.quit();
		}else if(browserName.equalsIgnoreCase("Edge"))
		{
			System.out.println("Browser name is :"+browserName);
			 driver = new EdgeDriver();
			driver.get("https://www.orangehrm.com/");
			driver.manage().window().maximize();
			String text=driver.findElement(By.xpath("//div//h1[text()='Peace of mind is just a few clicks away!']")).getText();
			Assert.assertEquals(text,"Peace of mind is just a few clicks away!","Not Match");
			driver.quit();
		}
		
		
		
	}
  
}
