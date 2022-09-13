package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Circuit;

@Repository
public interface CircuitRepository extends JpaRepository <Circuit, Long> {

}
