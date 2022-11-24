package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class TestingPage {
	
	//Declaration
	
	@FindBy(xpath = "//img[@id='munit testing ']")
	private WebElement junitImage;
	
	@FindBy(id = "cartArea")
	private WebElement myCartArea;
	

	@FindBy(xpath = "//ul[@class='list-socialicons']/li[2]")
	private WebElement facebookIcon;
	
	//Initialization
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public void DragJunitToMyCart(WebDriverUtility webdriver) {
		webdriver.dragAndDropElement(junitImage, myCartArea);
	}
	
	public void clickFacebookIcon() {
		facebookIcon.click();
	}

	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
}
