package Teste.com.teste.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Driver;
import Teste.com.teste.Model.Season;

@Repository
public interface DriverRepository extends JpaRepository <Driver, Long> {

	void save(Season season);

	Optional<Driver> findByNationality(String nationality);

}
