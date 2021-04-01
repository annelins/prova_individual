package io.cucumber.annelise.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import io.cucumber.annelise.servicos.Config;

public class FormInsurantPage extends Config {

    public static WebElement firstName (WebDriver browser) {
        return browser.findElement(By.cssSelector("#firstname"));
    }

    public static WebElement lastName (WebDriver browser) {
        return browser.findElement(By.cssSelector("#lastname"));
    }
   
    public static WebElement dateBirth (WebDriver browser) {
        return null;
    }

    public static WebElement Gender (WebDriver browser) {
        return browser.findElement(By.cssSelector("#gendermale"));
    }

    public static WebElement streetAddress (WebDriver browser) {
        return browser.findElement(By.cssSelector("#streetaddress"));
    }

    public static WebElement dropdownCountry (WebDriver browser) {
        return browser.findElement(By.cssSelector("#country"));
    }

    public static WebElement zipCode (WebDriver browser) {
        return browser.findElement(By.cssSelector("#zipcode"));
    }

    public static WebElement city (WebDriver browser) {
        return browser.findElement(By.cssSelector("#city"));
    }

    public static WebElement dropdownOccupation (WebDriver browser) {
        return browser.findElement(By.cssSelector("#occupation"));
    }

    public static WebElement opcoesHobbies (WebDriver browser) {
        return browser.findElement(By.cssSelector("#cliffdiving"));
    }

    public static WebElement nextProduct (WebDriver browser) {
        return browser.findElement(By.cssSelector(".next"));
    }
}