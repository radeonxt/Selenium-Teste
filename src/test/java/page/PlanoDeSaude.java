package page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlanoDeSaude extends Utils {

	private WebDriver driver;
	private static final String url = "https://cliente.qualicorp.com.br/#/login";
	private static final String cpf = "147.755.587-06";
	private static final String senha = "Atp135794";
	private Boolean deveProsseguir;

	public PlanoDeSaude(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void GerarBoleto() {
		Boolean loginEfetuado = this.fazerLogin();

		if (loginEfetuado) {
			gerarBoleto();
		}
	}

	private Boolean fazerLogin() {
		driver.get(url);
		PreencherInput(driver,
				new Seletores(null, null, "//*[@id=\\\"app\\\"]/main/section/div/div/div/form/div[1]/input",
						"#app > main > section > div > div > div > form > div:nth-child(2) > input[type=text])", "cpf",
						null),
				cpf);

		PreencherInput(driver,
				new Seletores(null, null, "//*[@id=\\\"app\\\"]/main/section/div/div/div/form/div[2]/input",
						"#app > main > section > div > div > div > form > div:nth-child(3) > input", "password", null),
				senha);

		ClicarEmElemento(driver, new Seletores(null, "btn-login",
				"//*[@id=\"app\"]/main/section/div/div/div/form/div[3]/button",
				"document.querySelector(\"#app > main > section > div > div > div > form > div.buttons.mt-2 > button\")",
				null, null));

		deveProsseguir = aguardar(driver, 15, new Seletores("CarteirinhaMobile", null, null, null, null, null));

		return (deveProsseguir);
	}

	private void gerarBoleto() {
		ClicarEmElemento(driver, new Seletores(null, null, "//*[@id=\"app\"]/div/div[2]/div[3]/div/div[3]/a",
				"#app > div > div.container > div.pt-4.pb-5.mt-4.body--container.app-desktop > div > div:nth-child(3) > a",
				null, null));
		
		deveProsseguir = aguardar(driver, 15, new Seletores(null, null, null, "#collapseBody > div > div > button.btn.p-3.pl-5.pr-5.mt-2.mr-sm-2.mr-md-5.btn-primary", null, null));

		if (deveProsseguir) {
			List<WebElement> lista = ObterListaElementos(driver, new Seletores(null, null, null,
					"#collapseBody > div > div > button.btn.p-3.pl-5.pr-5.mt-2.mr-sm-2.mr-md-5.btn-primary > b", null, null));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//lista.forEach(e -> {
				js.executeScript("arguments[0].click();", lista.get(0));
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//});
		}
	}

}
