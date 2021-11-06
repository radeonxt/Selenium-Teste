package page;

import org.openqa.selenium.WebDriver;

public class CadastroJogos extends Utils {
	
	private WebDriver driver;
	
	public CadastroJogos(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void criarNovoJogo() {
		driver.get("http://localhost:4200/"); 
//		ClicarEmElementoPorXPath(driver,"/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div");
//		ClicarEmElementoPorXPath(driver,"/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/app-jogo-read/div/button");
//		PreencherInput(driver,"#mat-input-0","Bomberman");
//		PreencherInput(driver,"#mat-input-1","Aventura");
//		PreencherInput(driver,"#mat-input-2","Konami");
//		PreencherInput(driver,"#mat-input-3","2005");
//		PreencherInput(driver,"#mat-input-4","9");
//		ClicarEmElementoPorXPath(driver,"/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav-content/app-jogo-create/form/div/div/button[1]");
	}
	
	public void editarJogo() {
		driver.get("http://localhost:4200/");
//		ClicarEmElementoPorXPath(driver,"/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div");
//		ClicarEmElementoPorClassName(driver,"edit");  
	}
	
	public void excluirJogo() {
		driver.get("http://localhost:4200/");
//		ClicarEmElementoPorXPath(driver,"/html/body/app-root/app-nav/mat-sidenav-container/mat-sidenav/div/mat-nav-list/a[2]/div");
//		ClicarEmElementoPorClassName(driver,"delete");  
	}
	
	

}
