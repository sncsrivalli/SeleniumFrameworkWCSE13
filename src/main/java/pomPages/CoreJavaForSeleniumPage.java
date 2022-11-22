package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	//Declaration
	
	@FindBy(xpath = "//a[.=' Core Java For Selenium Trainin']")
	private WebElement coreJavaImage;
	
	//Initialization
	
	public CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickCoreJavaImage() {
		coreJavaImage.click();
	}

}
