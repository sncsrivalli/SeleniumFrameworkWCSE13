package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
	
	//Declaration
	
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement closeCookiesIcon;
	
	@FindBy(xpath = "//span[.='Play']")
	private WebElement playButton;
	
	@FindBy(xpath = "//span[.='Pause']")
	private WebElement pauseButton;
	
	@FindBy(xpath = "//span[.='Add To Wishlist']")
	private WebElement addToWishListLink;
	
	//Initialization
	
	public CoreJavaVideoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Utilization
	
	public void clickCloseCookies() {
		closeCookiesIcon.click();
	}
	
	public void clickPlayButton() {
		playButton.click();
	}
	
	public void clickPauseButton() {
		pauseButton.click();
	}
	
	public void clickAddToWishList() {
		addToWishListLink.click();
	}
}
