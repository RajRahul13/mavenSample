package testCases;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import mavensample.base.baseTest;


public class Selenium extends baseTest {
	

	@Test
	public void google() {
		baseTest.driver.manage().window().maximize();
		baseTest.driver.manage().deleteAllCookies();
		
		//baseTest.driver.get("https://www.google.com/");
		
		baseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebDriverWait wait = new WebDriverWait(baseTest.driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.titleContains("Google"));
		
		String Title = baseTest.driver.getTitle();
		
		Assert.assertEquals(Title, "Google");
		
		System.out.println(Title);
		
	}
	


}
