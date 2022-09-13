package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.DriverStandingDTO;
import Teste.com.teste.Model.DriverStanding;
import Teste.com.teste.Repository.DriverStandingRepository;

@Service
public class DriverStandingService {

	@Autowired
	private DriverStandingRepository repository;
	
	public List<DriverStandingDTO> findAll() {
		List<DriverStanding>result = repository.findAll();
		return result.stream().map(x -> new 
		DriverStandingDTO(x)).collect(Collectors.toList());
	}
	
	public DriverStanding findById(Long id) {
		Optional<DriverStanding> p = repository.findById(id);
		return p.get();
	}
}
