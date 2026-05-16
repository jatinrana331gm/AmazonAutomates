package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;

public class SearchResultsPage {
	WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getPrice(String productName) {
		By prices = By.xpath("//span[contains(text(),'" + productName
				+ "')]/ancestor::div[contains(@class,'puisg-col-inner')]//span[contains(@class,'a-price-whole')]");
		return driver.findElement(prices).getText();
	}

	public void clickProduct(String productClick) {
		By product = By.xpath("//span[contains(text(),'" + productClick + "')]/ancestor::a");
		driver.findElement(product).click();
	}

}
