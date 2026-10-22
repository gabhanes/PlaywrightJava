package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private final Page page;
	//private final String leave ="getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Leave\"))";
	private final String leave = "oxd-text oxd-text--span oxd-main-menu-item--name";
	public HomePage(Page page) {
		this.page=page;
	}

	public void clickLeave() {
		page.locator(leave).click();
	}
}
