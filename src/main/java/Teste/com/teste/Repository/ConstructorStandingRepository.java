package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.ConstructorStanding;

@Repository
public interface ConstructorStandingRepository extends JpaRepository <ConstructorStanding, Long> {

}
