package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.SprintResultDTO;
import Teste.com.teste.Service.SprintResultService;

@RestController
@RequestMapping(value = "/sprintrresults")
public class SprintResultController {
	
	@Autowired
	private SprintResultService service;
	
	@GetMapping
	public ResponseEntity<List<SprintResultDTO>> findAll() {
		System.out.println("List of SprintResults:");
		List<SprintResultDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SprintResultDTO> findById(@PathVariable Long id) {
		System.out.println("SprintResult: " + id);
		SprintResultDTO p = new SprintResultDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
