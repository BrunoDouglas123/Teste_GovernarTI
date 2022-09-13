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
@Table(name = "status")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "status", length = 45, nullable = false)
	private String status;
	
	@JsonIgnore
	@OneToMany(mappedBy = "status")
	private List<Result> results = new ArrayList<>();
	
	public Status() {		
	}

	public Status(Long id, String status) {
		this.id = id;
		this.status = status;
	}

	public Status(long l, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Status(String string) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Status statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Result> getResults() {
		return results;
	}
}
