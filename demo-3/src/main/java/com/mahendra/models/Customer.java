package com.mahendra.models;

import java.io.Serializable;

import javax.persistence.*;

@Table(name="customers")
@Entity /// Entity is Class mapped to database table
public class Customer implements Serializable {
	
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	
	@Column(name="name",length=25)
	private String name;
	
	@Column(name="phone",length=10)
	private String phone;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
		
}
