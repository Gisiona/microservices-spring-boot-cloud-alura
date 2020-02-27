package br.com.microservice.loja.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class ItensDaCompraDTO {
	
	@JsonProperty("id_item")
	private Long IdItem;
	
	@JsonProperty("quantidade")
	private Integer quantidade;
	
	@JsonProperty("valor_item")
	private Long valorItem;
}
