package br.com.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.fornecedor.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>  {

}