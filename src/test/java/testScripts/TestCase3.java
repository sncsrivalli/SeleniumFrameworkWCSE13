package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TestCase3 extends BaseClass{
	
	@Test
	public void thirdTest() throws InterruptedException {
		home.passDataToSearchBar("core java for selenium");
		home.clickSearchButton();
		coreJava.clickCoreJavaImage();
		javaVideo.clickCloseCookies();
		webdriver.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(5000);
		javaVideo.clickPauseButton();
		webdriver.switchBackFromFrame();
		javaVideo.clickAddToWishList();
		
	}

}
