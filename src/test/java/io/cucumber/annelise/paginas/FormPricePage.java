package io.cucumber.annelise.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.annelise.servicos.Config;

public class FormPricePage extends Config {

    public static WebElement opcaoSeguro (WebDriver browser) {
        return browser.findElement(By.cssSelector("#selectultimate"));
    }

    public static WebElement priceNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextsendquote"));
    }
    
}