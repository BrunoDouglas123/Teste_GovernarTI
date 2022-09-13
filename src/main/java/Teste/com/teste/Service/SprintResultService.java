package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.SprintResultDTO;
import Teste.com.teste.Model.SprintResult;
import Teste.com.teste.Repository.SprintResultRepository;

@Service
public class SprintResultService {

	@Autowired
	private SprintResultRepository repository;
	
	public List<SprintResultDTO> findAll() {
		List<SprintResult>result = repository.findAll();
		return result.stream().map(x -> new 
		SprintResultDTO(x)).collect(Collectors.toList());
	}
	
	public SprintResult findById(Long id) {
		Optional<SprintResult> p = repository.findById(id);
		return p.get();
	}
}
