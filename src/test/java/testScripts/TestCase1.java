package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TestCase1 extends BaseClass {
	
	@Test
	public void firstTest() {
		
		home.clickGearsTab();
		home.clickSkillRaryDemoAppLink();
		webdriver.switchToWindow();
		demoApp.mouseHoverOnCourseTab(webdriver);
		demoApp.clickSeleniumTraining();
		cart.doubleClickPlusButton(webdriver);
		cart.clickAddToCart();
		webdriver.alertPopup();
	}

}
