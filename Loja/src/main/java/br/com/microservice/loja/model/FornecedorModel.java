package br.com.microservice.loja.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FornecedorModel {

	@JsonProperty("idFornecedor")
	private Long idFornecedor;

	@JsonProperty("telefone")
	private String telefone;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("pessoaContato")
	private String pessoaContato;
	
	@JsonProperty("estado")
	private String estado;
	
	@JsonProperty("idEndereco")
	private Long idEndereco;
	
	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}
}
