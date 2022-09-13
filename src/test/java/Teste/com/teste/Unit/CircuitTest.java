package Teste.com.teste.Unit;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import Teste.com.teste.Model.Circuit;
import Teste.com.teste.Repository.CircuitRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class CircuitTest {
	
	@Mock
	@Autowired
	private CircuitRepository repository;
	
	@Test
	@DisplayName("Teste Circuit requisição GET")
	public void findByCircuit() throws Exception {
		Circuit Circuit1 = new Circuit
		(1L, "albert_park", "Albert Park Grand Prix Circuit", "Melbourne", "Australia", "-37.8497,144.968,10", "http://en.wikipedia.org/wiki/Melbourne_Grand_Prix_Circuit");
		Circuit Circuit2 = new Circuit
		(1L, "albert_park", "Albert Park Grand Prix Circuit", "Melbourne", "Australia", "-37.8497,144.968,10", "http://en.wikipedia.org/wiki/Melbourne_Grand_Prix_Circuit");
		List<Circuit> Circuits = new ArrayList<>();
		Circuits.add(Circuit1);
		Circuits.add(Circuit2);
	}
}
