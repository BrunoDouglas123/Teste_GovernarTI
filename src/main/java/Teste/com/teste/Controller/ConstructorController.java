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

import Teste.com.teste.DTO.ConstructorDTO;
import Teste.com.teste.Model.Constructor;
import Teste.com.teste.Service.ConstructorService;

@RestController
@RequestMapping(value = "/constructors")
public class ConstructorController {
	
	@Autowired
	private ConstructorService service;
	
	@GetMapping
	public ResponseEntity<List<ConstructorDTO>> findAll() throws Exception {
		try {
			System.out.println("List of Constructors:");
			List<ConstructorDTO> list = service.findAll();
			return ResponseEntity.ok(list);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ConstructorDTO> findById(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Constructor: " + id);
			ConstructorDTO v = new ConstructorDTO(service.findById(id));
			return ResponseEntity.ok(v);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PostMapping
	public ResponseEntity<Constructor> save(@RequestBody Constructor Constructor) throws Exception {
		try {
			Constructor save = service.save(Constructor);
			System.out.println("New Constructor Saved Sucessfully.");
			return new ResponseEntity<>(save, null, HttpStatus.CREATED);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Constructor> update(@PathVariable Long id,@RequestBody Constructor Constructor) throws Exception {
		try {
			System.out.println("Constructor " + id + " Updated Sucessfully.");
			return ResponseEntity.ok(service.update(id, Constructor));
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Constructor " + id + " Deleted Sucessfully.");
			service.delete(id);
			return ResponseEntity.ok().build();
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
}
