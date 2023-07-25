package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-6']//span[text()='Gear']")

    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Bags']")
    WebElement clickOnBag;
    @CacheLookup
    @FindBy(xpath ="//ul[@id='ui-id-2']//span[text()='Men']")
    // Mouse Hover on Men Menu
    WebElement menMenu;
    public void mouseHoverOnMenMenu()
    {
        mouseHoverToElement(menMenu);
    }


    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottom;

    public void mouseHoverOnBottom()
    {
        mouseHoverToElement(mouseHoverOnBottom);
        //clickOnElement(mouseHoverOnBottom);
       // log.info( "Mouse hover on bottom");
    }

    // Click on Pants
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement mouseHoverandClickOnPants;
    public void mouseHoverAndClickOnPants()
    {
        clickOnElement(mouseHoverandClickOnPants);
        //log.info( "Mouse hover and click on product Pants"+mouseHoverandClickOnPants.toString());
    }


    // Mouse Hover on Gear Menu
    public void mouseHoverToGearMenu()
    {
        mouseHoverToElement(gearMenu);
        log.info( "Mouse hover on Gear menu");
    }
    // Click on Bags
    public void mouseHoverAndClickOnBag()
    {
        mouseHoverToElementAndClick(clickOnBag);
        log.info("Mouse hover and click on product Bags");
    }
    //For women Menu
    @CacheLookup
    @FindBy(xpath ="//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement womenMenu;
   public void mouseHoverOnWomenMenu()
   {
       mouseHoverToElement(womenMenu);
       log.info( "Mouse hover on Women menu");
   }
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenMenuTops;
   public void mouseHoverOnTops()
   {
       mouseHoverToElement(womenMenuTops);
       log.info( "Mouse hover on Tops");
   }
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")

    WebElement womenMenuJackets;
    public void mouseHoverAndClickOnJacket()
    {
        mouseHoverToElementAndClick(womenMenuJackets);
        log.info( "Mouse hover and click on product Jackets");
    }

}
