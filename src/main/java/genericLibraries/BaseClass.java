package genericLibraries;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pomPages.AddToCartPage;
import pomPages.ContactPage;
import pomPages.CoreJavaForSeleniumPage;
import pomPages.CoreJavaVideoPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryHomePage;
import pomPages.TestingPage;

public class BaseClass {
	
	public ExcelUtility excel;
	public PropertyFileUtility property;
	public WebDriverUtility webdriver;
	public WebDriver driver;
	public SkillraryHomePage home;
	public SkillraryDemoAppPage demoApp;
	public AddToCartPage cart;
	public ContactPage contact;
	public CoreJavaForSeleniumPage coreJava;
	public CoreJavaVideoPage javaVideo;
	public TestingPage testing;
	
	//@BeforeSuite
	@BeforeTest
	public void testSetUp() {
		excel = new ExcelUtility();
		property = new PropertyFileUtility();
		webdriver = new WebDriverUtility();
	}
	
	@BeforeClass
	public void classSetUp() throws EncryptedDocumentException, IOException {
		property.propertyFileInitialization();
		excel.excelInitialization();
	}
	
	@BeforeMethod
	public void methodSetUp() {
		String url = property.fetchDataFromPropertyFile("url");
		String time = property.fetchDataFromPropertyFile("timeouts");
		long timeout = Long.parseLong(time);
		
		driver = webdriver.OpenBrowserAndNavigateToApplication(url, timeout);
		 home = new SkillraryHomePage(driver);
		 demoApp = new SkillraryDemoAppPage(driver);
		 cart = new AddToCartPage(driver);
		 contact = new ContactPage(driver);
		 coreJava = new CoreJavaForSeleniumPage(driver);
		 javaVideo = new CoreJavaVideoPage(driver);
		 testing = new TestingPage(driver);
	}
	
	@AfterMethod
	public void methodTearDown() {
		webdriver.closeBrowser();
	}
	
	@AfterClass
	public void classTearDown() throws IOException {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
