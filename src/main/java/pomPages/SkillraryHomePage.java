package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	
	//Declaration
	
	@FindBy(xpath = "//ul[@class='home_menu list-unstyled list-inline']/descendant::a[contains(.,'GEARS')]")
	private WebElement gearsTab;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu gear_menu']/descendant::a[.=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	@FindBy(name = "q") 
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchButton;
	
	//Initialization
	
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void clickGearsTab() {
		gearsTab.click();
	}
	
	public void clickSkillRaryDemoAppLink() {
		skillraryDemoAppLink.click();
	}
	
	public void passDataToSearchBar(String data) {
		searchTextField.sendKeys(data);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
}
