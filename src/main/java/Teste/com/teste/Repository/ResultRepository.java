package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.Result;

@Repository
public interface ResultRepository extends JpaRepository <Result, Long> {

}
