package test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import page.PlanoDeSaude;

public class TestePlanoDeSaude extends TesteBasico {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inicializarDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//finalizarDriver();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		PlanoDeSaude plano = new PlanoDeSaude(driver);
		plano.GerarBoleto();
	}

}
