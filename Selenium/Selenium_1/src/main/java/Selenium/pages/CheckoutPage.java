package Selenium.pages;

import Selenium.elements.Select;
import Selenium.elements.TextInput;
import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{

    private By firstnameInputSelector = By.cssSelector("[name='customer.billing.firstName']");
    private TextInput firstnameInput;

    private By lastnameInputSelector = By.cssSelector("[name='customer.billing.lastName']");
    private TextInput lastnameInput;

    private By streetAddressSlector = By.cssSelector("[name='customer.billing.address']");
    private TextInput streetAddressInput;

    private By citySlector = By.cssSelector("[name='customer.billing.city']");
    private TextInput cityInput;

    private By countrySelectSelector = By.cssSelector("[name='customer.billing.country']");
    private Select countrySelect;






    private By emailInputSelector = By.cssSelector("[name='customer.emailAddress']");
    private TextInput emailInput
}
