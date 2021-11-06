package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBasico {
	
	protected static WebDriver driver;
	
	protected boolean EncontrouElemento(String selector){
		WebElement objeto = driver.findElement(By.className(selector));
		return (objeto != null);
	}

	protected static void inicializarDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/alex/Documents/selenium/chromedriver");
		TesteBasico.driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	protected static void finalizarDriver() {
		driver.close();
		driver.quit();
		
	}
	
	

}
