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
	
	protected String appCode;
	
	protected String serviceURL;
	
	protected Integer nbAccess;

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

	public Integer getNbAccess() {
		return nbAccess;
	}

	public void setNbAccess(Integer nbAccess) {
		this.nbAccess = nbAccess;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	
}
