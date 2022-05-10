package exercise;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup {
	
	static WebDriver driver;
	static String browserPath;
	String url;
	
	@BeforeTest
	public void setupBrowser() {
		
		//String dir = System.getProperty("user.dir");
	//	DOMConfigurator.configure("C:\\Users\\Tejas\\eclipse-workspace\\practicePrograms\\src\\log4j.xml");
		browserPath = "C:\\Users\\Tejas\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", browserPath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	//	driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
