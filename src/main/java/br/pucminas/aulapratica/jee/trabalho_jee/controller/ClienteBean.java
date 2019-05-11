package br.pucminas.aulapratica.jee.trabalho_jee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.pucminas.aulapratica.jee.trabalho_jee.business.ClienteBusiness;
import br.pucminas.aulapratica.jee.trabalho_jee.resource.ClienteResource;

@Model
@ManagedBean(name="ClientBean")
public class ClienteBean {

	/*Neste ponto deve-se incluir o EJB para ser usado nos desafions 1 e 2*/
	@EJB
	ClienteBusiness clienteBusiness;

	
	/*Neste ponto, serão incluídas as propriedades de classe que serão usadas para 
	 * exibir as informações em tela.*/
	
	private ClienteResource clienteResource = new ClienteResource();

	/* Implementação da listagem de clientes conforme desafio 2 */
	List<ClienteResource> clientes = new ArrayList<>();	

	public ClienteResource getClienteResource() {
		return clienteResource;
	}

	public void setClienteResource(ClienteResource clienteResource) {
		this.clienteResource = clienteResource;
	}
	
	public List<ClienteResource> getClientes()
	{
		return clientes;
	}
	
	public String recuperarClientes()
	{
		clienteBusiness.recuperarClientes();
		return "clienteListagem.jsf";
	}
	
	public String cadastrarCliente()
	{
		return "clienteCadastro.jsf";
	}

	public void salvarCliente() {
		FacesMessage message;
		try{
			clienteBusiness.salvarCliente(this.clienteResource);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "SUCESSO", "Cliente registrado com sucesso!");			
		} catch (Exception e) {			
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERRO", "Erro ao cadastrar cliente: " + e.getMessage());
		}
		FacesContext.getCurrentInstance().addMessage("formCliente:messages", message);
	}

}
