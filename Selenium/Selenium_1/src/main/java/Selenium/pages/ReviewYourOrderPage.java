package Selenium.pages;

import Selenium.elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewYourOrderPage extends BasePage{

    private By proceedToCheckoutSelector = By.xpath("//a[text()='Proceed to checkout']");
    private Button proceedToCheckoutButton;


    public ReviewYourOrderPage(WebDriver driver){
        super(driver);
        this.proceedToCheckoutButton = new Button(this.driver, this.proceedToCheckoutSelector);
    }

    public void clickProceedToCheckout(){
        this.proceedToCheckoutButton.click();
    }


}
