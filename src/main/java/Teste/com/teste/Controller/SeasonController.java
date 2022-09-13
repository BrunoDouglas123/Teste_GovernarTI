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

import Teste.com.teste.DTO.SeasonDTO;
import Teste.com.teste.Model.Season;
import Teste.com.teste.Service.SeasonService;

@RestController
@RequestMapping(value = "/seasons")
public class SeasonController {
	
	@Autowired
	private SeasonService service;
	
	@GetMapping
	public ResponseEntity<List<SeasonDTO>> findAll() throws Exception {
		try {
			System.out.println("List of Seasons:");
			List<SeasonDTO> list = service.findAll();
			return ResponseEntity.ok(list);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SeasonDTO> findById(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Season: " + id);
			SeasonDTO v = new SeasonDTO(service.findById(id));
			return ResponseEntity.ok(v);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PostMapping
	public ResponseEntity<Season> save(@RequestBody Season Season) throws Exception {
		try {
			Season save = service.save(Season);
			System.out.println("New Season Saved Sucessfully.");
			return new ResponseEntity<>(save, null, HttpStatus.CREATED);
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Season> update(@PathVariable Long id,@RequestBody Season Season) throws Exception {
		try {
			System.out.println("Season " + id + " Updated Sucessfully.");
			return ResponseEntity.ok(service.update(id, Season));
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) throws Exception {
		try {
			System.out.println("Season " + id + " Deleted Sucessfully.");
			service.delete(id);
			return ResponseEntity.ok().build();
		}
		catch(Exception ex) {
			throw new Exception(ex);
		}
	}
}
