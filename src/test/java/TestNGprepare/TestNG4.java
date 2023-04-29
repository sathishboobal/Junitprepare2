package TestNGprepare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG4 {
	WebDriver d;
	@Test
	private void TC10() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		
	d.get("https://www.facebook.com/");
	Thread.sleep(3000);
	d.close();

	}
	@Test
	private void TC11() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		Thread.sleep(3000);
		d.close();

	}
	@Test
	private void TC12() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		d.close();
	

}}
