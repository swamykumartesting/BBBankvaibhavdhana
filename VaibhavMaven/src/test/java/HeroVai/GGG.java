package HeroVai;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GGG {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\CuteOCT_Workspace\\chromedriver.exe\\"); 
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize(); 
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
