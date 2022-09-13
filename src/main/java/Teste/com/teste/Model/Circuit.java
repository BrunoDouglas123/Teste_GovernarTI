package Teste.com.teste.Model;

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
@Table(name = "circuit")
public class Circuit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "circuitref", length = 45, nullable = false)
	private String circuitref;
	
	@Column(name = "name", length = 45, nullable = false)
	private String name;
	
	@Column(name = "location", length = 45, nullable = false)
	private String location;
	
	@Column(name = "country", length = 45, nullable = false)
	private String country;
	
	@Column(name = "lat_int_alt", length = 45, nullable = false)
	private String lat_int_alt;
	
	@Column(name = "url", length = 90, nullable = false)
	private String url;

	@JsonIgnore
	@OneToMany(mappedBy = "circuit")
	private List<Race> racers = new ArrayList<>();
	
	public Circuit() {		
	}

	public Circuit(Long id, String circuitref, String name, String location, String country, String lat_int_alt,
			String url) {
		this.id = id;
		this.circuitref = circuitref;
		this.name = name;
		this.location = location;
		this.country = country;
		this.lat_int_alt = lat_int_alt;
		this.url = url;
	}

	public Circuit(String string) {
		// TODO Auto-generated constructor stub
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

	public Circuit statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Race> getDrivers() {
		return racers;
	}
}
