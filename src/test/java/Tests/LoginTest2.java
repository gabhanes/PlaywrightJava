package Tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	void LoginTest1() {
		LoginPage loginPage = new LoginPage(page);
		HomePage homePage = new HomePage(page);

		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		test.info("Adding username");
		loginPage.addUsername("Admin");
		
		test.info("Adding password");
		loginPage.addPassword("admin123");
		loginPage.clickLoginButton();

		homePage.clickLeave();

	}
	
	@Test
	void LoginTest2() {
		test.skip("Skipping this test");
		throw new SkipException("Skipping this test");

	}
	
	@Test
	void LoginTest3() {
		LoginPage loginPage = new LoginPage(page);
		//HomePage homePage = new HomePage(page);

		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		test.info("Adding username");
		loginPage.addUsername("Admin");
		
		test.info("Adding password");
		loginPage.addPassword("admin123");
		loginPage.clickLoginButton();

		//homePage.clickLeave();
		
		test.info("All test completed");

	}
	
	
}
