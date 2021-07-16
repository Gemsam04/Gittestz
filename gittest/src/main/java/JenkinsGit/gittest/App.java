package JenkinsGit.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	protected WebDriver driver;
	@Test
    public void checktitle()
    {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\SeleniumChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		String eTitle = "Meet Guru99";
		String aTitle = driver.getTitle();
		if(aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		}
    }
}
