package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Teste.com.teste.DTO.ResultDTO;
import Teste.com.teste.Model.Result;
import Teste.com.teste.Repository.ResultRepository;

@Service
public class ResultService {

	@Autowired
	private ResultRepository repository;
	
	public List<ResultDTO> findAll() {
		List<Result>result = repository.findAll();
		return result.stream().map(x -> new 
		ResultDTO(x)).collect(Collectors.toList());
	}
	
	public Result findById(Long id) {
		Optional<Result> p = repository.findById(id);
		return p.get();
	}
}
