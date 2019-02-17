package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumApp
{
    public static void main( String[] args )
    {
        PurchaseSelectors selectors = new PurchaseSelectors();


        // Otwarcie przeglądarki ze stroną internetową
        String url = "http://demo.shopizer.com:8080/shop/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize(); //Maksymalizuj przeglądarkę
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Kliknięcie Handbags
        WebElement handbagMenu = driver.findElement(By.xpath(selectors.getHandbagsLink()));
        handbagMenu.click();

        // Kliknięcie Add to card gdzie nazwa torebki to Chic vintage DeVille
        WebElement chicVinategDeVillleBag = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selectors.getChicVinategDeVillleBag())));
        chicVinategDeVillleBag.click();

        // Najechanie na ShopingCart
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(selectors.getCartLink()))));
        Actions cartActionSequence = new Actions(driver);
        cartActionSequence.moveToElement(cartLink).build().perform();


        // Kliknięcie Checkout
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selectors.getCheckoutButton())));
        Actions checkoutButtonclic = new Actions(driver);
        checkoutButtonclic.moveToElement(checkoutButton).build().perform();
        checkoutButtonclic.moveToElement(checkoutButton).build().perform();
        checkoutButton.click();


        // Kliknięcie Proceed To Checkout
        WebElement proceedToCheckout = wait.until(ExpectedConditions.elementToBeClickable((By.xpath(selectors.getProceedToCheckoutButton()))));
        Actions clickProceedToCheckout = new Actions(driver);
        clickProceedToCheckout.moveToElement(proceedToCheckout).build().perform();
        proceedToCheckout.click();


        // Znalezienie i wpisanie First Name
        WebElement firstNameIsRequired = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(selectors.getFirstnameInput()))));
        firstNameIsRequired.sendKeys("Przykladowe IMIE");

        // Znalezienie i wpisanie Last Name
        WebElement lastNameIsRequired = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(selectors.getLastnameInput()))));
        lastNameIsRequired.sendKeys("Przykladowe NAZWISKO");


        // TO DO !! //

        // Wybranie kraju
        Select customerBillingCountry = new Select(wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(selectors.getCountrySelect())))));
        customerBillingCountry.selectByVisibleText("France");



    }
}
