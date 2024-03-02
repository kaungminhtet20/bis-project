package net.javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
    
	@Column(name = "kpi")
	private Integer KPI;

	@Column(name = "based_salary")
	private Integer basedSalary;

	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email, Integer KPI, Integer basedSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.KPI=KPI;
		this.basedSalary=basedSalary;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getKPI() {
		return KPI;
	}
	public void setKPI(Integer KPI) {
		this.KPI = KPI;
	}
	public Integer getBasedSalary() {
		return basedSalary;
	} 
	public void setBasedSalary(Integer basedSalary) {
		this.basedSalary = basedSalary;
	}
}
