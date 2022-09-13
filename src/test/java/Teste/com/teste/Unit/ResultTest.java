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

import Teste.com.teste.Model.Result;
import Teste.com.teste.Repository.ResultRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ResultTest {
	
	@Mock
	@Autowired
	private ResultRepository resultitory;
	
	@Test
	@DisplayName("Teste Result requisição GET")
	public void findByResult() throws Exception {
		Result rst1 = new Result
		(1L, "9","18,9","2,4","2","N","R","9,0","47","N","N","15,9","1:28.753\",\"215.100","N");
		Result rst2 = new Result
		(1L, "9","18,9","2,4","2","N","R","9,0","47","N","N","15,9","1:28.753\",\"215.100","N");
		List<Result> Result = new ArrayList<>();
		Result.add(rst1);
		Result.add(rst2);
	}
}
