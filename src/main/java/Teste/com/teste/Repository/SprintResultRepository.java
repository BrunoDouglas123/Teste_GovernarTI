package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.SprintResult;

@Repository
public interface SprintResultRepository extends JpaRepository <SprintResult, Long> {

}
