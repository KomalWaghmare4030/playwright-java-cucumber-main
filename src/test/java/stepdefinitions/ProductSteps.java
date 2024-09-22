package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.ProductPage;

public class ProductSteps {

	ProductPage productPage = new ProductPage(DriverFactory.getPage());

	@When("verify new tab {string} opens")
	public void verifyNewTabOpens(String tab) {
		Assert.assertTrue(tab + " is not opened", productPage.verifyTitleOfPage(tab).contains(tab));
	}
	
	@When("click on visit apple store")
	public void clickOnVisitAppleStore() {
		productPage.clickOnLink();
	}
}
