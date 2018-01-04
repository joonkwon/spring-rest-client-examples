package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ExpirationDate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8518983643888335049L;
	
	private String date;
	private Integer timezoneType;
	private String timezone;
	private Map<String, Object> additionalProperties = new HashMap<>();
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getTimezoneType() {
		return timezoneType;
	}
	public void setTimezoneType(Integer timezoneType) {
		this.timezoneType = timezoneType;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
