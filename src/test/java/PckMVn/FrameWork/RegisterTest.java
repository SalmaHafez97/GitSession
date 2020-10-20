package PckMVn.FrameWork;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testData.ExcellDataReader;

public class RegisterTest extends TestBase {
	
	@DataProvider(name="data")
	public Object[][] getTestData() throws IOException
	{
		ExcellDataReader obj = new ExcellDataReader();
		return obj.getExcelData();
		
	}
	

	@BeforeTest
	public void openBrowser () {
		openfirefox("https://www.performancetestingpractice.com/register.php");
		
	}
	@Test(dataProvider="data")
	public void testreg (String fname, String lname, String mail , String user, String pass ,String date , String phone , String addr , String cityTXT,String option  ,String zip) {
		//RegisterationPage object = new RegisterationPage(driver);
	   // object.registerMethod(fname,lname,mail,user,pass,date,phone,addr,cityTXT,option,zip);
	  System.out.println(fname);
	}
	
}


