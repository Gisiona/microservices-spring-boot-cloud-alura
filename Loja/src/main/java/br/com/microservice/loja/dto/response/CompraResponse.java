package br.com.microservice.loja.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.microservice.loja.dto.InfoFornecedorDTO;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CompraResponse {
	
	@JsonProperty("id_compra")
	private UUID idCompra;
	
	@JsonProperty("data_compra")
	private LocalDateTime dataCompra;
	
	@JsonProperty("fornecedor")
	private InfoFornecedorDTO fornecedor;
}
