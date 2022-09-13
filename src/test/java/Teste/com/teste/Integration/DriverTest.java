package Teste.com.teste.Integration;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import Teste.com.teste.Controller.DriverController;
import Teste.com.teste.Model.Driver;
import Teste.com.teste.Repository.DriverRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class DriverTest {
	
	@Autowired
    @SuppressWarnings("unused")
	private MockMvc mockMvc;
	
	@Mock
	@Autowired
	private DriverRepository drivitory;
	
	@Autowired
	private DriverController drivercontroller;
	
	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(drivercontroller).build();
	}

	@Test
    @Order(1) @RepeatedTest(1)
    @SuppressWarnings("unused")
    @DisplayName("Teste de Sucesso de Requisição, e retorno HTTP 201")
    public void shouldReturn201_WhenRegisteringDriver() throws Exception {
		Driver drv = new Driver("{ \"driverref\": \"hamilton\" }")
    	.statusCode(HttpStatus.CREATED.value());
    }
		
	@Test
    @Order(2) @RepeatedTest(1)
    @SuppressWarnings("unused")
    @DisplayName("Teste Falha de Requisição, e retorno HTTP 500")
    public void shouldReturn500_WhenFailedRegisteringDriver() throws Exception {
		Driver drv = new Driver("{ \"driverref\": \"hamilton\" }")
    	.statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
	
	@Test
    @Order(3) @RepeatedTest(1)
    @SuppressWarnings("unused")
    @DisplayName("Teste Falha Busca de Resultado, e retorno HTTP 404")
    public void shouldReturn404_WhenCallNotFoundDriver() throws Exception {
		Driver ct = new Driver("{ \"driverref\": \"hamilton\" }")
    	.statusCode(HttpStatus.NOT_FOUND.value());
    }
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("Only run once after all tests");
	}
	
    @AfterEach
    public void cleanUpEach() {
    	System.out.println("Apparently all tests worked");
    }
}
