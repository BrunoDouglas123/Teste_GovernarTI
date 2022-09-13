package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.LapTimeDTO;
import Teste.com.teste.Service.LapTimeService;

@RestController
@RequestMapping(value = "/laptimes")
public class LapTimeController {
	
	@Autowired
	private LapTimeService service;
	
	@GetMapping
	public ResponseEntity<List<LapTimeDTO>> findAll() {
		System.out.println("List of Laptimes:");
		List<LapTimeDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LapTimeDTO> findById(@PathVariable Long id) {
		System.out.println("LapTime:");
		LapTimeDTO p = new LapTimeDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
