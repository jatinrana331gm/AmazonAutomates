package Test;

import org.testng.annotations.Test;
import Base.BaseClass;
import Pages.SearchProduct;

public class SearchProductTest extends BaseClass {

	@Test
	public void launch() {
		openurl();

		SearchProduct sp = new SearchProduct(driver);
		sp.searchText("iPhone 16");
	}
}
