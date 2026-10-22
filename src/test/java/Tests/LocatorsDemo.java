package Tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LocatorsDemo extends BaseTest{
	
	@Test
	public void testAllLocators() {
		
		page.navigate("https://trytestingthis.netlify.app/");
		
		//Locating element by id
		page.locator("#fname").fill("Tom");
		
		//Locating element by name
		page.locator("input[name='lname']").fill("Holland");
		
		//page.pause();
		
		//Locating element by radio button
		page.locator("input[value='male']").check();
		
		//Locating element by dropdown using id attribute
		page.locator("select#option").selectOption("option 2");
		
		//Locating element by checkbox
		page.locator("input[type='checkbox'][value='Option 3']").check();
		page.getByLabel("Option 1").check();
		
		//date
		page.locator("//input[@type='date']").fill("2026-10-20");
		
		//page.pause();
		
		//button
		//page.getByText("Submit").click();
		
		//Role Selector
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		
	}

}
