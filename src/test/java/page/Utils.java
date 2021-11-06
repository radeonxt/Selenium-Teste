package page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Utils {
	
	protected void ClicarEmElemento(WebDriver driver, Seletores seletores){  
		ObterElemento(driver,seletores).click();	
	}
	
	private WebElement ObterElemento(WebDriver driver, Seletores seletores) {
		WebElement objeto = null;
		
		if (seletores.getId() != null)
			objeto = driver.findElement(By.id(seletores.getId()));
		
		if ((objeto == null) && (seletores.getClassName() != null))
			objeto = driver.findElement(By.className(seletores.getClassName()));
		
		if ((objeto == null) && (seletores.getTexto() != null))
			objeto = driver.findElement(By.partialLinkText(seletores.getTexto()));
		
		if ((objeto == null) && (seletores.getName() != null))
			objeto = driver.findElement(By.name(seletores.getName()));
		
		if ((objeto == null) && (seletores.getCssSelector() != null))
			objeto = driver.findElement(By.cssSelector(seletores.getCssSelector()));
		
		if ((objeto == null) && (seletores.getXpath() != null))
			objeto = driver.findElement(By.xpath(seletores.getXpath()));
		
		return objeto;	
	}
	
	protected List<WebElement> ObterListaElementos(WebDriver driver, Seletores seletores) {
		List<WebElement> lista = null;
		
		if (seletores.getId() != null)
			lista = driver.findElements(By.id(seletores.getId()));
		
		if ((lista == null) && (seletores.getClassName() != null))
			lista = driver.findElements(By.className(seletores.getClassName()));
		
		if ((lista == null) && (seletores.getTexto() != null))
			lista = driver.findElements(By.partialLinkText(seletores.getTexto()));
		
		if ((lista == null) && (seletores.getName() != null))
			lista = driver.findElements(By.name(seletores.getName()));
		
		if ((lista == null) && (seletores.getCssSelector() != null))
			lista = driver.findElements(By.cssSelector(seletores.getCssSelector()));
		
		if ((lista == null) && (seletores.getXpath() != null))
			lista = driver.findElements(By.xpath(seletores.getXpath()));
		
		return lista;	
	}
	
	protected boolean aguardar(WebDriver driver, Integer timeout, Seletores seletores) {
		
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout))
		          .until(driver1 -> ObterElemento(driver1, seletores));
		
		return (element != null);		
	}
	

	protected void PreencherInput(WebDriver driver, Seletores seletores, String texto){	
		ObterElemento(driver,seletores).sendKeys(texto);
	}
	
}
