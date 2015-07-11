package bionic.jbehave;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import bionic.steps.EndUserSteps;
import org.jbehave.core.model.Meta;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("main page is opened")
    public void givenMainPageIsOpened() {
        endUser.open_shop();
    }

    @When("I see shop logo")
    public void whenISeeShopLogo() {
        endUser.should_see_logo();
    }

    @Then("I see products catalog")
    public void thenISeeProductsCatalog() {
        endUser.should_see_catalog();
    }

    @Given("a main page is opened")
    public void givenAMainPageIsOpened() {
       endUser.open_shop();
    }

    @When("I perform search by phone <phoneName>")
    public void whenIPerformSearchByPhoneName(String phoneName) {
        endUser.search(phoneName);
    }

    @When("open first search results link")
    public void whenOpenFirstSearchResultsLink() {
        endUser.open_first_search_result();
    }

    @Then("I see phone <phoneName> <phoneCompany>")
    public void thenISeePhone(String phoneName, String phoneCompany) {
        endUser.should_see_searched_phone(phoneName,phoneCompany);
    }


}
