package Teste.com.teste.DTO;

import java.time.LocalDate;

import Teste.com.teste.Model.Driver;

public class DriverDTO {
	
	private Long id;
	private String driverref;
	private String number;
	private String code;
	private String forename;
	private String surname;
	private LocalDate dob;
	private String nationality;
	private String url;
	
	public DriverDTO() {		
	}

	public DriverDTO(Driver entity) {
		this.id = entity.getId();
		this.driverref = entity.getDriverref();
		this.number = entity.getNumber();
		this.code = entity.getCode();
		this.forename = entity.getForename();
		this.surname = entity.getSurname();
		this.dob = entity.getDob();
		this.nationality = entity.getNationality();
		this.url = entity.getUrl();
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
}
