package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.ConstructorResult;

@Repository
public interface ConstructorResultRepository extends JpaRepository <ConstructorResult, Long> {

}
