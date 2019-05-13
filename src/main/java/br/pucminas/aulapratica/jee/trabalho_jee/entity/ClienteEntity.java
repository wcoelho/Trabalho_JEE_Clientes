package br.pucminas.aulapratica.jee.trabalho_jee.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 * Entity implementation class for Entity: ClienteEntity
 *
 */
@Entity
@Table(name = "Cliente")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long cliente_id;

	@Size(min = 15, max = 300, message = "Nome deve ter de 15 a 300 caracteres")
	private String nome;

	@Size(min = 11, max = 11, message = "CPF deve ter 11 caracteres")
	private String cpf;

	private Date data_nascimento;

	private String email;

	public ClienteEntity() {
		super();
	}

	public Long getClienteId() {
		return this.cliente_id;
	}

	public void setClienteId(Long id) {
		this.cliente_id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return this.data_nascimento;
	}

	public void setDataNascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
