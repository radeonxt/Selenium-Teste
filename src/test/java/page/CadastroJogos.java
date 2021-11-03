package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroJogos {
	
	private WebDriver driver;
	
	public CadastroJogos(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void criarNovoJogo() {
		driver.get("http://localhost:4200/"); 
		ClicarEmElementoPorXPath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div");
		ClicarEmElementoPorXPath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/app-jogo-read/div/button");
		PreencherInput("#mat-input-0","Bomberman");
		PreencherInput("#mat-input-1","Aventura");
		PreencherInput("#mat-input-2","Konami");
		PreencherInput("#mat-input-3","2005");
		PreencherInput("#mat-input-4","9");
		ClicarEmElementoPorXPath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/app-jogo-create/form/div/div/button[1]");
	}
	
	public void editarJogo() {
		driver.get("http://localhost:4200/");
		ClicarEmElementoPorXPath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div");
		ClicarEmElementoPorClassName("edit");  
	}
	
	public void excluirJogo() {
		driver.get("http://localhost:4200/");
		ClicarEmElementoPorXPath("/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div");
		ClicarEmElementoPorClassName("delete");  
	}
	
	private void ClicarEmElementoPorXPath(String caminho){  
		WebElement objeto = driver.findElement(By.xpath(caminho));  
		objeto.click();	
	}
	
	private void ClicarEmElementoPorClassName(String caminho){  
		WebElement objeto = driver.findElement(By.className(caminho));  
		objeto.click();	
	}
	
	private void PreencherInput(String selector, String texto){
		WebElement objeto = driver.findElement(By.cssSelector(selector));
		objeto.sendKeys(texto);
	}

}
