package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenProductPage;
import com.softwaretestingboard.magento.pages.MenShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenPageSteps {
    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverOnMenMenu();
    }

    @Then("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new HomePage().mouseHoverAndClickOnPants();
    }

    @And("I mouse Hover on product name Cronus Yoga Pant")
    public void iMouseHoverOnProductNameCronusYogaPant() {
        new MenProductPage().mouseHoverToCronus();
    }

    @And("I click on size {int}")
    public void iClickOnSize(int arg0) {
        new MenProductPage().clickOnPantSize();
    }

    @And("I  click on colour Black")
    public void iClickOnColourBlack() {
        new MenProductPage().clickOnBlackColour();
    }

    @And("I mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MenProductPage().mouseHoverAndClickToAddCart();
    }

    @And("I verify the text You added Cronus Yoga Pant to your shopping cart")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        String actualheadingMessage=new MenShoppingCartPage().verifyTextHeading();
        Assert.assertEquals(actualheadingMessage,"You added Cronus Yoga Pant to your shopping cart.","Wrong Message");
    }

    @And("I Click on shopping cart Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenShoppingCartPage().clickOnShoppingCartLink();
    }

    @And("I verify the text shopping Cart")
    public void iVerifyTheTextShoppingCart() {
        String actualShoppingCartText=new MenShoppingCartPage().verifyShoppingCartText();
        Assert.assertEquals(actualShoppingCartText,"Shopping Cart","Wrong heading");
    }

    @And("I verify the product name Cronus Yoga Pant")
    public void iVerifyTheProductNameCronusYogaPant() {
        String actualProductName=new MenShoppingCartPage().verifyProductNameCronus();
        Assert.assertEquals(actualProductName,"Cronus Yoga Pant","Wrong product");
    }

    @And("I verify the product size")
    public void iVerifyTheProductSize() {
        String actualProductSize=new MenShoppingCartPage().verifySizeOfProduct();
        Assert.assertEquals(actualProductSize,"32","Wrong Size");
    }

    @And("I verify the product colour Black")
    public void iVerifyTheProductColourBlack() {
        String actualProductColour= new MenShoppingCartPage().verifycolorOfProduct();
        Assert.assertEquals(actualProductColour,"Black","Wrong colour");
    }
}
