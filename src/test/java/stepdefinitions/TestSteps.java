package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.util.List;

import org.junit.Assert;

import com.microsoft.playwright.Locator;
import pages.TestPage;

public class TestSteps {
	TestPage testPage = new TestPage(DriverFactory.getPage());

	@Given("user navigates to {string}")
	public void navigateToUrl(String url) {
		testPage.navigateToUrl(url);
	}

	@When("user selects {string} drop down menu")
	public void selectFromDropdownMenu(String option) {
		testPage.selectFromDropdown(option);
	}

	@And("user enters {string} value in search box")
	public void userEntersValueInSearchBox(String value) {
		testPage.enterValueInTextField(value);
	}

	@And("verify suggestions are related to {string}")
	public void verifySuggestions(String value) {
		List<Locator> listOfSuggestions = testPage.getAllElementsFromList(value);
		for (Locator element : listOfSuggestions) {
			String text = element.getAttribute("aria-label");
			Assert.assertTrue(text + " does not contain " + value, text.contains(value));
		}
	}
	
	@And("click on {int} suggestion")
	public void verifySuggestions(int value) {
		testPage.clickOnSuggestion(value);
	}
}
