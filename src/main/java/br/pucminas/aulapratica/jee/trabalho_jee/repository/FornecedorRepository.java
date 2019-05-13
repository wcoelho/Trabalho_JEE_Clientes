package br.pucminas.aulapratica.jee.trabalho_jee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.pucminas.aulapratica.jee.trabalho_jee.entity.FornecedorEntity;

public class FornecedorRepository {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public FornecedorEntity salvar(FornecedorEntity fornecedor) {
		em.persist(fornecedor);
		return fornecedor;
	}
	
	public List<FornecedorEntity> recuperar() {
		TypedQuery<FornecedorEntity> query = em.createQuery("Select f from FornecedorEntity f", FornecedorEntity.class);		
		return query.getResultList();
	}


}
