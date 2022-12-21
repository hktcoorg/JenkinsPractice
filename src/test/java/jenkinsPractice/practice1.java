package jenkinsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1
{

	@Parameters("browser")
	@Test(groups = "functional")
	public void jenTest4(@Optional("chrome") String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println(driver.getCurrentUrl()+"functional Test case1 Jen 2nd class" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

	@Parameters("browser")
	@Test(groups="regression")
	public void jenTest5(@Optional("chrome") String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			Thread.sleep(500);
			System.out.println(driver.getTitle()+"/   Empty Test case2 Jen 2nd class" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

}
