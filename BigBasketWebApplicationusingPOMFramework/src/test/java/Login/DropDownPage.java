package Login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

	private WebDriver driver;
    @FindBy(xpath = "//div[@id='headlessui-listbox-button-:r7m:']//button[@class='Button-sc-1dr2sn8-0 PackChanger___StyledButton-sc-newjpv-0 bXTMoW kdiDqZ']")
     private WebElement dropDown;
    public DropDownPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickondropdown() {
    	dropDown.click();
    }
   
	
}
	
	
	

