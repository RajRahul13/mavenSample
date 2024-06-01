package mavensamplepageEvent;
import mavensample.utils.ElementFetch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import mavensample.pageObject.*;

public class googlePageEvent {
	ElementFetch ele = new ElementFetch();
	
	public void search() {
		WebElement s = ele.getWebElement("XPATH", googlePageObject.searchBox);
		s.sendKeys("maven");
		s.sendKeys(Keys.ENTER);
	}
}
