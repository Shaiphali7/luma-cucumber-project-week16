package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearPageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHoverToGearMenu();

    }

    @And("I Click on Bags")
    public void iClickOnBags() {
        new HomePage().mouseHoverAndClickOnBag();
    }

    @And("I Click on Product Name Overnight Duffle")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnDuffleBag();
    }

    @And("I verify the product is Overnight Duffle")
    public void iVerifyTheProductIsOvernightDuffle() {
        String actualText=new GearPage().productName();
        Assert.assertEquals(actualText, "Overnight Duffle", "Wrong message");

    }

    @And("I change quantity to three")
    public void iChangeQuantityToThree() {
        new GearPage().changeQuantitytoThree();
    }

    @And("I Click on ‘Add to Cart’ Button.")
    public void iClickOnAddToCartButton() {
        new GearPage().addToCart();
    }

    @And("I Verify the text You added Overnight Duffle to your shopping cart")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        String actualSuccessMessage = new GearPage().verifyShoppingCart();
        Assert.assertEquals(actualSuccessMessage, "You added Overnight Duffle to your shopping cart.", "Wronge Product");
    }

    @And("I Click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new GearPage().clickOnShoppingCart();
    }

    @And("I Verify the product name ‘Overnight Duffle’")
    public void iVerifyTheProductNameOvernightDuffle() {
        String actualProductNameAfterAddInToCart = new GearPage().verifyProductName();
        Assert.assertEquals(actualProductNameAfterAddInToCart, "Overnight Duffle", "Wrong message");
    }

    @And("I Verify the Qty is ‘{int}’")
    public void iVerifyTheQtyIs(int arg0) {
    }

    @And("I Change Qty of bag to five")
    public void iChangeQtyOfBagToFive() {
        new GearPage().changeQuantity();
    }

    @And("I Click on ‘Update Shopping Cart’ button")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().clickOnUpdateButton();
    }

    @Then("I  Verify the product price")
    public void iVerifyTheProductPrice() {
        String actualPriceAfter=new GearPage().verifyProductPrice();
        Assert.assertEquals(actualPriceAfter,"$225.00","Wrong price");
    }
}
