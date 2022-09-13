package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.QualifyDTO;
import Teste.com.teste.Model.Qualify;
import Teste.com.teste.Repository.QualifyRepository;

@Service
public class QualifyService {

	@Autowired
	private QualifyRepository repository;
	
	public List<QualifyDTO> findAll() {
		List<Qualify>result = repository.findAll();
		return result.stream().map(x -> new 
		QualifyDTO(x)).collect(Collectors.toList());
	}
	
	public Qualify findById(Long id) {
		Optional<Qualify> p = repository.findById(id);
		return p.get();
	}
}
