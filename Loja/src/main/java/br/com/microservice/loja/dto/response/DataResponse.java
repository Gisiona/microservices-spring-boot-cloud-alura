package br.com.microservice.loja.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataResponse<Data> {

	@JsonProperty("data")
	private final Data data;
	
	public DataResponse(Data _data) {
		this.data = _data;
	}
	
	public Data getData() {
		return data;
	}
}
