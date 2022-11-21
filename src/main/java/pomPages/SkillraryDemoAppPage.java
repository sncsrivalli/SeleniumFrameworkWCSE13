package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	
	//Declaration
	
	@FindBy(xpath = "//a[.='COURSE']")
	private WebElement courseTab;
	
	@FindBy(xpath = "//div[@class='dropdown-content']/descendant::a[.='Selenium Training']")
	private WebElement seleniumTrainingTab;
	
	@FindBy(name = "addresstype")
	private WebElement categoryDropdown;
	
	@FindBy(xpath = "//a[.='Contact Us']")
	private WebElement contactUsLink;
	
	@FindBy(xpath = "//ul[@class='list-socialicons']/li[2]")
	private WebElement facebookIcon;
	
	//Initialization
	
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public void mouseHoverOnCourseTab(WebDriverUtility webdriver) {
		webdriver.mouseHoverToElement(courseTab);		
	}
	
	public void clickSeleniumTraining() {
		seleniumTrainingTab.click();
	}
	
	public void selectCategoryFromDropdown(WebDriverUtility webdriver, int index) {
		webdriver.dropdown(categoryDropdown, index);
	}
	
	public void clickContactUs() {
		contactUsLink.click();
	}
	
	public void clickFacebookIcon() {
		facebookIcon.click();
	}
}
