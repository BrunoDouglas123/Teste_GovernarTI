package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.ConstructorResultDTO;
import Teste.com.teste.Service.ConstructorResultService;

@RestController
@RequestMapping(value = "/constructorresults")
public class ConstructorResultController {
	
	@Autowired
	private ConstructorResultService service;
	
	@GetMapping
	public ResponseEntity<List<ConstructorResultDTO>> findAll() {
		System.out.println("List of ConstructorStandings:");
		List<ConstructorResultDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ConstructorResultDTO> findById(@PathVariable Long id) {
		System.out.println("ConstructorStanding:");
		ConstructorResultDTO p = new ConstructorResultDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
