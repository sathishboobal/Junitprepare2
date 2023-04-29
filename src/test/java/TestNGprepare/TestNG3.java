package TestNGprepare;

import java.awt.Window;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG3 {
	WebDriver d;
	@BeforeClass
	private void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		
		

	}
	@Test(invocationCount = 3)
	private void TC1() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();

	}
	@Test(priority = 10)
	private void TC2() {
		d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();

	}
	@Test(priority = -1)
	private void TC3() {
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();

	}
	@Test(enabled = false)
	private void TC4() {
		d=new ChromeDriver();
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();

	}
	@AfterMethod
	private void closebrowser() {
		
		d=new ChromeDriver();
		d.close();

	}
	





}
	
