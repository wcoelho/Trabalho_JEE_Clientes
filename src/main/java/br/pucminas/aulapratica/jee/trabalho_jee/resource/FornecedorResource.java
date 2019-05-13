package br.pucminas.aulapratica.jee.trabalho_jee.resource;


public class FornecedorResource {

	private Long fornecedor_id;	
	private String razao_social;	
	private String cnpj;	
	private String endereco;	
	private String inscricao_municipal;
	private String email;
	
	public Long getFornecedorId() {
		return fornecedor_id;
	}
	public void setFornecedorId(Long id) {
		this.fornecedor_id = id;
	}
	public String getRazaoSocial() {
		return razao_social;
	}
	public void setRazaoSocial(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getInscricaoMunicipal() {
		return inscricao_municipal;
	}
	public void setInscricaoMunicipal(String inscricao_municipal) {
		this.inscricao_municipal = inscricao_municipal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



}
