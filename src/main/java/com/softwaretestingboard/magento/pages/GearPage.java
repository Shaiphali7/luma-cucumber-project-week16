package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Overnight Duffle']")
    WebElement dufflebagProduct;
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement verifyBagName;
    @CacheLookup
    @FindBy(xpath ="//input[@id='qty']")
    WebElement changeBagQuantity;
    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement addToCart;
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
    // Click on Product Name ‘Overnight Duffle’
    public void clickOnDuffleBag()
    {
        clickOnElement(dufflebagProduct);
        log.info("Click on Overnight Duffle bag"+dufflebagProduct.toString());
    }
    // Verify the text ‘Overnight Duffle’
    public String productName()
    {
        String message = getTextFromElement(verifyBagName);
        log.info("Getting text from : " + verifyBagName.toString());
        return message;

    }
    // Change Qty 3
    public void changeQuantitytoThree()
    {
        sendTextToElement(changeBagQuantity,"3");
        log.info("Change Quantity" + "3");
    }
    // Click on ‘Add to Cart’ Button.
    public void addToCart()
    {
        clickOnElement(addToCart);
        log.info("Click on Add to Cart"+addToCart.toString());
    }
    public String verifyShoppingCart()
    {
        return getTextFromElement(productAddedInShoppingCart);
    }
    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCartLink);
        log.info("Click on shopping cart"+shoppingCartLink.toString());
    }
    // Verify the product name ‘Overnight Duffle’
    public String verifyProductName()
    {
        return getTextFromElement(productName);
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
        log.info("Change Qantity to" + "5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateButton()
    {
        clickOnElement(clickOnUpdateShoppingCart);
        log.info("Click on Update Shopping Cart"+clickOnUpdateShoppingCart.toString());
    }
    public String verifyProductPriceAfterUpdate()
    {
        String message = getTextFromElement(verifyProductPrice);
        log.info("Getting text from : " + verifyProductPrice.toString());
        return message;
    }

}
