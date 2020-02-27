package br.com.microservice.loja.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InfoFornecedorDTO {

	public Long idFornecedor;
	private String telefone;
	private String email;
	private String pessoaContato;
	private String estado;
	private EnderecoDTO endereco;
}
