package jenkinsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1
{

	@Parameters("browser")
	@Test(groups = "functional")
	public void jenTest4(@Optional("edge") String browser) throws InterruptedException
	{
		if(browser.equals("edge"))
		{

			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.google.com");
			System.out.println(driver.getCurrentUrl()+"functional Test case Jen edge" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

	@Parameters("browser")
	@Test(groups="regression")
	public void jenTest5(@Optional("edge") String browser) throws InterruptedException
	{
		if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.gmail.com");
			Thread.sleep(500);
			System.out.println(driver.getTitle()+"/   Empty Test case Jen edge" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

}
