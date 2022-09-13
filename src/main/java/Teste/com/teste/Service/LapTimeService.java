package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.LapTimeDTO;
import Teste.com.teste.Model.LapTime;
import Teste.com.teste.Repository.LapTimeRepository;

@Service
public class LapTimeService {

	@Autowired
	private LapTimeRepository repository;
	
	public List<LapTimeDTO> findAll() {
		List<LapTime>result = repository.findAll();
		return result.stream().map(x -> new 
		LapTimeDTO(x)).collect(Collectors.toList());
	}
	
	public LapTime findById(Long id) {
		Optional<LapTime> p = repository.findById(id);
		return p.get();
	}
}
