package com.jenkins.git.Learn_Jenkins_Git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenUrl {
	
	
@Test
 public void launchurl()
 {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.w3resource.com/sql-exercises/");
 }
}
