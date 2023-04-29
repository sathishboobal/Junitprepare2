package TestNGprepare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG5classexecution {
	WebDriver d;
	@Test
	private void TC5() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.quit();
		

	}
	@Test
	private void TC6() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://www.myntra.com/");
		d.quit();

	}
	

}
