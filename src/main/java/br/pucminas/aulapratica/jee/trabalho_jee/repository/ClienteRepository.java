package br.pucminas.aulapratica.jee.trabalho_jee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.pucminas.aulapratica.jee.trabalho_jee.entity.ClienteEntity;

public class ClienteRepository {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public ClienteEntity salvar(ClienteEntity cliente) {
		em.persist(cliente);
		return cliente;
	}
	
	public List<ClienteEntity> recuperar() {
		TypedQuery<ClienteEntity> query = em.createQuery("Select c from ClienteEntity c", ClienteEntity.class);		
		return query.getResultList();
	}	

	public List<ClienteEntity> buscarPorCpf(String cpf) {
		return em.createQuery("SELECT c FROM ClienteEntity c WHERE c.cpf = :cpf", ClienteEntity.class)
				.setParameter("cpf", cpf).getResultList();
	}

}
