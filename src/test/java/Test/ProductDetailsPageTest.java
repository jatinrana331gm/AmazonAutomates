package Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseClass;
import Pages.SearchProduct;
import Pages.SearchResultsPage;
import Pages.ProductDetailsPage;

public class ProductDetailsPageTest extends BaseClass {

	@Test
	public void launchDetailTest() throws InterruptedException {
		openurl();

		SearchProduct sp = new SearchProduct(driver);
		sp.searchText("Nord 6");

		SearchResultsPage sr = new SearchResultsPage(driver);
		String actualPrice = sr.getPrice("Nord 6 | 8GB+256GB");
		System.out.println(actualPrice);
		Assert.assertEquals(actualPrice, "38,998");
		sr.clickProduct("Nord 6 | 8GB+256GB");

		Thread.sleep(2000);

		ProductDetailsPage pdp = new ProductDetailsPage(driver);
		pdp.switchToWindow();

		System.out.println("New Window Title: " + driver.getTitle());

		closeAll();
	}
}