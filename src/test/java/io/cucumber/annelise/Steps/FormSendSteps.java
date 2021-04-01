package io.cucumber.annelise.Steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.annelise.paginas.FormSendPage;
import io.cucumber.annelise.servicos.Config;
import io.cucumber.java.pt.*;

public class FormSendSteps extends Config {

    @Dado("preencho email {string}")
    public void preencho_email(String string) {
        FormSendPage.email(browser).sendKeys(string);  
    }

    @E("preencho telefone {string}")
    public void preencho_telefone(String string) {
        FormSendPage.telefone(browser).sendKeys(string);  
    }

    @E("preencho usuario {string}")
    public void preencho_usuario(String string) {
        FormSendPage.usuario(browser).sendKeys(string);  
    }

    @E("preencho senha {string}")
    public void preencho_senha(String string) {
        FormSendPage.senha(browser).sendKeys(string); 
    }

    @E("preencho senha de confirmacao {string}")
    public void preencho_senha_de_confirmacao(String string) {
        FormSendPage.senhaConfirmacao(browser).sendKeys(string);  
    }

    @E("preencho a aba {string} e clico em Send")
	public void preencho_aba_clico_send(String string) {
		FormSendPage.send(browser).sendKeys(string); 
    }

    @Entao("visualizo a mensagem {string} na tela")
    public void vejo_a_mensagem_na_tela(String string) throws InterruptedException {
        Thread.sleep(1000);
		assertEquals(string, FormSendPage.sucesso(browser).getText());
        Config.fechar();
    }
}   

