package Teste.com.teste.DTO;

import Teste.com.teste.Model.Constructor;

public class ConstructorDTO {
	
	private Long id;
	private String constructorref;
	private String name;
	private String nationality;
	private String url;
	
	public ConstructorDTO() {		
	}

	public ConstructorDTO(Constructor entity) {
		this.id = entity.getId();
		this.constructorref = entity.getConstructorref();
		this.name = entity.getName();
		this.nationality = entity.getNationality();
		this.url = entity.getUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConstructorref() {
		return constructorref;
	}

	public void setConstructorref(String constructorref) {
		this.constructorref = constructorref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
