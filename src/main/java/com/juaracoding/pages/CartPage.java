package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Orders")
    WebElement ordersKlik;

    @FindBy(linkText = "Browse products")
    WebElement productsKlik;

    @FindBy(linkText = "BLACK CROSS BACK MAXI DRESS")
    WebElement productOne;

    @FindBy(linkText = "CATEGORIES")
    WebElement co;

    @FindBy(id = "pa_color")
    WebElement color;

    @FindBy(id = "pa_size")
    WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addCart;

    @FindBy(className = "woocommerce-message")
    WebElement getAdd;

    public void cart(){
        ordersKlik.click();
        productsKlik.click();
        productOne.click();
        color.sendKeys("Black");
        size.sendKeys("Large");
        addCart.click();

    }
    public String cartText(){
        return getAdd.getText();
    }
}
