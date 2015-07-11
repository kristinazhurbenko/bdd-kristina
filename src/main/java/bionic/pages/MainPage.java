package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created by bdd on 09.07.15.
 */
@DefaultUrl("http://www.sokol.ua/")
public class MainPage extends PageObject {

    @FindBy(id="catalog")
    private WebElementFacade catalogFrame;

    @FindBy(className="logo")
    private WebElementFacade logoImage;

    @FindBy(id="field-input-search")
    private WebElementFacade searchField;

    @FindBy(id="btn-search-top")
    private WebElementFacade searchBtn;

    @FindBy(xpath = "//div[preceding-sibling::div[@class='number'][contains(text(),'1.')]]/a")
    private WebElementFacade firstSearchResult;

    @FindBy(css=".clearfix.inlineStyle>span")
    private WebElementFacade productTitle;




    public boolean isLogoDisplayed(){
        return logoImage.isCurrentlyVisible();
    }
    public boolean isCatalogDisplayed(){
        return catalogFrame.isCurrentlyVisible();
    }

    public void search(String name){
        searchField.clear();
        searchField.sendKeys(name);
        searchBtn.click();
    }

    public void openFirstSearchResult(){
        firstSearchResult.click();
    }

    public boolean isPhoneFound(String phoneCompany,String name){
        if(findAll(By.cssSelector(".breadcrumbs>li>a[href*='smartphones/"+phoneCompany+"']")).size()>0
                ||findAll(By.cssSelector(".breadcrumbs>li>a[href*='mobile-phones/"+phoneCompany+"']")).size()>0
                && productTitle.getText().toLowerCase().contains(name))
        return true;
        else
            return false;
    }
}
