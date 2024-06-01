package testCases;

import org.testng.annotations.Test;

import mavensample.base.baseTest;
import mavensamplepageEvent.*;

public class TC1 extends baseTest{
	@Test
	public void seachMaven() {
		googlePageEvent ge = new googlePageEvent();
		ge.search();
	}
	

}
