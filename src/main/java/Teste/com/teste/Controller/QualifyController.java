package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.QualifyDTO;
import Teste.com.teste.Service.QualifyService;

@RestController
@RequestMapping(value = "/qualifys")
public class QualifyController {
	
	@Autowired
	private QualifyService service;
	
	@GetMapping
	public ResponseEntity<List<QualifyDTO>> findAll() {
		System.out.println("List of Qualifys:");
		List<QualifyDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<QualifyDTO> findById(@PathVariable Long id) {
		System.out.println("Qualify:");
		QualifyDTO p = new QualifyDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
