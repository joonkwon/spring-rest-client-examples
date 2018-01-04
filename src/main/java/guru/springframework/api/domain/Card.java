package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Card implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5205178820861293521L;
	
	private String type;
	private String number;
	private ExpirationDate expiration_date;
	private String iban;
	private String swift;
	private Map<String, Object> additionalProperties = new HashMap<>();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public ExpirationDate getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(ExpirationDate expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getSwift() {
		return swift;
	}
	public void setSwift(String swift) {
		this.swift = swift;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	

}
