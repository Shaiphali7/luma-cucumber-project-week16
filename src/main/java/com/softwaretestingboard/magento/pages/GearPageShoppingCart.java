package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPageShoppingCart extends Utility
{
    private static final Logger log = LogManager.getLogger(GearPageShoppingCart.class.getName());

    public GearPageShoppingCart() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement productAddedInShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath ="//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']")

    WebElement verifyProductQuantity;
    @CacheLookup
    @FindBy(xpath ="(//span[@class='cart-price']//span)[2]")

    WebElement verifyProductPrice;
    @CacheLookup
    @FindBy(xpath ="(//input[@class='input-text qty'])[1]")

    WebElement changeQuantityInShoppingCart;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Update Shopping Cart']")

    WebElement clickOnUpdateShoppingCart;
    public String verifyShoppingCart()
    {
        String message = getTextFromElement(productAddedInShoppingCart);
        log.info("Getting text from : " + productAddedInShoppingCart.toString());
        return message;

    }
    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCartLink);
        log.info( "Click on shopping cart link"+shoppingCartLink.toString());
    }
    // Verify the product name ‘Overnight Duffle’
    public String verifyProductName()
    {
        String message = getTextFromElement(productName);
        log.info("Getting text from : " + productName.toString());
        return message;

    }
    //Verify the Qty is ‘3’
    public String verifyProductQuantity()
    {
        return getTextFromElement(verifyProductQuantity);
    }
    // Verify the product price ‘$135.00’
    public String verifyProductPrice()
    {
        return getTextFromElement(verifyProductPrice);
    }
    // Change Qty to ‘5’
    public void changeQuantity()
    {
        sendTextToElement(changeQuantityInShoppingCart,"5");
        log.info("Change quantity to " + "5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdateShoppingCart);
        log.info("Click on update Button"+clickOnUpdateShoppingCart.toString());
    }
    public String verifyProductPriceAfterUpdate()

    {
        return getTextFromElement(verifyProductPrice);
    }
}
