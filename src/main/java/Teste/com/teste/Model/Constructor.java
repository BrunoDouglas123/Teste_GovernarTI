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
@Table(name = "constructor")
public class Constructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "constructorref", length = 45, nullable = false)
	private String constructorref;
	
	@Column(name = "name", length = 45, nullable = false)
	private String name;
	
	@Column(name = "nationality", length = 45, nullable = false)
	private String nationality;
	
	@Column(name = "url", length = 90, nullable = false)
	private String url;
	
	@JsonIgnore
	@OneToMany(mappedBy = "constructor")
	private List<Result> results = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "constructor")
	private List<Qualify> qualifys = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "constructor")
	private List<ConstructorResult> constructorresult = new ArrayList<>();
	
	public Constructor() {		
	}

	public Constructor(Long id, String constructorref, String name, String nationality, String url, String string, String string2, String string3, String string4) {
		this.id = id;
		this.constructorref = constructorref;
		this.name = name;
		this.nationality = nationality;
		this.url = url;
	}

	public Constructor(String string) {
		// TODO Auto-generated constructor stub
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

	public Constructor statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Result> getResults() {
		return results;
	}

	public List<Qualify> getQualifys() {
		return qualifys;
	}

	public List<ConstructorResult> getConstructorresult() {
		return constructorresult;
	}
}
