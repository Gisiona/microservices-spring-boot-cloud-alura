package br.com.microservice.loja.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class EnderecoDTO {

	@JsonProperty("logradouro")
	private String endereco;
	
	@JsonProperty("numero")
	private Long numero;
	
	@JsonProperty("complemento")
	private String complemento;
	
	@JsonProperty("bairro")
	private String bairro;
	
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonProperty("estado")
	private String estado;
	
	@JsonProperty("uf")
	private String uf;
	
	@JsonProperty("cep")
	private String cep;
	
}
