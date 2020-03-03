package br.com.microservice.loja.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.microservice.loja.dto.CompraRequestDTO;
import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.exception.FornecedorHttpClientException;
import br.com.microservice.loja.mapper.FornecedorMapper;
import br.com.microservice.loja.model.FornecedorModel;

@Service
public class CompraService {

	@Autowired
	private RestTemplate restTemplate;
	
	private final String urlApiFornecedor = "http://fornecedor/api/v1/fornecedor";
	
	public List<InfoFornecedorDTO> realizarCompra(CompraRequestDTO compra) throws JsonMappingException {
		try {
			
			ResponseEntity<InfoFornecedorDTO> objReturn = restTemplate.exchange(URI.create(urlApiFornecedor), 
											HttpMethod.GET, 
											null, 
											InfoFornecedorDTO.class);
			
			return Arrays.asList(objReturn.getBody());
			
		} catch (HttpClientErrorException e) {
			throw e;
		}		
	}
	
	
	public List<InfoFornecedorDTO> buscarFornecedoresPorEstado(String estado) throws Throwable {
		try {			
			ResponseEntity<Object> objReturn = restTemplate.exchange(URI.create(urlApiFornecedor.concat("/all/"+estado.toUpperCase())), 
											HttpMethod.GET, 
											null, 
											Object.class);

			return FornecedorMapper.toMapper(objReturn.getBody());			
		} catch (HttpClientErrorException e) {
			throw e;
		}		
	}
	
	public InfoFornecedorDTO buscarFornecedorPorId(Long id) throws FornecedorHttpClientException {
	try { 			
		ResponseEntity<FornecedorModel> response = restTemplate.exchange(URI.create(urlApiFornecedor.concat("/info/"+id)), 
										HttpMethod.GET, 
										null, 
										FornecedorModel.class);
			
		 return response.hasBody() ? FornecedorMapper.toMapper(response.getBody()) : null;

		} catch (HttpClientErrorException  e) {
			throw new FornecedorHttpClientException(e.getMessage(),e.getRawStatusCode());
		}		
	}

}
