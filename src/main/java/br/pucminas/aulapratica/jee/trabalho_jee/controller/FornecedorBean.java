package br.pucminas.aulapratica.jee.trabalho_jee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.pucminas.aulapratica.jee.trabalho_jee.business.FornecedorBusiness;
import br.pucminas.aulapratica.jee.trabalho_jee.resource.FornecedorResource;

@Model
@ManagedBean(name="SupplierBean")
public class FornecedorBean {

	@EJB
	FornecedorBusiness fornecedorBusiness;
	
	private FornecedorResource fornecedorResource = new FornecedorResource();
	
	private List<FornecedorResource> fornecedores = new ArrayList<>();	

	public FornecedorResource getFornecedorResource() {
		return fornecedorResource;
	}

	public void setFornecedorResource(FornecedorResource fornecedorResource) {
		this.fornecedorResource = fornecedorResource;
	}
	
	public List<FornecedorResource> getFornecedores()
	{
		return fornecedores;
	}
	
	public String recuperarFornecedores()
	{
		fornecedores = fornecedorBusiness.recuperarFornecedores();
		return "fornecedorListagem";
	}
	
	public String cadastrarFornecedor()
	{
		return "fornecedorCadastro";
	}
	
	public String irParaHome()
	{
		return "inicial";
	}

	public void salvarFornecedor() {
		FacesMessage message;
		try{
			fornecedorBusiness.salvarFornecedor(this.fornecedorResource);
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Fornecedor registrado com sucesso!", "");			
		} catch (Exception e) {			
			message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao tentar registrar fornecedor: " + e.getMessage(),"");
		}
		FacesContext.getCurrentInstance().addMessage("formFornecedor:messages", message);
	}

}
