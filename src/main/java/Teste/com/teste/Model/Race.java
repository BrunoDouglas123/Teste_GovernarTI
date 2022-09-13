package Teste.com.teste.Model;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "race")
public class Race {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "year", length = 5, nullable = false)
	private int year;
	
	@Column(name = "round", length = 5, nullable = false)
	private String round;
	
	@Column(name = "name", length = 45, nullable = false)
	private String name;
	
	@Column(name = "date", length = 45, nullable = false)
	private LocalDate date;
	
	@Column(name = "time", length = 45, nullable = false)
	private Time time;
	
	@Column(name = "url", length = 90, nullable = false)
	private String url;
	
	@Column(name = "fp1_date", length = 45, nullable = false)
	private String fp1_date;
	
	@Column(name = "fp1_time", length = 45, nullable = false)
	private String fp1_time;
	
	@Column(name = "fp2_date", length = 45, nullable = false)
	private String fp2_date;
	
	@Column(name = "fp2_time", length = 45, nullable = false)
	private String fp2_time;
	
	@Column(name = "fp3_date", length = 45, nullable = false)
	private String fp3_date;
	
	@Column(name = "fp3_time", length = 45, nullable = false)
	private String fp3_time;
	
	@Column(name = "quali_date", length = 45, nullable = false)
	private String quali_date;
	
	@Column(name = "quali_time", length = 45, nullable = false)
	private String quali_time;
	
	@Column(name = "sprint_date", length = 45, nullable = false)
	private String sprint_date;
	
	@Column(name = "sprint_time", length = 45, nullable = false)
	private String sprint_time;
	
	@JsonIgnore
	@OneToMany(mappedBy = "race")
	private List<Result> results = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "race")
	private List<Qualify> qualifys = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "race")
	private List<SprintResult> sprintresults = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "race")
	private List<ConstructorResult> constructorresults = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "race")
	private List<ConstructorStanding> constructorstanding = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "id_circuit")
	private Circuit circuit;
	
	public Race() {		
	}

	public Race(Long id, int year, String round, String name, LocalDate date, Time time, String url, String fp1_date,
			String fp1_time, String fp2_date, String fp2_time, String fp3_date, String fp3_time, String quali_date,
			String quali_time, String sprint_date, String sprint_time, Circuit circuit) {
		this.id = id;
		this.year = year;
		this.round = round;
		this.name = name;
		this.date = date;
		this.time = time;
		this.url = url;
		this.fp1_date = fp1_date;
		this.fp1_time = fp1_time;
		this.fp2_date = fp2_date;
		this.fp2_time = fp2_time;
		this.fp3_date = fp3_date;
		this.fp3_time = fp3_time;
		this.quali_date = quali_date;
		this.quali_time = quali_time;
		this.sprint_date = sprint_date;
		this.sprint_time = sprint_time;
		this.circuit = circuit;
	}

	public Race(long l, String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Race(String string) {
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

	public Circuit getCircuit() {
		return circuit;
	}

	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}

	public List<Result> getResults() {
		return results;
	}
	
	public List<Qualify> getQualifys() {
		return qualifys;
	}
	
	public List<SprintResult> getSprintresults() {
		return sprintresults;
	}
	
	public List<ConstructorResult> getConstructorresults() {
		return constructorresults;
	}
	
	public List<ConstructorStanding> getConstructorstanding() {
		return constructorstanding;
	}

	public Race statusCode(int value) {
		// TODO Auto-generated method stub
		return null;
	}
}
