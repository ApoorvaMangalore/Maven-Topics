package intigration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Tc_beauty_002_Test {
	@Test
	public void lakmeindia() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.lakmeindia.com");
		driver.quit();
	}
}
