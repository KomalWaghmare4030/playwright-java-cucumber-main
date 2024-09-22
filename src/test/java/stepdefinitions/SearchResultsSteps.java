package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.SearchResultsPage;

public class SearchResultsSteps {
	SearchResultsPage searchResultsPage = new SearchResultsPage(DriverFactory.getPage());
	
	@When("select {string} from search results")
	public void selectFromSearchResults(String option) {
		searchResultsPage.selectProductFromSerachPage(option);
	}
}
