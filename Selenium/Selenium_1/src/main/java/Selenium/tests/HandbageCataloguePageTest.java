package Selenium.tests;

import Selenium.categories.CartTests;
import Selenium.categories.PurchaseTests;
import Selenium.dataModels.RegisteredUser;
import Selenium.dataModels.UserBase;
import Selenium.generators.RandomGenerator;
import Selenium.pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandbageCataloguePageTest {

    private WebDriver driver;
    private MainPage mainPage;
    private RegisteredUser imie;
    private RegisteredUser nazwisko;
    private dataModels.Address address;
    private dataModels.Address city;


    @Before
    public void startBrowser() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);

        this.address = new dataModels.Address(true);
        this.city = new dataModels.Address(true);
        this.imie = new RegisteredUser();
        this.nazwisko = new RegisteredUser();

    }

    @After
    public void closeBrowser() {
        mainPage.close();
    }

    @Category(PurchaseTests.class)
    @Test
    public void purchase() {
        mainPage.ChooseHandbagsCategory();
        HandbagCataloguePage handbagePage = new HandbagCataloguePage(driver);
        handbagePage.addBagToCart();
        handbagePage.proceedToCheckout();
        ReviewYourOrderPage reviewYourOrder = new ReviewYourOrderPage(driver);
        reviewYourOrder.clickProceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.basicInfo(address, city, imie, nazwisko);
        checkoutPage.state();
        checkoutPage.postalCode();
        checkoutPage.submitOrder();

        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        String status = orderConfirmationPage.GetOrderStatusInfo();

        // Weryfikacja, czy na stronie końcowej wyświetli się tekst "Order completed"
        Assert.assertEquals(status, "Order completed");
    }

    @Category(CartTests.class)
    @Test
    public void addToCart() {
        mainPage.ChooseHandbagsCategory();
        HandbagCataloguePage cataloguePage = new HandbagCataloguePage(driver);
        cataloguePage.addBagToCart();
        cataloguePage.proceedToCheckout();
        ReviewYourOrderPage reviewYourOrder = new ReviewYourOrderPage(driver);


        Assert.assertTrue(reviewYourOrder.isCartContentCorrect());

    }


}
