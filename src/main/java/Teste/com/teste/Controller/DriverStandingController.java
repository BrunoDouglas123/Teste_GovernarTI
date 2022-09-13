package Teste.com.teste.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Teste.com.teste.DTO.DriverStandingDTO;
import Teste.com.teste.Service.DriverStandingService;

@RestController
@RequestMapping(value = "/driverStandings")
public class DriverStandingController {
	
	@Autowired
	private DriverStandingService service;
	
	@GetMapping
	public ResponseEntity<List<DriverStandingDTO>> findAll() {
		System.out.println("List of DriverStandings:");
		List<DriverStandingDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DriverStandingDTO> findById(@PathVariable Long id) {
		System.out.println("DriverStanding:");
		DriverStandingDTO p = new DriverStandingDTO(service.findById(id));
		return ResponseEntity.ok(p);
	}
}
