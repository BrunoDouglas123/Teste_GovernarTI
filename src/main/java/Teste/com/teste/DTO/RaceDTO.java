package Teste.com.teste.DTO;

import java.sql.Time;
import java.time.LocalDate;

import Teste.com.teste.Model.Race;

public class RaceDTO {
	
	private Long id;
	private int year;
	private String round;
	private String name;
	private LocalDate date;
	private Time time;
	private String url;
	private String fp1_date;
	private String fp1_time;
	private String fp2_date;
	private String fp2_time;
	private String fp3_date;
	private String fp3_time;
	private String quali_date;
	private String quali_time;
	private String sprint_date;
	private String sprint_time;
	
	private CircuitDTO circuit;
	
	public RaceDTO() {		
	}

	public RaceDTO(Race entity) {
		this.id = entity.getId();
		this.year = entity.getYear();
		this.round = entity.getRound();
		this.name = entity.getName();
		this.date = entity.getDate();
		this.time = entity.getTime();
		this.url = entity.getUrl();
		this.fp1_date = entity.getFp1_date();
		this.fp1_time = entity.getFp1_time();
		this.fp2_date = entity.getFp2_date();
		this.fp2_time = entity.getFp2_time();
		this.fp3_date = entity.getFp3_date();
		this.fp3_time = entity.getFp3_time();
		this.quali_date = entity.getQuali_date();
		this.quali_time = entity.getQuali_time();
		this.sprint_date = entity.getSprint_date();
		this.sprint_time = entity.getSprint_time();
		this.circuit = new CircuitDTO(entity.getCircuit());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFp1_date() {
		return fp1_date;
	}

	public void setFp1_date(String fp1_date) {
		this.fp1_date = fp1_date;
	}

	public String getFp1_time() {
		return fp1_time;
	}

	public void setFp1_time(String fp1_time) {
		this.fp1_time = fp1_time;
	}

	public String getFp2_date() {
		return fp2_date;
	}

	public void setFp2_date(String fp2_date) {
		this.fp2_date = fp2_date;
	}

	public String getFp2_time() {
		return fp2_time;
	}

	public void setFp2_time(String fp2_time) {
		this.fp2_time = fp2_time;
	}

	public String getFp3_date() {
		return fp3_date;
	}

	public void setFp3_date(String fp3_date) {
		this.fp3_date = fp3_date;
	}

	public String getFp3_time() {
		return fp3_time;
	}

	public void setFp3_time(String fp3_time) {
		this.fp3_time = fp3_time;
	}

	public String getQuali_date() {
		return quali_date;
	}

	public void setQuali_date(String quali_date) {
		this.quali_date = quali_date;
	}

	public String getQuali_time() {
		return quali_time;
	}

	public void setQuali_time(String quali_time) {
		this.quali_time = quali_time;
	}

	public String getSprint_date() {
		return sprint_date;
	}

	public void setSprint_date(String sprint_date) {
		this.sprint_date = sprint_date;
	}

	public String getSprint_time() {
		return sprint_time;
	}

	public void setSprint_time(String sprint_time) {
		this.sprint_time = sprint_time;
	}

	public CircuitDTO getCircuit() {
		return circuit;
	}

	public void setCircuit(CircuitDTO circuit) {
		this.circuit = circuit;
	}
}
