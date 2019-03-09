package Selenium.tests;

import Selenium.pages.HandbagCataloguePage;
import Selenium.pages.MainPage;
import Selenium.pages.PurchaseSelectorsBy;
import Selenium.pages.ReviewYourOrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandbageCataloguePageTest {

    private WebDriver driver;
    private MainPage mainPage;


    @Before
    public void startBrowser(){
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
    }

    @After
    public void closeBrowser(){
        mainPage.close();
    }

    @Test
    public void purchase(){
        mainPage.ChooseHandbagsCategory();
        HandbagCataloguePage handbagePage = new HandbagCataloguePage(driver);
        handbagePage.addBagToCart();
        handbagePage.proceedToCheckout();
        ReviewYourOrderPage reviewYourOrder = new ReviewYourOrderPage(driver);
        reviewYourOrder.clickProceedToCheckout();

    }


}
