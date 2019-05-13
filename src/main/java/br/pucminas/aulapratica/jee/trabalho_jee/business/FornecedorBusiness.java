package br.pucminas.aulapratica.jee.trabalho_jee.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.pucminas.aulapratica.jee.trabalho_jee.entity.FornecedorEntity;
import br.pucminas.aulapratica.jee.trabalho_jee.repository.FornecedorRepository;
import br.pucminas.aulapratica.jee.trabalho_jee.resource.FornecedorResource;

@Stateless
public class FornecedorBusiness {

	@Inject
	public FornecedorRepository fornecedorRepository;
	
	public void salvarFornecedor(FornecedorResource fornecedorResource){		
		fornecedorRepository.salvar(toEntity(fornecedorResource));
	}
	
	public List<FornecedorResource> recuperarFornecedores(){
		
		List<FornecedorResource> resources = new ArrayList<>();
		List<FornecedorEntity> entities = fornecedorRepository.recuperar();
		entities.forEach(currentEntity -> {
			resources.add(fromEntity(currentEntity));
		});
		
		return resources;		
	}
	
	private FornecedorEntity toEntity(FornecedorResource fornecedorResource)
	{
		FornecedorEntity fornecedorEntity = new FornecedorEntity();
		fornecedorEntity.setRazaoSocial(fornecedorResource.getRazaoSocial());
		fornecedorEntity.setCnpj(fornecedorResource.getCnpj());
		fornecedorEntity.setInscricaoMunicipal(fornecedorResource.getInscricaoMunicipal());
		fornecedorEntity.setEndereco(fornecedorResource.getEndereco());
		fornecedorEntity.setEmail(fornecedorResource.getEmail());
		fornecedorEntity.setFornecedorId(fornecedorResource.getFornecedorId());
		
		return fornecedorEntity;
	}
	
	private FornecedorResource fromEntity(FornecedorEntity fornecedorEntity)
	{
		FornecedorResource fornecedorResource = new FornecedorResource();
		fornecedorResource.setRazaoSocial(fornecedorEntity.getRazaoSocial());
		fornecedorResource.setCnpj(fornecedorEntity.getCnpj());
		fornecedorResource.setInscricaoMunicipal(fornecedorEntity.getInscricaoMunicipal());
		fornecedorResource.setEndereco(fornecedorEntity.getEndereco());
		fornecedorResource.setEmail(fornecedorEntity.getEmail());
		fornecedorResource.setFornecedorId(fornecedorEntity.getFornecedorId());
		
		return fornecedorResource;
	}
	
}
