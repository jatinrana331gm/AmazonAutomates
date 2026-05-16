package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchProduct {
	WebDriver driver;

	By searchText = By.id("twotabsearchtextbox");

	public SearchProduct(WebDriver driver) {
		this.driver = driver;
	}

	public void searchText(String productName) {
		driver.findElement(searchText).sendKeys(productName, Keys.ENTER);
	}

}