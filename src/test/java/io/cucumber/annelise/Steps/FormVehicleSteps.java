package io.cucumber.annelise.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.annelise.paginas.FormVehiclePage;
import io.cucumber.annelise.servicos.Config;
import io.cucumber.java.pt.*;

public class FormVehicleSteps extends Config {

	@Dado("escolho Make")
	public void escolho_Make() {
		FormVehiclePage.dropdownMake(browser).click();
	}
	
	@E("digito Engine Performance {string}")
	public void digito_Engine_Performance(String string) {
		FormVehiclePage.enginePerformance(browser).sendKeys(string);
	}	

	@E("digito Date of Manufacture {string}")
	public void digito_Date_of_Manufacture(String string) {
		FormVehicleSteps.dateManufacture(browser).sendKeys(string);
	}
	private static WebElement dateManufacture(WebDriver browser) {
		return null;
	}

	@E("digito Number of Seats")
	public void digito_Number_of_Seats() {
		FormVehiclePage.dropdownNumberSeats(browser).click();
	}

	@E("escolho Fuel Type")
	public void seleciono_Fuel_Type() {
		FormVehiclePage.dropdownFuel(browser).click();
	}	
		
	@E("digito List Price{string}")
	public void digito_List_Price(String string) {
		FormVehiclePage.price(browser).sendKeys(string);
	}

	@E("digito Plate Number{string}")
	public void digito_Plate_Number(String string) {
		FormVehiclePage.placeNumber(browser).sendKeys(string);
	}

	@E("digito Annual Mileage {string}")
	public void digito_Annual_Mileage(String string) {
		FormVehiclePage.annualMileage(browser).sendKeys(string);
	}

	@Entao("preencho a aba {string} e clico em next")
	public void preencho_a_aba_e_clico_em_next(String string) {
	 FormVehiclePage.next(browser).sendKeys(string);
	}
}

