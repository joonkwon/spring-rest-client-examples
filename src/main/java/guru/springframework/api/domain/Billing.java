package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Billing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4448018068264532737L;
	
	private Card card;
	private Map<String, Object> additionalProperties = new HashMap<>();
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	

}
