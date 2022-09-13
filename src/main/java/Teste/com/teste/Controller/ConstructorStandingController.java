package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.ConstructorStandingDTO;
import Teste.com.teste.Service.ConstructorStandingService;

@RestController
@RequestMapping(value = "/constructorstandings")
public class ConstructorStandingController {
	
	@Autowired
	private ConstructorStandingService service;
	
	@GetMapping
	public ResponseEntity<List<ConstructorStandingDTO>> findAll() {
		System.out.println("List of ConstructorStandings:");
		List<ConstructorStandingDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ConstructorStandingDTO> findById(@PathVariable Long id) {
		System.out.println("ConstructorStanding:");
		ConstructorStandingDTO p = new ConstructorStandingDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
