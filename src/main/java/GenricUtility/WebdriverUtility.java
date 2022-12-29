package GenricUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

public class WebdriverUtility 
{
	Robot robot;

	/**
	 * Switch to window
	 * @param driver
	 * @param taburl
	 */
	public void switchwindow(WebDriver driver, String taburl)
	{
		Set<String> allid = driver.getWindowHandles();
		String expectedUrl = taburl;

		for (String tab : allid) 
		{
			String actualUrl = driver.getCurrentUrl();
			if(expectedUrl.contains(actualUrl))
			{
				driver.switchTo().window(tab);
				break;
			}
		}
	}

	/**
	 * to open new tabs
	 * @throws AWTException
	 */
	public void robottab(WebDriver driver) throws AWTException
	{
		robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public void robotswitchtab(WebDriver driver, String containtext, String taburl)
	{

		Set<String> allid = driver.getWindowHandles();
		for (String tab : allid) 
		{
			if(driver.getPageSource().contains(containtext))
			{
				driver.switchTo().window(tab);
				driver.get(taburl);
			}
			else
			{
				System.out.println("Not contains your text");
			}

		}
	}
}

