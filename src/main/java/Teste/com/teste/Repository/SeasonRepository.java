package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Season;

@Repository
public interface SeasonRepository extends JpaRepository <Season, Long> {

}
