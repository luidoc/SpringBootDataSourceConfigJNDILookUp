package com.examples.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")
public class Test {

	@Indexed(unique = true)
	private String cod;

	private String name;

	public String getCod() {
		return cod;
	}

	public void setCodigo(String cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setNombre(String name) {
		this.name = name;
	}

}
