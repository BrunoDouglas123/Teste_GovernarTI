package Teste.com.teste.Unit;

import static org.junit.jupiter.api.Assertions.*;

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

import Teste.com.teste.Model.Constructor;
import Teste.com.teste.Repository.ConstructorRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ConstructorTest {
	
	@Mock
	@Autowired
	private ConstructorRepository constrictory;
	
	@Test
	@DisplayName("Teste Constructor requisição POST")
	public void saveConstructor() throws Exception {
		Constructor ctr = new Constructor(1L, "sato", "3", "SAT", "Takuma", "Sato", "1981-07-29", "Japanese", "http://en.wikipedia.org/wiki/");
		constrictory.save(ctr);
		assertNotNull(ctr);
	}
	
	@Test
	@DisplayName("Teste Constructor requisição GET")
	public void findByConstructor() throws Exception {
		Constructor ctr1 = new Constructor
		(1L, "sato", "3", "SAT", "Takuma", "Sato", "1981-07-29", "Japanese", "http://en.wikipedia.org/wiki/");
		Constructor ctr2 = new Constructor
		(1L, "sato", "3", "SAT", "Takuma", "Sato", "1981-07-29", "Japanese", "http://en.wikipedia.org/wiki/");
		List<Constructor> Constructors = new ArrayList<>();
		Constructors.add(ctr1);
		Constructors.add(ctr2);
	}
	
	@Test
	@DisplayName("Teste Constructor requisição UPDATE")
	public void updateConstructor() throws Exception {
		String constructorref = "sato";
		Constructor Constructor = new Constructor(1L, "sato", "3", "SAT", "Takuma", "Sato", "1981-07-29", "Japanese", "http://en.wikipedia.org/wiki/");
		constrictory.save(Constructor);
		Constructor constructor = constrictory.findById(1L).get();
		constructor.setConstructorref(constructorref);
		Constructor cir = constrictory.save(constructor);
		assertEquals(cir.getConstructorref(),constructorref);
	}
}
