package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.DriverDTO;
import Teste.com.teste.Model.Driver;
import Teste.com.teste.Repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository repository;
	
	public List<DriverDTO> findAll() {
		List<Driver> result = repository.findAll();
		return result.stream().map(x -> new
		DriverDTO(x)).collect(Collectors.toList());
	}
	
	public Driver findById(Long id) {
		Optional<Driver> v = repository.findById(id);
		return v.get();
	}
	
	public Driver findByNationality(String nationality) {
		Optional<Driver> v = repository.findByNationality(nationality);
		return v.get();
	}
	
	public Driver save(Driver Driver) {
		Driver v = repository.save(Driver);
		return v;
	}
	
	@Transactional
	public Driver update(Long id,Driver Driver) {
		Driver v = repository.getById(id);
		v.setId(id); 
		v.setDriverref(Driver.getDriverref());
		v.setNumber(Driver.getNumber());
		v.setCode(Driver.getCode());
		v.setForename(Driver.getForename());
		v.setSurname(Driver.getSurname());
		v.setDob(Driver.getDob());
		v.setNationality(Driver.getNationality());
		v.setUrl(Driver.getUrl());
		Driver vendpt = repository.save(v);
		return vendpt;
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
