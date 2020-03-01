package br.com.microservice.loja.mapper;

import org.springframework.stereotype.Component;

import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.dto.response.CompraResponse;

@Component
public class CompraMapper {

	public CompraResponse mapper(InfoFornecedorDTO infoFornecedor) {		
		CompraResponse responseCompra = new CompraResponse();
		
		return responseCompra;
	}
	
}
