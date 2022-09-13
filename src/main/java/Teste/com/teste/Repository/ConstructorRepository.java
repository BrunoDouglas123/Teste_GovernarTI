package Teste.com.teste.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Constructor;

@Repository
public interface ConstructorRepository extends JpaRepository <Constructor, Long> {

	Optional<Constructor> findByNationality(String nationality);

}
