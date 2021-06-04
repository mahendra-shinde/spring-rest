package com.mahendra.models;

import javax.persistence.*;

@Entity
@Table(name="locations")
public class Location {
	
	
	@Id
	@SequenceGenerator(name = "s1", sequenceName = "LOCATIONS_SEQ", allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s1")
	@Column(name="location_id")
	private Integer locId;
	
	@Column(name="street_address",length = 40)
	private String streetAddress;
	
	@Column(name="postal_code",length = 12)
	private String postalCode;
	
	@Column(name="city",length = 30)
	private String city;
	
	@Column(name="state_province",length = 25)
	private String state;
	
	@Column(name="country_id",length = 2)
	private String countryId;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getLocId() {
		return locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	
	

}
