package JenkinsTest.WithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Jenkins Integration using maven
public class Day1 {
	
	@Parameters("Browser")
	@Test
	public void testit(String Browser) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println(Browser);
		driver.manage().window().maximize();
		driver.get("https://jpetstore.aspectran.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.quit();
	}

}
