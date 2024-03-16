package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateURL {
	@Test
	public void navigatetoURL()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//div//h1[text()='Peace of mind is just a few clicks away!']")).getText();
		Assert.assertEquals(text,"Peace of mind is just a few clicks away!","Not Match");
		driver.quit();
		
	}
  
}
