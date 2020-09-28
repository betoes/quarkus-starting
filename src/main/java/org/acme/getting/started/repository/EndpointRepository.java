package org.acme.getting.started.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.getting.started.model.Endpoint;

import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class EndpointRepository implements PanacheRepository<Endpoint> {
	public Endpoint findByLabel(String label) {
		return find("label", label).firstResult();
	}	
}
