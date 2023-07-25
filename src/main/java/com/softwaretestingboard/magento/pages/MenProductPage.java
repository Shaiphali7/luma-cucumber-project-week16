package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenProductPage.class.getName());

    public MenProductPage() {
        PageFactory.initElements(driver, this);
    }
    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHoverToCronus;
    public void mouseHoverToCronus()
    {
        mouseHoverToElement(mouseHoverToCronus);
        log.info( "Mouse hover on Cronus product");
    }
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option text'])[1]")
    WebElement clickOnPantSize;
    public void clickOnPantSize()
    {
        mouseHoverToElementAndClick(clickOnPantSize);
        log.info( "Click on pant size"+clickOnPantSize.toString());

    }

    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option color'])[1]")
    WebElement clickOnBlackColour;
    public void clickOnBlackColour()
    {
        mouseHoverToElementAndClick(clickOnBlackColour);
        log.info("Click on Black colour"+clickOnBlackColour.toString());
    }

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath ="(//span[contains(text(),'Add to Cart')])[1]")

    WebElement mouseHoverAndClickToAddCart;
    public void mouseHoverAndClickToAddCart()
    {
        mouseHoverToElementAndClick(mouseHoverAndClickToAddCart);
        log.info( "Mouse hover and click Add Cart button");
    }



}
