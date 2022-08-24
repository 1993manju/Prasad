package genericutility;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void DB()
	{
		System.out.println("*******CONNECT TO DATABASE********");
	}
	@BeforeClass(groups = {"smoke","regression"})
	public void Brouser()
	{
		System.out.println("******LAUNCH THE BROUSER***********");
	}
	@BeforeMethod(groups = {"smoke","regression"})
	public void Login()
	{
		System.out.println("******LOGIN TO THE APPLICATION********");
	}
	@AfterMethod(groups = {"smoke","regression"})
	public void LoginOut()
	{
		System.out.println("******LOGINOUT TO THE APPLICATION********");
	}
	@AfterClass(groups = {"smoke","regression"})
	public void CloseBrouser()
	{
		System.out.println("******CLOSE THE BROUSER***********");
	}
	@AfterSuite(groups = {"smoke","regression"})
	public void CloseDB()
	{
		System.out.println("*******CLOSE TO DATABASE********");
	}

}
