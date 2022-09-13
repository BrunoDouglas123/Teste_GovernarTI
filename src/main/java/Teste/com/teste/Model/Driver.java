package Teste.com.teste.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "driver")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "driverref", length = 45, nullable = false)
	private String driverref;
	
	@Column(name = "number", length = 45, nullable = false)
	private String number;
	
	@Column(name = "code", length = 45, nullable = false)
	private String code;
	
	@Column(name = "forename", length = 45, nullable = false)
	private String forename;
	
	@Column(name = "surname", length = 90, nullable = false)
	private String surname;
	
	@Column(name = "dob", length = 90, nullable = false)
	private LocalDate dob;
	
	@Column(name = "nationality", length = 90, nullable = false)
	private String nationality;
	
	@Column(name = "url", length = 90, nullable = false)
	private String url;
	
	@JsonIgnore
	@OneToMany(mappedBy = "driver")
	private List<Result> results = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "driver")
	private List<Qualify> qualifys = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "driver")
	private List<LapTime> laptimes = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "driver")
	private List<SprintResult> sprintresult = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "driver")
	private List<DriverStanding> driverstandings = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "driver")
	private List<PitStop> pitstops = new ArrayList<>();
	
	public Driver() {		
	}

	public Driver(Long id, String driverref, String number, String code, String forename,
			String surname, LocalDate dob, String nationality, String url) {
		this.id = id;
		this.driverref = driverref;
		this.number = number;
		this.code = code;
		this.forename = forename;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.url = url;
	}

	public Driver(long l, String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
		// TODO Auto-generated constructor stub
	}

	public Driver(String string) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDriverref() {
		return driverref;
	}

	public void setDriverref(String driverref) {
		this.driverref = driverref;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Driver statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Result> getResults() {
		return results;
	}

	public List<Qualify> getQualifys() {
		return qualifys;
	}

	public List<LapTime> getLaptimes() {
		return laptimes;
	}

	public List<SprintResult> getSprintresult() {
		return sprintresult;
	}

	public void setSprintresult(List<SprintResult> sprintresult) {
		this.sprintresult = sprintresult;
	}

	public List<DriverStanding> getDriverstandings() {
		return driverstandings;
	}

	public void setDriverstandings(List<DriverStanding> driverstandings) {
		this.driverstandings = driverstandings;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public void setQualifys(List<Qualify> qualifys) {
		this.qualifys = qualifys;
	}

	public void setLaptimes(List<LapTime> laptimes) {
		this.laptimes = laptimes;
	}
	
	public void PitStops(List<PitStop> pitstops) {
		this.pitstops = pitstops;
	}
}
