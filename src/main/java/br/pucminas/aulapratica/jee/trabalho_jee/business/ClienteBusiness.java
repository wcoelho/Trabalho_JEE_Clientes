package br.pucminas.aulapratica.jee.trabalho_jee.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.pucminas.aulapratica.jee.trabalho_jee.entity.ClienteEntity;
import br.pucminas.aulapratica.jee.trabalho_jee.exception.CpfJaExistenteException;
import br.pucminas.aulapratica.jee.trabalho_jee.repository.ClienteRepository;
import br.pucminas.aulapratica.jee.trabalho_jee.resource.ClienteResource;

@Stateless
public class ClienteBusiness {

	@Inject
	public ClienteRepository clienteRepository;
	
	public void salvarCliente(ClienteResource clienteResource){		
		
		ClienteEntity cliente = toEntity(clienteResource);
		
		List<ClienteEntity> lista_clientes_mesmo_cpf = clienteRepository.buscarPorCpf(clienteResource.getCpf());
		if(lista_clientes_mesmo_cpf != null && lista_clientes_mesmo_cpf.size() > 0){
			throw new CpfJaExistenteException();
		}
		
		clienteRepository.salvar(cliente);
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
		clienteEntity.setClienteId(clienteResource.getClienteId());
		
		return clienteEntity;
	}
	
	private ClienteResource fromEntity(ClienteEntity clienteEntity)
	{
		ClienteResource clienteResource = new ClienteResource();
		clienteResource.setNome(clienteEntity.getNome());
		clienteResource.setCpf(clienteEntity.getCpf());
		clienteResource.setDataNascimento(clienteEntity.getDataNascimento());
		clienteResource.setEmail(clienteEntity.getEmail());
		clienteResource.setClienteId(clienteEntity.getClienteId());
		
		return clienteResource;
	}
	
}
