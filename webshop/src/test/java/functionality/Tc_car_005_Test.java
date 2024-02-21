package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_car_005_Test {
	@Test
	public void landrover() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.landrover.in/range-rover/range-rover/index.html");
		driver.quit();
	}

}
