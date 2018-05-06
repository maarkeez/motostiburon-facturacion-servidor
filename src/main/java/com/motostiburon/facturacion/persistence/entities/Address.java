package com.motostiburon.facturacion.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String address;
	private String ZIP;
	private String city;
	private String province;
	private String country;
	
	@ManyToOne
	private Client client;
	
	private String type;
	
	public Address() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}