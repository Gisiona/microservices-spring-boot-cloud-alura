package br.com.microservice.loja.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Params {

	@Value("fornecedor.url")
	private String urlFornecedor;
}
