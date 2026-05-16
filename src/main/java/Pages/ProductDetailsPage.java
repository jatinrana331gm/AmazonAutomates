package Pages;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
	WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToWindow() {
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String wh : allWindows) {
			if (!wh.equals(parent)) {
				driver.switchTo().window(wh);
			}
		}
	}
}