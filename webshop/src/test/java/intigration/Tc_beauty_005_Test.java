package intigration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_beauty_005_Test {
	@Test
	public void sugar() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://in.sugarcosmetics.com");
		driver.quit();
	}
}
