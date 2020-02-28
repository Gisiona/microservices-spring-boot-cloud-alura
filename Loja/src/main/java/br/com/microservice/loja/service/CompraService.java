package br.com.microservice.loja.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.loja.dto.CompraDTO;
import br.com.microservice.loja.dto.InfoFornecedorDTO;


@Service
public class CompraService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("fornecedor.url")
	private String urlApiFornecedor; 
	
	public ResponseEntity<InfoFornecedorDTO> realizarCompra(CompraDTO compra) {
		try {
			return restTemplate.exchange(URI.create(urlApiFornecedor), 
											HttpMethod.GET, 
											null, 
											InfoFornecedorDTO.class);
		} catch (HttpClientErrorException e) {
			throw e;
		}		
	}

}
