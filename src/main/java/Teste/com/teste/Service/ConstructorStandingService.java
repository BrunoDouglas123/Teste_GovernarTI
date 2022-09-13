package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.ConstructorStandingDTO;
import Teste.com.teste.Model.ConstructorStanding;
import Teste.com.teste.Repository.ConstructorStandingRepository;

@Service
public class ConstructorStandingService {

	@Autowired
	private ConstructorStandingRepository repository;
	
	public List<ConstructorStandingDTO> findAll() {
		List<ConstructorStanding>result = repository.findAll();
		return result.stream().map(x -> new 
		ConstructorStandingDTO(x)).collect(Collectors.toList());
	}
	
	public ConstructorStanding findById(Long id) {
		Optional<ConstructorStanding> p = repository.findById(id);
		return p.get();
	}
}
