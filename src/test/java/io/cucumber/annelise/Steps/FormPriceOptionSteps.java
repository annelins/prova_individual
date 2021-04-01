package io.cucumber.annelise.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.annelise.paginas.FormPricePage;
import io.cucumber.annelise.servicos.Config;
import io.cucumber.java.pt.*;



public class FormPriceOptionSteps extends Config {
    
    @Dado("escolher uma opcao")
    public void escolhe_uma_opcao() {
        WebElement element = FormPricePage.opcaoSeguro(browser);
		Actions seguro = new Actions(browser);
		seguro.moveToElement(element).click().perform();
        FormPricePage.opcaoSeguro(browser).isEnabled();
    }
    
    @Entao("clico next")
    public void clico_next() throws InterruptedException {
        Thread.sleep(2000);
        FormPricePage.priceNext(browser).click();
    }    
}