package Selenium.pages;

import Selenium.elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandbagCataloguePage extends BasePage{

    private final By chicVinategDeVillleBagSelector = By.cssSelector("div#productsContainer div[item-name='Chic vintage DeVille'] div.store-btn-addtocart");
    private final By shopingCardSelector = By.cssSelector("div#miniCartSummary span");
    private final By checkoutSelector = By.cssSelector("li.checkout-bg a");


    private Button chicVinategDeVillleBagButton;
    private Button shopingCardButton;
    private Button checkoutButton;


    public HandbagCataloguePage(WebDriver driver){
        super(driver);
        this.url = "http://demo.shopizer.com:8080/shop/category/handbags.html/ref=c:1";
        this.chicVinategDeVillleBagButton = new Button(this.driver, this.chicVinategDeVillleBagSelector);
        this.shopingCardButton = new Button(this.driver, this.shopingCardSelector);
    }

    public void addBagToCart(){
        this.chicVinategDeVillleBagButton.click();
    }

    public void proceedToCheckout(){
        this.shopingCardButton.safeClick();
        this.checkoutButton = new Button(this.driver, this.checkoutSelector);
        this.checkoutButton.clickWithJs();
    }

}
