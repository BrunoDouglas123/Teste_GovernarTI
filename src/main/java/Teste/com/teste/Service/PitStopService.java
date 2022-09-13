package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.PitStopDTO;
import Teste.com.teste.Model.PitStop;
import Teste.com.teste.Repository.PitStopRepository;

@Service
public class PitStopService {

	@Autowired
	private PitStopRepository repository;
	
	public List<PitStopDTO> findAll() {
		List<PitStop>result = repository.findAll();
		return result.stream().map(x -> new 
		PitStopDTO(x)).collect(Collectors.toList());
	}
	
	public PitStop findById(Long id) {
		Optional<PitStop> p = repository.findById(id);
		return p.get();
	}
}
