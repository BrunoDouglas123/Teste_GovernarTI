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

import Teste.com.teste.Model.Status;
import Teste.com.teste.Repository.StatusRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class StatusTest {
	
	@Mock
	@Autowired
	private StatusRepository statitory;
	
	@Test
	@DisplayName("Teste Season requisição GET")
	public void findByStatus() throws Exception {
		Status sts1 = new Status
		(1L, "Finished");
		Status sts2 = new Status
		(1L, "Finished");
		List<Status> Statuss = new ArrayList<>();
		Statuss.add(sts1);
		Statuss.add(sts2);
	}
}
