package Login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SearchPage {
	private WebDriver driver;
	
	    @FindBy(xpath = "//div[@class='Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD']//input[@placeholder='Search for Products...']")
	     private WebElement searchBar;
	    
	    public SearchPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
		
	    public void clickonsearch() {
	    	searchBar.click();
	    }
	    public void enterproductname(String product) {
	    	searchBar.sendKeys(product);
	    }
	    public void pressEnterKey() {
	      searchBar.sendKeys(Keys.ENTER);
	}
		
	}

