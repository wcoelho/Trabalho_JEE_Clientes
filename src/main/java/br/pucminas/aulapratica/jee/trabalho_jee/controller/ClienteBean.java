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

	@EJB
	ClienteBusiness clienteBusiness;
	
	private ClienteResource clienteResource = new ClienteResource();
	
	private List<ClienteResource> clientes = new ArrayList<>();	

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
		clientes = clienteBusiness.recuperarClientes();
		return "clienteListagem";
	}
	
	public String cadastrarCliente()
	{
		return "clienteCadastro";
	}
	
	public String irParaHome()
	{
		return "inicial";
	}

	public void salvarCliente() {
		FacesMessage message;
		try{
			clienteBusiness.salvarCliente(this.clienteResource);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cliente registrado com sucesso!", "");			
		} catch (Exception e) {			
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao tentar registrar cliente: " + e.getMessage(),"");
		}
		FacesContext.getCurrentInstance().addMessage("formCliente:messages", message);
	}

}
