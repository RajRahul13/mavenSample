package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hello {


		// TODO Auto-generated method stub
		@Test(dataProvider = "dp")
		public void hello1(String str1) {
		System.out.println(str1);
		}
		@DataProvider(name = "dp")
		 public Object[][] dpMethod(){
			 return new Object[][] {{"First-Value"}, {"Second-Value"}};
		}

}
