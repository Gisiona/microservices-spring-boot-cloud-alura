package br.com.microservice.loja.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClienteDTO {
	
	@JsonProperty("nome_compelto")
	private String nome;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("telefone")
	private String Telefone;
}
