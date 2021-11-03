package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import page.CadastroJogos;

public class TesteExclusaoJogos extends TesteBasico {
	
	private static CadastroJogos cadastro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inicializarDriver();
		cadastro = new CadastroJogos(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		finalizarDriver();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		cadastro.excluirJogo();
		Assert.assertEquals(this.EncontrouElemento("mat-elevation-z8"), false);
	}

}
