package Teste.com.teste.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "season")
public class Season {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "year", length = 5, nullable = false)
	private int year;
	
	@Column(name = "url", length = 90, nullable = false)
	private String url;
	
	public Season() {		
	}

	public Season(Long id, int year, String url) {
		this.id = id;
		this.year = year;
		this.url = url;
	}

	public Season(long l, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Season(String string) {
		// TODO Auto-generated constructor stub
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

	public Season statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}
}
