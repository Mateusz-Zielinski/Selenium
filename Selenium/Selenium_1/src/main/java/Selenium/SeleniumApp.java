package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumApp
{
    public static void main( String[] args )
    {
        PurchaseSelectors selectors = new PurchaseSelectors();

        String url = "http://demo.shopizer.com:8080/shop/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement handbagMenu = driver.findElement(By.xpath(selectors.getHandbagsLink()));
        handbagMenu.click();

        WebElement chicVinategDeVillleBag = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selectors.getChicVinategDeVillleBag())));
        chicVinategDeVillleBag.click();

        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(selectors.getCartLink()))));
        Actions cartActionSequence = new Actions(driver);
        cartActionSequence.moveToElement(cartLink).build().perform();


//        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(selectors.getCheckoutButton()))));
//        Actions cartCheckoutButton = new Actions(driver);
//        cartCheckoutButton.moveToElement(checkoutButton).click().build().perform();


//        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selectors.getCheckoutButton())));
//        checkoutButton.click();

        WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(selectors.getCheckoutButton())));
        Actions checkoutActions = new Actions(driver);
        checkoutActions.click(checkout);





    }
}
