package br.com.microservice.loja.mapper;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.microservice.loja.converter.Converters;
import br.com.microservice.loja.dto.InfoFornecedorDTO;
import br.com.microservice.loja.model.FornecedorModel;

public class FornecedorMapper {

	public static InfoFornecedorDTO toMapper(FornecedorModel model) {		
		InfoFornecedorDTO fornecedor = new InfoFornecedorDTO(
				model.getIdFornecedor(), 
				model.getTelefone(), 
				model.getEmail(), 
				model.getPessoaContato(), 
				model.getEstado(), 
				model.getIdEndereco());		
		return fornecedor;
	}


	public static List<InfoFornecedorDTO> toMapper(Object body) throws JsonProcessingException {

		List<FornecedorModel> fornecedores = convertJsonToArrayObject(Converters.convertObjectToJson(body));
		List<InfoFornecedorDTO> response = new ArrayList<InfoFornecedorDTO>();
		InfoFornecedorDTO dto = null;
		
		for (FornecedorModel model : fornecedores) {
			dto = new InfoFornecedorDTO(
					model.getIdFornecedor(), 
					model.getTelefone(),
					model.getEmail(),
					model.getPessoaContato(),
					model.getEstado(), 
					model.getIdEndereco());
			response.add(dto);
		}
		return response;
	}
	
	public static List<FornecedorModel>  convertJsonToArrayObject(String jsonString) throws JsonProcessingException {
	     TypeReference<List<FornecedorModel>> typeRef = new TypeReference<List<FornecedorModel>>() { };
         ObjectMapper mapper = new ObjectMapper();         
         List<FornecedorModel> list = mapper.readValue(jsonString, typeRef);
         return list;
	}

}
