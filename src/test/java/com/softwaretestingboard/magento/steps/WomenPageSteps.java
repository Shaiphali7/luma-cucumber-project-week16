package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class WomenPageSteps {
    @When("I mouse hover on women menu")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("I Click on Jackets")
    public void iClickOnJackets() {
        new HomePage().mouseHoverAndClickOnJacket();
    }

    @Then("I verify product name displayed as per the sort by filter")
    public void iVerifyProductNameDisplayedAsPerTheSortByFilter() {

        List<String> jacketNameBefore=new WomenProduct().getJacketElements();

        new WomenProduct().selectSortByFilter();
        List<String> jacketNameAfter=new WomenProduct().getJacketElements();

        jacketNameBefore.sort(String.CASE_INSENSITIVE_ORDER);
        Assert.assertEquals(jacketNameBefore,jacketNameAfter);

    }

    @Then("I verify the product price is as per the sort by price filter")
    public void iVerifyTheProductPriceIsAsPerTheSortByPriceFilter() {
        List <String> jacketPriceBefore=new WomenProduct().getPriceElements();
        new WomenProduct().sortByPrice();
        List <String> jacketPriceAfter=new WomenProduct().getPriceElements();
        Collections.sort(jacketPriceBefore);
        Assert.assertEquals(jacketPriceBefore,jacketPriceAfter,"Wrong price");
    }
}
