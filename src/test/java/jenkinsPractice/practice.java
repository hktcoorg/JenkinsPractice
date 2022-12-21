package jenkinsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice 

{
	@Parameters("browser")
	@Test(groups = "sanity")
	public void jenTest1(@Optional("chrome")String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println(driver.getCurrentUrl()+"Sanity Test case Jen chrome" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

	@Parameters("browser")
	@Test(groups= "system")
	public void jenTest2(@Optional("chrome") String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			Thread.sleep(500);
			System.out.println(driver.getTitle()+"/  system Test case Jen chrome" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

	@Parameters("browser")
	@Test(groups = "regression")
	public void jenTest3(@Optional("chrome") String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bing.com");
			Thread.sleep(500);
			System.out.println(driver.getCurrentUrl()+"regration Test case Jen chrome" );
			driver.quit();
		}
		else
		{
			System.out.println("wrong browser");
		}
	}

	@Parameters(value={"browser"})
	@Test
	public void jenTest4(@Optional ("chrome") String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			String url = System.getProperty("url");
			driver.get(url);
			Thread.sleep(500);
			System.out.println(url);
			System.out.println(driver.getCurrentUrl()+"data from system Test case Jen chrome" );
			driver.quit();
		}

		else
		{
			System.out.println("wrong browser");
		}
	}

}
