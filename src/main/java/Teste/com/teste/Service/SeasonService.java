package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.SeasonDTO;
import Teste.com.teste.Model.Season;
import Teste.com.teste.Repository.SeasonRepository;

@Service
public class SeasonService {
	
	@Autowired
	private SeasonRepository repository;
	
	public List<SeasonDTO> findAll() {
		List<Season> result = repository.findAll();
		return result.stream().map(x -> new
		SeasonDTO(x)).collect(Collectors.toList());
	}
	
	public Season findById(Long id) {
		Optional<Season> v = repository.findById(id);
		return v.get();
	}
	
	public Season save(Season Season) {
		Season v = repository.save(Season);
		return v;
	}
	
	@Transactional
	public Season update(Long id,Season Season) {
		Season v = repository.getById(id);
		v.setId(id); 
		v.setYear(Season.getYear());
		v.setUrl(Season.getUrl());
		Season vendpt = repository.save(v);
		return vendpt;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
