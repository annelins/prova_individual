package io.cucumber.annelise.servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {

    public static WebDriver browser;
    
    public static void open(String url){
      
      if(browser == null){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
      }
  
      browser.get(url);
      browser.manage().window().maximize();
    }

    public static void browser(String string) {
    }

    public static void fechar() {
    }
    
}