package TextCompareBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.textcompare.pages.textCompareloginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textCompareBase {
		
	public  static WebDriver driver;
	//public static Properties prop;
	




	public static void initialization(){
		

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://localhost:3000/");
	}

	}

		

