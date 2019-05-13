package br.pucminas.aulapratica.jee.trabalho_jee.resource;

import java.util.Date;

public class ClienteResource {

	private Long cliente_id;

	private String nome;

	private String cpf;

	private Date data_nascimento;

	private String email;

	public Long getClienteId() {
		return cliente_id;
	}

	public void setClienteId(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return data_nascimento;
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
