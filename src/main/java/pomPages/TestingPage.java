package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class TestingPage {
	
	//Declaration
	
	@FindBy(id = "munit testing ")
	private WebElement junitImage;
	
	@FindBy(id = "cartArea")
	private WebElement myCartArea;
	
	//Initialization
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public void DragJunitToMyCart(WebDriverUtility webdriver) {
		webdriver.dragAndDropElement(junitImage, myCartArea);
	}
}
