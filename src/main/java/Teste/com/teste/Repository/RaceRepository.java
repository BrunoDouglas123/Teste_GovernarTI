package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Race;

@Repository
public interface RaceRepository extends JpaRepository <Race, Long> {

}
