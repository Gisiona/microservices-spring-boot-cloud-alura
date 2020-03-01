package br.com.microservice.loja.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.microservice.loja.converter.Converters;
import br.com.microservice.loja.dto.CompraRequestDTO;
import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.dto.response.CompraResponse;
import br.com.microservice.loja.exception.FornecedorHttpClientException;
import br.com.microservice.loja.mapper.CompraMapper;
import br.com.microservice.loja.service.CompraService;

@Component
public class CompraProcessor {

	@Autowired
	private CompraService compraService;
	
	@Autowired
	private CompraMapper compraMapper;
	
	public CompraResponse realizarCompra(CompraRequestDTO compra) throws JsonProcessingException {
		
		//compraMapper = new CompraMapper();		
		String comp = Converters.convertObjectToJson(compra);
		System.out.print(comp);
		Object retorno = compraService.realizarCompra(compra);
		return null;
	}


	public List<InfoFornecedorDTO> buscarFornecedoresPorEstado(String estado) throws Throwable   {
		List<InfoFornecedorDTO> response = compraService.buscarFornecedoresPorEstado(estado);
		return response;
	}

	public InfoFornecedorDTO listaFornecedorPorId(Long id) throws FornecedorHttpClientException {
		InfoFornecedorDTO response = compraService.buscarFornecedorPorId(id);
		return response;
	}
}
