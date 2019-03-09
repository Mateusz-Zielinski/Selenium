package Selenium.pages;

import Selenium.elements.Label;
import Selenium.elements.Select;
import Selenium.elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends BasePage{

    private By confirmationLabelSelector = By.cssSelector("#main-content h1");
    private Label confirmationLabel;


    public OrderConfirmationPage(WebDriver driver){
        super(driver);
        this.url = "http://demo.shopizer.com:8080/shop/order/confirmation.html";
        this.confirmationLabel = new Label(this.driver, this.confirmationLabelSelector);
    }

    public String GetOrderStatusInfo(){
        return this.confirmationLabel.read();
    }


}
