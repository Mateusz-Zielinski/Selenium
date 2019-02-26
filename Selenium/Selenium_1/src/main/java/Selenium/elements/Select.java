package Selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Select {
    private int timeout = 10;
    private WebElement element;
    private org.openqa.selenium.support.ui.Select select;
    private WebDriver driver;

    public Select(WebDriver driver, By by){
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(this.driver, timeout);
        element = wait.until(ExpectedConditions.elementToBeClickable((by)));
        select = new org.openqa.selenium.support.ui.Select(element);
    }

    public Select choose(String text){
        this.select.selectByVisibleText(text);
        return this;
    }

    public String read(){
        return this.select.getFirstSelectedOption().getText();
    }
}
