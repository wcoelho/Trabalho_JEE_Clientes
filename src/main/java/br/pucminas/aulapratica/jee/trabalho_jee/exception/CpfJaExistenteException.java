package br.pucminas.aulapratica.jee.trabalho_jee.exception;

import javax.ejb.ApplicationException;

@ApplicationException
public class CpfJaExistenteException extends RuntimeException {

	private static final long serialVersionUID = -8767421009105644388L;

	@Override
	public String getMessage() {
		return "CPF fornecido já está registrado na base de dados.";
	}

	
}