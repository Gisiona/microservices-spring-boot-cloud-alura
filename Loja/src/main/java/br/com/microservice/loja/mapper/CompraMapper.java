package br.com.microservice.loja.mapper;

import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.dto.response.CompraResponse;

public class CompraMapper {

	public CompraResponse mapper(InfoFornecedorDTO infoFornecedor) {		
		CompraResponse responseCompra = new CompraResponse();
		
		return responseCompra;
	}

	
}
