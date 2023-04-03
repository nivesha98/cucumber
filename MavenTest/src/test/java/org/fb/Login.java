package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");	
		WebElement usertext = driver.findElement(By.id("email"));
		usertext.sendKeys("welcome");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("56789343");
		WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		btnlogin.click();
		driver.quit();

		
	}
}
