package Teste.com.teste.DTO;

import Teste.com.teste.Model.Circuit;

public class CircuitDTO {
	
	private Long id;
	private String circuitref;
	private String name;
	private String location;
	private String country;
	private String lat_int_alt;
	private String url;
	
	public CircuitDTO()	{		
	}

	public CircuitDTO(Circuit entity) {
		this.id = entity.getId();
		this.circuitref = entity.getCircuitref();
		this.name = entity.getName();
		this.location = entity.getLocation();
		this.country = entity.getCountry();
		this.lat_int_alt = entity.getLat_int_alt();
		this.url = entity.getUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCircuitref() {
		return circuitref;
	}

	public void setCircuitref(String circuitref) {
		this.circuitref = circuitref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLat_int_alt() {
		return lat_int_alt;
	}

	public void setLat_int_alt(String lat_int_alt) {
		this.lat_int_alt = lat_int_alt;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
