package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Season;
import Teste.com.teste.Model.Status;

@Repository
public interface StatusRepository extends JpaRepository <Status, Long> {

	void save(Season sts);

}
