package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class MainApp {
    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/");

        LoginPage loginPage = new LoginPage();
        loginPage.Login();
        DriverSingleton.contains(loginPage.loginText(), "Hello");
        CartPage cartPage = new CartPage();
        cartPage.cart();
        DriverSingleton.contains(cartPage.cartText(), "has been added to your cart.");
        DriverSingleton.delay(5);
        DriverSingleton.closeObjectInstance();
    }
}
