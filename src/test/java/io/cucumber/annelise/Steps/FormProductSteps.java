package io.cucumber.annelise.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.annelise.paginas.FormProductPage;
import io.cucumber.annelise.servicos.Config;
import io.cucumber.java.pt.*;


public class FormProductSteps extends Config {

    @Dado("digito uma Start Date {string}")
    public void digito_uma_Start_Date(String string) {
 	FormProductPage.startDate(browser).sendKeys(string);
    }
    
    public static WebElement startDate (WebDriver browser) {
		return null;
    }

    @E("seleciono um Insurance Sum")
    public void seleciono_um_Insurance_Sum() {
    FormProductPage.dropdownInsurance(browser).click();
    }

    @E("escolho uma Merit Rating")
    public void escolho_uma_Merit_Rating() {
        FormProductPage.dropdownMerit(browser).click();
    }
    
    @E("escolho uma Damage Insurance")
    public void escolho_uma_Damage_Insurance() {
    FormProductPage.dropdownDamage(browser).click();
    }
    
    @E("seleciono um Optional Products")
    public void seleciono_um_Optional_Products() {
        WebElement element = FormProductPage.optionalProducts(browser);
		Actions products = new Actions(browser);
		products.moveToElement(element).click().perform();
    }
    
    @E("seleciono uma Courtesy Car")
    public void seleciono_uma_Courtesy_Car() {
    FormProductPage.dropdownCourtesycar(browser).click();
    }  
    
  @Entao("clico next Product")
    public void clico_next_Product() throws InterruptedException {
      FormProductPage.productNext(browser).click();  
      Thread.sleep(2000);
        
    }
}