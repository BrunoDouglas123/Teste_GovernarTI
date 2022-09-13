package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.CircuitDTO;
import Teste.com.teste.Model.Circuit;
import Teste.com.teste.Service.CircuitService;

@RestController
@RequestMapping(value = "/circuits")
public class CircuitController {
	
	@Autowired
	private CircuitService service;
	
	@GetMapping
	public ResponseEntity<List<CircuitDTO>> findAll() throws Exception {
		try {
			System.out.println("List of Circuits:");
			List<CircuitDTO> list = service.findAll();
			return ResponseEntity.ok(list);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CircuitDTO> findById(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Circuit: " + id);
			CircuitDTO v = new CircuitDTO(service.findById(id));
			return ResponseEntity.ok(v);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PostMapping
	public ResponseEntity<Circuit> save(@RequestBody Circuit Circuit) throws Exception {
		try {
			Circuit save = service.save(Circuit);
			System.out.println("New Circuit Saved Sucessfully.");
			return new ResponseEntity<>(save, null, HttpStatus.CREATED);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Circuit> update(@PathVariable Long id,@RequestBody Circuit Circuit) throws Exception {
		try {
			System.out.println("Circuit " + id + " Updated Sucessfully.");
			return ResponseEntity.ok(service.update(id, Circuit));
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Circuit " + id + " Deleted Sucessfully.");
			service.delete(id);
			return ResponseEntity.ok().build();
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
}
