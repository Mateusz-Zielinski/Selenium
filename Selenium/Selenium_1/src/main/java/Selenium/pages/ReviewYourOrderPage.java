package Selenium.pages;

import Selenium.elements.Button;
import Selenium.elements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewYourOrderPage extends BasePage{

    private By proceedToCheckoutSelector = By.xpath("//a[text()='Proceed to checkout']");
    private Button proceedToCheckoutButton;

    private By addedItemNameSelector = By.cssSelector("td[data-th='Item'] span");
    private Label addedItemNameLabel;
    private By addedItemQuantitySelector = By.cssSelector("td[data-th='Quantity'] input.quantity");
    private Label addedItemQuantityLabel;
    private By addedItemPriceSelector = By.cssSelector("td[data-th='Price']");
    private Label addedItemPriceLabel;
    private By addedItemTotalSelector = By.cssSelector("td[data-th='Total']");
    private Label addedItemTotalLabel;

    public ReviewYourOrderPage(WebDriver driver){
        super(driver);
        this.proceedToCheckoutButton = new Button(this.driver, this.proceedToCheckoutSelector);
    }

    public void clickProceedToCheckout(){
        this.proceedToCheckoutButton.click();
    }


    public boolean  isCartContentCorrect(){
        String actualName = new Label(this.driver, addedItemNameSelector).read();
        int actualQuantity = Integer.parseInt(new Label(this.driver, addedItemQuantitySelector).getValue());
        double actualPrice = Double.parseDouble(new Label(this.driver, addedItemPriceSelector).read().substring(1));
        double actualTotal = Double.parseDouble(new Label(this.driver, addedItemTotalSelector).read().substring(1));

        String expectedName = "Chic vintage DeVille";
        int expectedQuantity = 1;
        double expectedPrice = 78.00;
        double expectedTotal = expectedPrice * expectedQuantity;

        return actualName.equals(expectedName) && actualQuantity == expectedQuantity && actualPrice == expectedPrice && actualTotal == expectedTotal;
    }

}
