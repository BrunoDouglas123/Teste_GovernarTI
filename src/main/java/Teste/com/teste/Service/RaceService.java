package Teste.com.teste.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Teste.com.teste.DTO.RaceDTO;
import Teste.com.teste.Model.Circuit;
import Teste.com.teste.Model.Race;
import Teste.com.teste.Repository.CircuitRepository;
import Teste.com.teste.Repository.RaceRepository;

@Service
public class RaceService {

	@Autowired
	private RaceRepository racitory;
	
	@Autowired
	private CircuitRepository circuititory;
	
	public List<RaceDTO> findAll() {
		List<Race>result = racitory.findAll();
		return result.stream().map(x -> new 
		RaceDTO(x)).collect(Collectors.toList());
	}
	
	public Race findById(Long id) {
		Optional<Race> p = racitory.findById(id);
		return p.get();
	}
	
	public Race save(Race Race) {
		Circuit Circuit = circuititory.findById
		(Race.getCircuit().getId()).get();
		Race.setCircuit(Circuit);
		Race v = racitory.save(Race);
		return v;
	}
	
	@Transactional
	public Race update(Long id,Race Race) {
		Race p = racitory.getById(id);
		p.setId(id);
		p.setYear(Race.getYear());
		p.setRound(Race.getRound());
		p.setName(Race.getName());
		p.setDate(Race.getDate());
		p.setTime(Race.getTime());
		p.setUrl(Race.getUrl());
		p.setFp1_date(Race.getFp1_date());
		p.setFp1_time(Race.getFp1_time());
		p.setFp2_date(Race.getFp2_date());
		p.setFp2_time(Race.getFp2_time());
		p.setFp3_date(Race.getFp3_date());
		p.setFp3_time(Race.getFp3_time());
		p.setQuali_date(Race.getQuali_date());
		p.setQuali_time(Race.getQuali_time());
		p.setSprint_date(Race.getSprint_date());
		p.setSprint_time(Race.getSprint_time());
		Race prod = racitory.save(p);
		return prod;
	}
	
	public void delete(Long id) {
		racitory.deleteById(id);
	}
}
