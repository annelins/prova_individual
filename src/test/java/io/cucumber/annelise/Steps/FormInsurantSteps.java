package io.cucumber.annelise.Steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.annelise.paginas.FormInsurantPage;
import io.cucumber.annelise.servicos.Config;
import io.cucumber.java.pt.*;

public class FormInsurantSteps extends Config {

    @Dado("digito First Name {string}")
    public void digito_First_Name(String string) {
        FormInsurantPage.firstName(browser).sendKeys(string);
    }

    @E("digito Last Name {string}")
    public void digito_Last_Name(String string) {
        FormInsurantPage.lastName(browser).sendKeys(string);
    }

    @E("escolho uma Date of Birth {string}")
    public void escolho_uma_Date_of_Birth(String string) {
        FormInsurantPage.dateBirth(browser).sendKeys(string);
    }
    public static WebElement dateBirth(WebDriver browser) {
        return null;
    }

    @E("seleciono uma das opcoes de Gender")
    public void seleciono_uma_das_opcoes_de_Gender() throws InterruptedException {
		WebElement element = FormInsurantPage.Gender(browser);
		Actions gender = new Actions(browser);
		gender.moveToElement(element).click().perform();
    }

    @E("digito Street Address {string}")
    public void digito_Street_Address(String string) {
        FormInsurantPage.streetAddress(browser).sendKeys(string);
    }

    @E("seleciono em Contry e clico em {string}")
	public void seleciono_em_Contry_e_clico_em(String string) {
		WebElement input = Config.browser.findElement(By.cssSelector("#country>option:nth-child(111)"));
		assertTrue(input.isDisplayed());
		input.click();    
	}
	
    @E("digito o Zip Code {string}")
    public void digito_o_zip_Code(String string) {
        FormInsurantPage.zipCode(browser).sendKeys(string);
    }

    @Dado("digito a City {string}")
    public void digito_a_City(String string) {
        FormInsurantPage.city(browser).sendKeys(string);
    }

    @E("escolho uma Occupation")
    public void escolho_uma_Occupation() {
        FormInsurantPage.dropdownOccupation(browser).click();
    }

    @E("seleciono um ou mais Hobbies")
    public void seleciono_um_ou_mais_Hobbies() {
        WebElement element = FormInsurantPage.opcoesHobbies(browser);
		Actions hobbies = new Actions(browser);
		hobbies.moveToElement(element).click().perform();
    }
    
    @Entao("clico em next para Product Data")
	public void clico_em_next_para_Product_Data() {
		WebElement input = Config.browser.findElement(By.cssSelector("#nextenterproductdata"));
		assertTrue(input.isDisplayed());
		input.click();   
    }
}