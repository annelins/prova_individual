package io.cucumber.annelise.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.annelise.servicos.Config;

public class FormVehiclePage extends Config {

    public static WebElement dropdownMake (WebDriver browser) {
        return browser.findElement(By.cssSelector("#make"));
    }

    public static WebElement enginePerformance (WebDriver browser) {
        return browser.findElement(By.cssSelector("#engineperformance"));
    }

    public static WebElement dateManufacture(WebDriver browser) {
        return null;
    }
     public static WebElement dropdownNumberSeats (WebDriver browser) {
        return browser.findElement(By.cssSelector("select#numberofseats"));
    }

    public static WebElement dropdownFuel (WebDriver browser) {
        return browser.findElement(By.cssSelector("#fuel"));
    }

    public static WebElement price (WebDriver browser) {
        return browser.findElement(By.cssSelector("#listprice"));
    }

    public static WebElement placeNumber (WebDriver browser) {
        return browser.findElement(By.cssSelector("#licenseplatenumber"));
    }
    
    public static WebElement annualMileage (WebDriver browser) {
        return browser.findElement(By.cssSelector("#annualmileage"));
    } 

    public static WebElement next (WebDriver browser) {
        return browser.findElement(By.cssSelector(".next"));
    }

}