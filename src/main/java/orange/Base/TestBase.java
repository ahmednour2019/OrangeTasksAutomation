package orange.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import orange.util.TestUtil;

public class TestBase {
	
	protected  static WebDriver driver;
	protected  static Properties prop;
	
	public TestBase()
	{
		
		try{
			
			prop= new Properties();
			FileInputStream ip= new FileInputStream("C:/Users/nour/workspace/orangeTask/src/main/java/orange/config/config.properties");
			prop.load(ip);
			
		   } catch(FileNotFoundException e){
			e.printStackTrace();   
		   }catch(IOException e){
			   e.printStackTrace();
		   }
		
		
	}
         public static void initialization() {
          
	        String browsername= prop.getProperty("browser");
			    if(browsername.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:/Users/nour/workspace/orangeTask/Drivers/chromedriver.exe");
				driver= new ChromeDriver();
			}else if(browsername.equals("FF")){
				System.setProperty("WebDriver.gecko.driver", "C:/Users/nour/workspace/orangeTask/Drivers/geckodriver.exe");
				driver= new FirefoxDriver();
			}
			    driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
			    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
			    driver.get(prop.getProperty("url"));
			    
            }
	


}
