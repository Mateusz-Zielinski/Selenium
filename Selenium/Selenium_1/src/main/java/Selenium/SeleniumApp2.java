package Selenium;

import Selenium.elements.Button;
import Selenium.elements.Select;
import Selenium.elements.Label;
import Selenium.elements.TextInput;
import Selenium.pages.PurchaseSelectorsBy;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumApp2
{

    private WebDriver driver;
    private PurchaseSelectorsBy inventoryOfElement;

    @Before
    public void startBrowser(){
        inventoryOfElement = new PurchaseSelectorsBy();
        String url = "http://demo.shopizer.com:8080/shop/";
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        JavascriptExecutor runner = (JavascriptExecutor) driver;
        wait.until((ExpectedCondition<Boolean>) driver -> (runner.executeScript("return document.readyState").equals("complete")));
    }


    @After
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void purchase(){
        Button handbagMenu = new Button(driver, inventoryOfElement.getHandbagsLink());
        handbagMenu.click();

        Button bag = new Button(driver, inventoryOfElement.getChicVinategDeVillleBag());
        bag.click();

        Button cart = new Button(driver, inventoryOfElement.getCartLink());
        cart.safeClick();


        Button checkout = new Button(driver, inventoryOfElement.getCheckoutButton());
        checkout.clickWithJs();

        Button proceedToCheckout = new Button(driver, inventoryOfElement.getProceedToCheckoutButton());
        proceedToCheckout.click();

        TextInput firstname = new TextInput(driver, inventoryOfElement.getFirstnameInput());
        firstname.type("Auto");

        TextInput lastname = new TextInput(driver, inventoryOfElement.getLastnameInput());
        lastname.type("Test");

        TextInput street = new TextInput(driver, inventoryOfElement.getStreetAddressInput());
        street.type("123 Street");

        TextInput city = new TextInput(driver, inventoryOfElement.getCityInput());
        city.clearAndSendKeys("Oslo");

        Select country = new Select(driver, inventoryOfElement.getCountrySelect());
        country.choose("Brazil");

        TextInput state = new TextInput(driver, inventoryOfElement.getStateInput());
        state.type("North Cumberland");

        TextInput postalCode = new TextInput(driver, inventoryOfElement.getPostalCodeInput());
        postalCode.type("AB123TL");

        TextInput email = new TextInput(driver, inventoryOfElement.getEmailInput());
        email.type("example@example.com");

        TextInput phone = new TextInput(driver, inventoryOfElement.getPhoneInput());
        phone.type("123465789");

        Button submit = new Button(driver, inventoryOfElement.getSubmitOrderButton());
        submit.clickWithJs();

        Label confirmation = new Label(driver, inventoryOfElement.getConfirmationLabel());
        Assert.assertEquals(confirmation.read(), "Order completed");
    }
}
