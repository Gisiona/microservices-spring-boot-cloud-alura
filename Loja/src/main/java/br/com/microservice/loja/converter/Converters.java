package br.com.microservice.loja.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Converters {

	public static String convertObjectToJson(Object obj) throws JsonProcessingException {
		 //Creating the ObjectMapper object
		  ObjectMapper mapper = new ObjectMapper();
		  //Converting the Object to JSONString
		  String jsonString = mapper.writeValueAsString(obj);
		  return jsonString;
	}
}
