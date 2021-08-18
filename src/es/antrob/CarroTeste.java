package es.antrob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroTeste {
	private Carro herbie;
	
	@BeforeEach
	void setUp() throws Exception {
		herbie = new Carro();
	}

	@Test
	void testarConstrucaoCarro() {
		//fail("Not yet implemented");
		
		//carroTeste.getCapacidadeDeposito() == 40.0
		assertEquals(40.0, herbie.getCapacidadeDeposito(), "A capacidade do depósito deve ser igual a 40.0");
		
		//carroTeste.getQuantidadeCombustivel() == 0
		assertEquals(0, herbie.getQuantidadeCombustivel(), "A quantidade de combustível deve ser igual a 0");
	}

}