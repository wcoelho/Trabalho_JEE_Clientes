package br.pucminas.aulapratica.jee.trabalho_jee.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: FornecedorEntity
 *
 */
@Entity
@Table(name = "Fornecedor")
@SequenceGenerator(name="fornecedorId", initialValue=2)
public class FornecedorEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="fornecedorId")
	private Long fornecedor_id;
	
	private String razao_social;	
	private String cnpj;	
	private String endereco;	
	private String inscricao_municipal;
	private String email;

	public FornecedorEntity() {
		super();
	}

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
