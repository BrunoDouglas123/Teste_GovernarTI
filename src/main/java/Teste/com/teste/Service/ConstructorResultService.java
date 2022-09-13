package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.ConstructorResultDTO;
import Teste.com.teste.Model.ConstructorResult;
import Teste.com.teste.Repository.ConstructorResultRepository;

@Service
public class ConstructorResultService {

	@Autowired
	private ConstructorResultRepository repository;
	
	public List<ConstructorResultDTO> findAll() {
		List<ConstructorResult>result = repository.findAll();
		return result.stream().map(x -> new 
		ConstructorResultDTO(x)).collect(Collectors.toList());
	}
	
	public ConstructorResult findById(Long id) {
		Optional<ConstructorResult> p = repository.findById(id);
		return p.get();
	}
}
