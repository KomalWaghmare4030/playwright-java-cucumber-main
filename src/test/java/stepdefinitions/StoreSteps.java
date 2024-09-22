package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.StorePage;

public class StoreSteps {
	StorePage storePage = new StorePage(DriverFactory.getPage());

	@When("select {string} from store")
	public void selectFromSearchResults(String option) {
		storePage.clickOnOption(option);
	}

	@Then("click on {string} showing on {int} product")
	public void clickOnProduct(String value, int index) {
		storePage.hoverOnElement(value, index);
	}

	@And("verify newly opened modal is related to same product")
	public void verifyNrewlyModalHavingSameText() {
		Assert.assertEquals("product title is not same", storePage.getTextOfNewModal(), storePage.productTitle);
	}
}
