package TestNGprepare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG6crossbrowser {
	WebDriver d;
	@Parameters("browser")
	@Test
	private void TC20( String name) {
		if (name.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();	
		}
		else if (name.equals("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();	
			d=new ChromeDriver();
		}
		else {
			
			WebDriverManager.iedriver().setup();
			d=new ChromeDriver();
		
		}
		d.get("https://www.myntra.com/");
		d.manage().window().maximize();
		

	}

}
