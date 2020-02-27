package br.com.microservice.loja.processor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.microservice.loja.dto.CompraDTO;
import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.dto.response.CompraResponse;
import br.com.microservice.loja.mapper.CompraMapper;
import br.com.microservice.loja.service.CompraService;

@Component
public class CompraProcessor {

	private CompraService compraService;
	private CompraMapper compraMapper;
	
	
	public CompraResponse realizarCompra(CompraDTO compra) throws JsonProcessingException {
		
		compraMapper = new CompraMapper();
		compraService = new CompraService();
		
		String comp = convertObjectToJson(compra);
		System.out.print(comp);
		ResponseEntity<InfoFornecedorDTO> responseInfoFornecedor = compraService.realizarCompra(compra);
		CompraResponse response = compraMapper.mapper(responseInfoFornecedor.getBody());
		return response;
	}

	private String convertObjectToJson(Object obj) throws JsonProcessingException {
		 //Creating the ObjectMapper object
	      ObjectMapper mapper = new ObjectMapper();
	      //Converting the Object to JSONString
	      String jsonString = mapper.writeValueAsString(obj);
	      return jsonString;
	}
}
