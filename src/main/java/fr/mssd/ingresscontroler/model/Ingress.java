package fr.mssd.ingresscontroler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	protected String name;
	
	protected String serviceURL;
	
	protected boolean isDefault;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceURL() {
		return serviceURL;
	}

	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	
}
