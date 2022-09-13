package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.PitStopDTO;
import Teste.com.teste.Service.PitStopService;

@RestController
@RequestMapping(value = "/pitstops")
public class PitStopController {
	
	@Autowired
	private PitStopService service;
	
	@GetMapping
	public ResponseEntity<List<PitStopDTO>> findAll() {
		System.out.println("List of Pitstops:");
		List<PitStopDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PitStopDTO> findById(@PathVariable Long id) {
		System.out.println("PitStop:");
		PitStopDTO p = new PitStopDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
