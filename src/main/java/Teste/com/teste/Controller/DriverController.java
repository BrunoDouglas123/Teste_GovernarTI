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

import Teste.com.teste.DTO.DriverDTO;
import Teste.com.teste.Model.Driver;
import Teste.com.teste.Service.DriverService;

@RestController
@RequestMapping(value = "/drivers")
public class DriverController {
	
	@Autowired
	private DriverService service;
	
	@GetMapping
	public ResponseEntity<List<DriverDTO>> findAll() throws Exception {
		try {
			System.out.println("List of Driver:");
			List<DriverDTO> list = service.findAll();
			return ResponseEntity.ok(list);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DriverDTO> findById(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Driver: " + id);
			DriverDTO v = new DriverDTO(service.findById(id));
			return ResponseEntity.ok(v);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping("/nationality/{nationality}")
	public ResponseEntity<DriverDTO> findByNationality(@PathVariable String nationality) throws Exception {
		try {
			System.out.println("Driver: " + nationality);
			DriverDTO v = new DriverDTO(service.findByNationality(nationality));
			return ResponseEntity.ok(v);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PostMapping
	public ResponseEntity<Driver> save(@RequestBody Driver Driver) throws Exception {
		try {
			Driver save = service.save(Driver);
			System.out.println("New Driver Saved Sucessfully.");
			return new ResponseEntity<>(save, null, HttpStatus.CREATED);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Driver> update(@PathVariable Long id,@RequestBody Driver Driver) throws Exception {
		try {
			System.out.println("Driver " + id + " Updated Sucessfully.");
			return ResponseEntity.ok(service.update(id, Driver));
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Driver " + id + " Deleted Sucessfully.");
			service.delete(id);
			return ResponseEntity.ok().build();
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
}
