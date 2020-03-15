package br.com.microservice.fornecedor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.microservice.fornecedor.entity.Endereco;

public class InfoFornecedorDto {
	
	@JsonProperty("id_fornecedor")
	private String idFornecedor;
	
	@JsonProperty("telefone")
	private String telefone;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("pessoa_contato")
	private String pessoaContato;
		
	@JsonProperty("endereco")
	private Endereco endereco;
	
	public String getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPessoaContato() {
		return pessoaContato;
	}

	public void setPessoaContato(String pessoaContato) {
		this.pessoaContato = pessoaContato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
