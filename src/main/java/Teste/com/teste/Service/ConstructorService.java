package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.ConstructorDTO;
import Teste.com.teste.Model.Constructor;
import Teste.com.teste.Repository.ConstructorRepository;

@Service
public class ConstructorService {
	
	@Autowired
	private ConstructorRepository repository;
	
	public List<ConstructorDTO> findAll() {
		List<Constructor> result = repository.findAll();
		return result.stream().map(x -> new
		ConstructorDTO(x)).collect(Collectors.toList());
	}
	
	public Constructor findById(Long id) {
		Optional<Constructor> v = repository.findById(id);
		return v.get();
	}
	
	public Constructor findByNationality(String Nationality) {
		Optional<Constructor> v = repository.findByNationality(Nationality);
		return v.get();
	}
	
	public Constructor save(Constructor Constructor) {
		Constructor v = repository.save(Constructor);
		return v;
	}
	
	@Transactional
	public Constructor update(Long id,Constructor Constructor) {
		Constructor v = repository.getById(id);
		v.setId(id); 
		v.setConstructorref(Constructor.getConstructorref());
		v.setName(Constructor.getName());
		v.setNationality(Constructor.getNationality());
		v.setUrl(Constructor.getUrl());
		Constructor vendpt = repository.save(v);
		return vendpt;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
