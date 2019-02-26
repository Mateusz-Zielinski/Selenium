package Selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PurchaseSelectorsBy {

    private By HandbagsLink = By.xpath("//div[contains(@class, 'mainmenu')]//a[text()='Handbags']");
    private By ChicVinategDeVillleBag = By.cssSelector("div#productsContainer div[item-name='Chic vintage DeVille'] div.store-btn-addtocart");
    private By CartLink = By.cssSelector("div#miniCartSummary span");
    private By CheckoutButton = By.cssSelector("li.checkout-bg a");
    private By ProceedToCheckoutButton = By.xpath("//a[text()='Proceed to checkout']");
    private By FirstnameInput = By.cssSelector("[name='customer.billing.firstName']");
    private By LastnameInput = By.cssSelector("[name='customer.billing.lastName']");
    private By StreetAddressInput = By.cssSelector("[name='customer.billing.address']");
    private By CityInput = By.cssSelector("[name='customer.billing.city']");
    private By StateInput = By.cssSelector("[name='customer.billing.stateProvince']");
    private By CountrySelect = By.cssSelector("[name='customer.billing.country']");
    private By ProvinceSelect = By.cssSelector("[name='customer.billing.zone']");
    private By PostalCodeInput = By.cssSelector("[name='customer.billing.postalCode']");
    private By EmailInput = By.cssSelector("[name='customer.emailAddress']");
    private By PhoneInput = By.cssSelector("[name='customer.billing.phone']");
    //private By SubmitOrderButton = By.cssSelector("submitOrder");
    private By SubmitOrderButton = By.cssSelector("#submitOrder");
    //private By SubmitOrderButton = By.xpath("//button[@id='submitOrder'])";
    private By ConfirmationLabel = By.cssSelector("#main-content h1");


    public By getHandbagsLink() {
        return HandbagsLink;
    }

    public By getChicVinategDeVillleBag() {
        return ChicVinategDeVillleBag;
    }

    public By getCartLink() {
        return CartLink;
    }

    public By getCheckoutButton() {
        return CheckoutButton;
    }

    public By getProceedToCheckoutButton() {
        return ProceedToCheckoutButton;
    }

    public By getFirstnameInput() {
        return FirstnameInput;
    }

    public By getLastnameInput() {
        return LastnameInput;
    }

    public By getStreetAddressInput() {
        return StreetAddressInput;
    }

    public By getStateInput() {
        return StateInput;
    }

    public By getCityInput() {
        return CityInput;
    }

    public By getCountrySelect() {
        return CountrySelect;
    }

    public By getPostalCodeInput() {
        return PostalCodeInput;
    }

    public By getEmailInput() {
        return EmailInput;
    }

    public By getPhoneInput() {
        return PhoneInput;
    }

    public By getSubmitOrderButton() {
        return SubmitOrderButton;
    }

    public By getConfirmationLabel() {
        return ConfirmationLabel;
    }

    public By getProvinceSelect() { return ProvinceSelect; }

}