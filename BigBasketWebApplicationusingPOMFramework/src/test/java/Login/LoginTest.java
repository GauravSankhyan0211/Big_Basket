package Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	  WebDriver driver;
	   LoginPage loginPage;
	   DropDownPage dropDown;
	   SearchPage search;
	   AddToCartPage addButton;
	   MouseHover mouseHover;
	   
	   
	    @BeforeMethod
	    public void setUp() throws IOException {
	    	Properties p = new Properties();
	    	FileInputStream fis = new FileInputStream("/Users/shwetasankyan/Documents/workspace-spring-tool-suite-4-4.22.0.RELEASE/BigBasketWebApplicationusingPOMFramework/src/test/resources/other.properties"); 
	    	p.load(fis);
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get(p.getProperty("URL"));
	        loginPage = new LoginPage(driver);    
	        search = new SearchPage(driver);
	        dropDown = new DropDownPage(driver);
	        addButton = new AddToCartPage(driver);
	        
	    }
	   
//		@Test(priority = 1)
//	    public void testLogin() throws InterruptedException {
//	    	
//	        loginPage.clickLoginButton();
//	        Thread.sleep(2000);
//	        loginPage.enterMobileNumber("7082813625");
//	        Thread.sleep(2000);
//	        loginPage.clickContinueButton();
//	        Thread.sleep(2000);
//	    }
//	    
//	    @Test(priority = 2)
//	    public void search() throws InterruptedException {
//	    	search.clickonsearch();
//	        Thread.sleep(2000);
//	        search.enterproductname("apple");
//	        Thread.sleep(2000);
//	        search.pressEnterKey();
//	        Thread.sleep(2000);
//	    }
//	    
//	    @Test(priority = 3)
//	    public void search1() throws InterruptedException {
//	    	search.clickonsearch();
//	        Thread.sleep(2000);
//	        search.enterproductname("Banana123");
//	        Thread.sleep(2000);
//	        search.pressEnterKey();
//	        Thread.sleep(2000);
//	    }
//	    @Test(priority = 4)
//	    public void search2() throws InterruptedException {
//	    	search.clickonsearch();
//	        Thread.sleep(2000);
//	        search.enterproductname("Oranges$");
//	        Thread.sleep(2000);
//	        search.pressEnterKey();
//	        Thread.sleep(2000);
//	    }
//		
		@Test(priority = 5)
	    public void DropDown() throws InterruptedException {
	    	
	        dropDown.clickondropdown();
	        Thread.sleep(2000);
	       
	    }
		
		@Test(priority = 6)
		  public void addgrocery() throws InterruptedException {
	    	Thread.sleep(3000);
	    	addButton.clickOnAdd();
	    	Thread.sleep(3000);

	    }
		
		 @Test(priority = 7)
		    public void mouseaction() throws InterruptedException {
		    	Thread.sleep(3000);
		    	Thread.sleep(2000);
		    	mouseHover.mouseclickaction();
		    	Thread.sleep(2000);
		    	mouseHover.mouseperm();
		    }
	       
	    
		
	    @AfterMethod
	    public void tearDown() {
	    	
	        driver.quit();
	    }
	}
