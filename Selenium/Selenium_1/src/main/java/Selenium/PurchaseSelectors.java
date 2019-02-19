package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PurchaseSelectors {

    private String HandbagsLink = "//div[contains(@class, 'mainmenu')]//a[text()='Handbags']";
    private String ChicVinategDeVillleBag = "div#productsContainer div[item-name='Chic vintage DeVille'] div.store-btn-addtocart";
    private String CartLink = "div#miniCartSummary span";
    private String CheckoutButton = "li.checkout-bg a";
    private String ProceedToCheckoutButton = "//a[text()='Proceed to checkout']";
    private String FirstnameInput = "[name='customer.billing.firstName']";
    private String LastnameInput = "[name='customer.billing.lastName']";
    private String StreetAddressInput = "[name='customer.billing.address']";
    private String CityInput = "[name='customer.billing.city']";
    private String StateInput = "[name='customer.billing.stateProvince']";
    private String CountrySelect = "[name='customer.billing.country']";
    private String PostalCodeInput = "[name='customer.billing.postalCode']";
    private String EmailInput = "[name='customer.emailAddress']";
    private String PhoneInput = "[name='customer.billing.phone']";
    private String SubmitOrderButton = "submitOrder";
    private String ConfirmationLabel = "#main-content h1";


    public String getHandbagsLink() {
        return HandbagsLink;
    }

    public String getChicVinategDeVillleBag() {
        return ChicVinategDeVillleBag;
    }

    public String getCartLink() {
        return CartLink;
    }

    public String getCheckoutButton() {
        return CheckoutButton;
    }

    public String getProceedToCheckoutButton() {
        return ProceedToCheckoutButton;
    }

    public String getFirstnameInput() {
        return FirstnameInput;
    }

    public String getLastnameInput() {
        return LastnameInput;
    }

    public String getStreetAddressInput() {
        return StreetAddressInput;
    }

    public String getStateInput() {
        return StateInput;
    }

    public String getCityInput() {
        return CityInput;
    }

    public String getCountrySelect() {
        return CountrySelect;
    }

    public String getPostalCodeInput() {
        return PostalCodeInput;
    }

    public String getEmailInput() {
        return EmailInput;
    }

    public String getPhoneInput() {
        return PhoneInput;
    }

    public String getSubmitOrderButton() {
        return SubmitOrderButton;
    }

    public String getConfirmationLabel() {
        return ConfirmationLabel;
    }

}