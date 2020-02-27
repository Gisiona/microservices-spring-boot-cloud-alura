package br.com.microservice.fornecedor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.fornecedor.entity.InfoFornecedor;

@Repository
public interface InfoFornecedorRepository extends JpaRepository<InfoFornecedor, Long>  {
	List<InfoFornecedor> findByEstado(String estado);
}
