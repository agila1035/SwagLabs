package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class BaseClass {
	
	
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public static WebDriver driver;
	public WebDriver scrDriver;

	public WebDriver initializeDriver() throws IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
			// Browser driver for chrome browser
			log.info("THE TEST CASES ARE TESTED IN CHROME BROWSER");
			String driverPath = path + "\\src\\main\\java\\browser\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		
	}
	
	
	
	public void getScreenshot(String result, WebDriver driver) throws IOException {
		this.scrDriver = driver;
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot) scrDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/reports/" + result + ".png"));
		// FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));

	}


}
