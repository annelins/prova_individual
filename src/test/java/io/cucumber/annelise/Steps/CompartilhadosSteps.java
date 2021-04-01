package io.cucumber.annelise.Steps;
 
import io.cucumber.annelise.servicos.Config;
import io.cucumber.java.pt.Dado;

public class CompartilhadosSteps extends Config {

    @Dado("que eu estou no site")
    public void que_eu_estou_no_site_da_Tricentis() {
     Config.open("http://sampleapp.tricentis.com/101/app.php");
    }
}