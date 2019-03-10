package Selenium.pages;

import Selenium.dataModels.RegisteredUser;
import Selenium.elements.Button;
import Selenium.elements.Select;
import Selenium.elements.TextInput;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{

        public CheckoutPage(WebDriver driver) {
            super(driver);
            firstnameInput = new TextInput(driver, firstnameInputSelector);
            lastnameInput = new TextInput(driver, lastnameInputSelector);
            streetAddressInput = new TextInput(driver, streetAddressSlector);
            cityInput = new TextInput(driver, citySelector);
            countrySelectInput = new Select(driver, countrySelectSelector);
            emailInput = new TextInput(driver, emailInputSelector);
            phoneNumberInput = new TextInput(driver, phoneNumberSelector);
        }

    private By firstnameInputSelector = By.cssSelector("[name='customer.billing.firstName']");
    private TextInput firstnameInput;

    private By lastnameInputSelector = By.cssSelector("[name='customer.billing.lastName']");
    private TextInput lastnameInput;

    private By streetAddressSlector = By.cssSelector("[name='customer.billing.address']");
    private TextInput streetAddressInput;

    private By citySelector = By.cssSelector("[name='customer.billing.city']");
    private TextInput cityInput;

    private By countrySelectSelector = By.cssSelector("[name='customer.billing.country']");
    private Select countrySelectInput;

    private By emailInputSelector = By.cssSelector("[name='customer.emailAddress']");
    private TextInput emailInput;

    private By phoneNumberSelector = By.cssSelector("[name='customer.billing.phone']");
    private TextInput phoneNumberInput;


    public void state() {
        By stateSelector = By.cssSelector("[name='customer.billing.stateProvince']");
        TextInput stateInput = new TextInput(driver, stateSelector);
        stateInput.type("BlaBlaBla");
    }

    public void postalCode() {
        By postalCodeSelector = By.cssSelector("[name='customer.billing.postalCode']");
        TextInput postalCodeInput = new TextInput(driver, postalCodeSelector);
        postalCodeInput.type("78-800");
    }

    public void submitOrder(){
        By submitOrderSelector = By.id("submitOrder");
        Button sumbitOrderButton = new Button(driver, submitOrderSelector);
        sumbitOrderButton.clickWithJs();
    }

    public void basicInfo(dataModels.Address address, dataModels.Address city, RegisteredUser imie, RegisteredUser nazwisko){
        firstnameInput.type(imie.getFirstname());
        lastnameInput.type(nazwisko.getLastname());
        streetAddressInput.type(address.getStreetAddress());
        cityInput.clearAndSendKeys(address.getCity());
        countrySelectInput.choose("Brazil");
        emailInput.type("example@example.com");
        phoneNumberInput.type("123465789");
    }


}




