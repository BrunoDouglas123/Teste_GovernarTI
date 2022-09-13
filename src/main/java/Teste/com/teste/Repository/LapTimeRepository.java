package Teste.com.teste.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teste.com.teste.Model.LapTime;

@Repository
public interface LapTimeRepository extends JpaRepository <LapTime, Long> {

}
