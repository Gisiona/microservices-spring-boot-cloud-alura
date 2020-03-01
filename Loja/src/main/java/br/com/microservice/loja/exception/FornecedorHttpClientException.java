package br.com.microservice.loja.exception;

import lombok.Getter;

@Getter
public class FornecedorHttpClientException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	private int codigo;
	
	public FornecedorHttpClientException(String mensagem, int codigo) {
		this.codigo = codigo;
		this.mensagem = mensagem;
	}
	
	public FornecedorHttpClientException(Throwable ex) {
		super(ex);
	}
}
