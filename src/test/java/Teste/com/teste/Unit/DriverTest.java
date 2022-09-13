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

import Teste.com.teste.Model.Driver;
import Teste.com.teste.Repository.DriverRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class DriverTest {
	
	@Mock
	@Autowired
	private DriverRepository drivitory;

	@Test
	@DisplayName("Teste Driver requisição GET")
	public void findByDriver() throws Exception {
		Driver Driver1 = new Driver
		(1L, "sato", "3", "SAT", "Takuma", "Sato", "1981-07-29", "Japanese", "http://en.wikipedia.org/wiki/");
		Driver Driver2 = new Driver
		(1L, "sato", "3", "SAT", "Takuma", "Sato", "1981-07-29", "Japanese", "http://en.wikipedia.org/wiki/");
		List<Driver> Drivers = new ArrayList<>();
		Drivers.add(Driver1);
		Drivers.add(Driver2);
	}
}
