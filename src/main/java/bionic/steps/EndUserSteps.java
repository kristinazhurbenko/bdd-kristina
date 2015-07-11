package bionic.steps;

import bionic.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static ch.lambdaj.Lambda.join;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {
    MainPage mainPage;

    @Step
    public void open_shop() {
        mainPage.open();
    }

    @Step
    public void should_see_logo(){
        mainPage.isLogoDisplayed();
    }

    @Step
    public void should_see_catalog(){
        assertTrue(mainPage.isCatalogDisplayed());
    }

    @Step
    public void search(String name){
        mainPage.search(name);
    }

    @Step
    public void open_first_search_result(){mainPage.openFirstSearchResult();}

    @Step
    public void should_see_searched_phone(String phoneName, String phoneCompany){
        assertTrue(mainPage.isPhoneFound(phoneCompany,phoneName));
    }

}