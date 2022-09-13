package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.RaceDTO;
import Teste.com.teste.Model.Race;
import Teste.com.teste.Service.RaceService;

@RestController
@RequestMapping(value = "/races")
public class RaceController {

	@Autowired
	private RaceService service;
	
	@GetMapping
	public ResponseEntity<List<RaceDTO>> findAll() {
		System.out.println("List of Races:");
		List<RaceDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<RaceDTO> findById(@PathVariable Long id) {
		System.out.println("Race: " + id);
		RaceDTO p = new RaceDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
	
	@PostMapping
	public ResponseEntity<RaceDTO> save(@RequestBody Race Race) {
		System.out.println("New Race Saved Sucessfully.");
		RaceDTO p = new RaceDTO(service.save(Race));
		return ResponseEntity.ok(p);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Race> update(@PathVariable Long id,@RequestBody Race Race) {
		System.out.println("Race Updated Sucessfully.");
		return ResponseEntity.ok(service.update(id, Race));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		System.out.println("Race Deleted Sucessfully.");
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
