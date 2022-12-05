package com.tutoria1.demo.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "Phone")
public class Phone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2172998418388933285L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numero;
	private String citycode;
	private String countrycode;
	
	public Phone(Long id, String numero, String citycode, String countrycode) {
		super();
		this.id = id;
		this.numero = numero;
		this.citycode = citycode;
		this.countrycode = countrycode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	
	
	
}
