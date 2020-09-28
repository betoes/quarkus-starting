package org.acme.getting.started.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="endpoints")
public class Endpoint extends PanacheEntityBase {
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PROD")
    @SequenceGenerator(name="SEQ_PROD", sequenceName = "SEQ_PROD", allocationSize = 1)
    private Long endpoint_id;
	@Column
	private String author;
	@Column
	private String description;
	@Column
	private String label;
	@Column
	private String status;
	@Column
	private String url;
	
	public Long getEndpoint_id() {
		return endpoint_id;
	}
	public void setEndpoint_id(Long endpoint_id) {
		this.endpoint_id = endpoint_id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Endpoint(Long endpoint_id, String author, String description, String label, String status, String url) {
		super();
		this.endpoint_id = endpoint_id;
		this.author = author;
		this.description = description;
		this.label = label;
		this.status = status;
		this.url = url;
	}
	
	public Endpoint() {
		
	}
	
	
	
}
