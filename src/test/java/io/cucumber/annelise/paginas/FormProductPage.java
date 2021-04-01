package io.cucumber.annelise.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.annelise.servicos.Config;

public class FormProductPage extends Config {

    public static WebElement startDate (WebDriver browser) {
        return browser.findElement(By.cssSelector("#startdate"));
    }

    public static WebElement dropdownInsurance (WebDriver browser) {
        return browser.findElement(By.cssSelector("#insurancesum"));
    }

    public static WebElement dropdownMerit (WebDriver browser) {
        return browser.findElement(By.cssSelector("#meritrating"));
    }

    public static WebElement dropdownDamage (WebDriver browser) {
        return browser.findElement(By.cssSelector("#damageinsurance"));
    } 

    public static WebElement optionalProducts (WebDriver browser) {
        return browser.findElement(By.cssSelector("#EuroProtection"));
    }

    public static WebElement dropdownCourtesycar (WebDriver browser) {
        return browser.findElement(By.cssSelector("#courtesycar > option:nth-child(2)"));
    }

    public static WebElement productNext (WebDriver browser) {
        return browser.findElement(By.cssSelector("#nextselectpriceoption"));
    }
    
}