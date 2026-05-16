package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseClass;
import Pages.SearchProduct;
import Pages.SearchResultsPage;

public class SearchResultsPageTest extends BaseClass {

	public void searchForProduct(String text) {
		SearchProduct sp = new SearchProduct(driver);
		sp.searchText(text);
	}

	public void verifyPriceAndClick(String productName, String expectedPrice) {
		SearchResultsPage sr = new SearchResultsPage(driver);
		String actualPrice = sr.getPrice(productName);
		System.out.println(actualPrice);
		Assert.assertEquals(actualPrice, expectedPrice);
		sr.clickProduct(productName);
	}

	@Test
	public void launch() {
		openurl();
		searchForProduct("iPhone");
		verifyPriceAndClick("Nord 6 | 8GB+256GB", "38,998");
	}
}