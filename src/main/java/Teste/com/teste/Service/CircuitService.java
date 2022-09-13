package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.CircuitDTO;
import Teste.com.teste.Model.Circuit;
import Teste.com.teste.Repository.CircuitRepository;

@Service
public class CircuitService {
	
	@Autowired
	private CircuitRepository repository;
	
	public List<CircuitDTO> findAll() {
		List<Circuit> result = repository.findAll();
		return result.stream().map(x -> new
		CircuitDTO(x)).collect(Collectors.toList());
	}
	
	public Circuit findById(Long id) {
		Optional<Circuit> v = repository.findById(id);
		return v.get();
	}
	
	public Circuit save(Circuit Circuit) {
		Circuit v = repository.save(Circuit);
		return v;
	}
	
	@Transactional
	public Circuit update(Long id,Circuit Circuit) {
		Circuit v = repository.getById(id);
		v.setId(id); 
		v.setCircuitref(Circuit.getCircuitref());
		v.setName(Circuit.getName());
		v.setLocation(Circuit.getLocation());
		v.setCountry(Circuit.getCountry());
		v.setLat_int_alt(Circuit.getCircuitref());
		v.setUrl(Circuit.getUrl());
		Circuit vendpt = repository.save(v);
		return vendpt;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
