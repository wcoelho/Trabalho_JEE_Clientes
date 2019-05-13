package br.pucminas.aulapratica.jee.trabalho_jee.exception;

import javax.ejb.ApplicationException;

@ApplicationException
public class CnpjJaExistenteException extends RuntimeException {

	private static final long serialVersionUID = 6590550478191329041L;

	@Override
	public String getMessage() {
		return "CNPJ fornecido já está registrado na base de dados.";
	}

	
}