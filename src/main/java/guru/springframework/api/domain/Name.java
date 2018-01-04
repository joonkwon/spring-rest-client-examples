package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Name implements Serializable {
	
	private String title;
	private String first;
	private String last;
	private Map<String, Object> additionalProperties = new HashMap<>();
	
	private static final long serialVersionUID = 4002831308114223406L;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
}
