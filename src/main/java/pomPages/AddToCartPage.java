package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class AddToCartPage {

	//Declaration
	
	@FindBy(id = "add")
	private WebElement plusButton;
	
	@FindBy(xpath = "//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	
	//Initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void doubleClickPlusButton(WebDriverUtility webdriver) {
		webdriver.doubleClickOnElement(plusButton);
	}
	
	public void clickAddToCart() {
		addToCartButton.click();
	}
}
