package io.cucumber.annelise.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.annelise.servicos.Config;

public class FormSendPage extends Config {

    public static WebElement email (WebDriver browser) {
        return browser.findElement(By.cssSelector("#email"));
    }
    
    public static WebElement telefone (WebDriver browser) {
        return browser.findElement(By.cssSelector("#phone"));
    }

    public static WebElement usuario (WebDriver browser) {
        return browser.findElement(By.cssSelector("#username"));
    }

    public static WebElement senha (WebDriver browser) {
        return browser.findElement(By.cssSelector("#password"));
    }

    public static WebElement senhaConfirmacao (WebDriver browser) {
        return browser.findElement(By.cssSelector("#confirmpassword"));
    } 

    public static WebElement send (WebDriver browser) {
        return browser.findElement(By.cssSelector("#sendemail"));
    }

    public static WebElement sucesso (WebDriver browser) {
        return browser.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-icon.sa-success.animate"));
    } 

    public static WebElement ok (WebDriver browser) {
        return browser.findElement(By.cssSelector("div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button"));
    } 
}