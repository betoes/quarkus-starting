package org.acme.getting.started.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.getting.started.model.Endpoint;
import org.acme.getting.started.repository.EndpointRepository;

@ApplicationScoped
public class EndpointService {
	
	
	@Inject
	private EndpointRepository endpointRep;
	
	public List<Endpoint> listEndpoints()
	{
		return endpointRep.listAll();
	}
	
	
	@Transactional
	public void save(Endpoint endpoint)
	{
		endpointRep.persist(endpoint);
	}
	
	public Endpoint getByLabel(String label)
	{
		return endpointRep.findByLabel(label);
	}
}
