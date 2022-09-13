package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.ResultDTO;
import Teste.com.teste.Service.ResultService;

@RestController
@RequestMapping(value = "/results")
public class ResultController {
	
	@Autowired
	private ResultService service;
	
	@GetMapping
	public ResponseEntity<List<ResultDTO>> findAll() {
		System.out.println("List of Results:");
		List<ResultDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResultDTO> findById(@PathVariable Long id) {
		System.out.println("Result:");
		ResultDTO p = new ResultDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
