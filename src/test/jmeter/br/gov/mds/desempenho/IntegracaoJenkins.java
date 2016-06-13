package br.gov.mds.desempenho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntegracaoJenkins {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void testeDesempenhoTitulo(){
		driver.get("http://www.google.com.br");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
