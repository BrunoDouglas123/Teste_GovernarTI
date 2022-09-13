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

import Teste.com.teste.Model.Season;
import Teste.com.teste.Repository.SeasonRepository;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class SeasonTest {
	
	
	@Mock
	@Autowired
	private SeasonRepository seasitory;
	
	@Test
	@DisplayName("Teste Constructor requisição GET")
	public void findBySeason() throws Exception {
		Season sea1 = new Season
		(1L, "2009", "http://en.wikipedia.org/wiki/2009_Formula_One_season");
		Season sea2 = new Season
		(1L, "2009", "http://en.wikipedia.org/wiki/2009_Formula_One_season");
		List<Season> Seasons = new ArrayList<>();
		Seasons.add(sea1);
		Seasons.add(sea2);
	}
}
