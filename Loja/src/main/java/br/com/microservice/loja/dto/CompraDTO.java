package br.com.microservice.loja.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class CompraDTO {

	@JsonProperty("data_compra")
	private LocalDateTime dataCompra;
	
	@JsonProperty("endereco_entrega")
	private EnderecoDTO endereco;
	
	@JsonProperty("itens_compra")
	private ItensDaCompraDTO itens;
	
	@JsonProperty("cliente")
	private ClienteDTO cliente;	
}
