package br.pucminas.aulapratica.jee.trabalho_jee.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.pucminas.aulapratica.jee.trabalho_jee.entity.ClienteEntity;
import br.pucminas.aulapratica.jee.trabalho_jee.repository.ClienteRepository;
import br.pucminas.aulapratica.jee.trabalho_jee.resource.ClienteResource;

@Stateless
public class ClienteBusiness {

	@Inject
	public ClienteRepository clienteRepository;
	
	public void salvarCliente(ClienteResource clienteResource){		
		clienteRepository.salvar(toEntity(clienteResource));
	}
	
	public List<ClienteResource> recuperarClientes(){
		
		List<ClienteResource> resources = new ArrayList<>();
		List<ClienteEntity> entities = clienteRepository.recuperar();
		entities.forEach(currentEntity -> {
			resources.add(fromEntity(currentEntity));
		});
		
		return resources;		
	}
	
	private ClienteEntity toEntity(ClienteResource clienteResource)
	{
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteEntity.setNome(clienteResource.getNome());
		clienteEntity.setCpf(clienteResource.getCpf());
		clienteEntity.setDataNascimento(clienteResource.getDataNascimento());
		clienteEntity.setEmail(clienteResource.getEmail());
		clienteEntity.setId(clienteResource.getId());
		
		return clienteEntity;
	}
	
	private ClienteResource fromEntity(ClienteEntity clienteEntity)
	{
		ClienteResource clienteResource = new ClienteResource();
		clienteResource.setNome(clienteEntity.getNome());
		clienteResource.setCpf(clienteEntity.getCpf());
		clienteResource.setDataNascimento(clienteEntity.getDataNascimento());
		clienteResource.setEmail(clienteEntity.getEmail());
		clienteResource.setId(clienteEntity.getId());
		
		return clienteResource;
	}
	
}
