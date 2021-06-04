package com.mahendra.models;

import javax.persistence.*;
import java.util.Date;

@Table(name = "employees")
@Entity
public class Employee {

	@Id
	@Column(name = "emp_no")
	private Integer empNo;

	@Column(name = "first_name", length = 14)
	private String firstName;

	@Column(name = "last_name", length = 16)
	private String lastName;

	@Column(name="gender",length=1)
	private String gender;
	
	@Column(name="birth_date")
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(name="hire_date")
	@Temporal(TemporalType.DATE)
	private Date hireDate;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
