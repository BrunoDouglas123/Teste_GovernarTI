package Teste.com.teste.DTO;

import Teste.com.teste.Model.Season;

public class SeasonDTO {
	
	private Long id;
	private int year;
	private String url;
	
	public SeasonDTO() {		
	}

	public SeasonDTO(Season entity) {
		this.id = entity.getId();
		this.year = entity.getYear();
		this.url = entity.getUrl();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
