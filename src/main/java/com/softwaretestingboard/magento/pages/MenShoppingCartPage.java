package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenShoppingCartPage.class.getName());

    public MenShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath ="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextHeading;
    public String verifyTextHeading()
    {
        return getTextFromElement(verifyTextHeading);
    }


    // Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCartLink;
    public void clickOnShoppingCartLink()
    {
        clickOnElement(clickOnShoppingCartLink);
        log.info( "Click on shopping cart link"+clickOnShoppingCartLink.toString());
    }

    // Verify the text ‘Shopping Cart.'
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement verifyShoppingCartText;
    public String verifyShoppingCartText()
    {
        return getTextFromElement(verifyShoppingCartText);
    }


    // Verify the product name ‘Cronus Yoga Pant’
    @CacheLookup
    @FindBy(xpath ="//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyProductNameCronus;
    public String verifyProductNameCronus()
    {
        String message = getTextFromElement(verifyProductNameCronus);
        log.info("Getting text from : " + verifyProductNameCronus.toString());
        return message;

    }
    // Verify the product size ‘32’
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'32')]")
    WebElement verifySizeOfProduct;
    public String verifySizeOfProduct()
    {
        String message = getTextFromElement(verifySizeOfProduct);
        log.info("Getting text from : " + verifySizeOfProduct.toString());
        return message;

    }


    // Verify the product colour ‘Black’
    @CacheLookup
    @FindBy(xpath ="//dd[contains(text(),'Black')]")
    WebElement verifycolorOfProduct;
    public String verifycolorOfProduct()
    {
        return getTextFromElement(verifycolorOfProduct);
    }
}
