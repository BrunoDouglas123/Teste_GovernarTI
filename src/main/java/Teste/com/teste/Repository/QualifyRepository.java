package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Qualify;

@Repository
public interface QualifyRepository extends JpaRepository <Qualify, Long> {

}
