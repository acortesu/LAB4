package com.cenfotec.componentes.beans;

public class PrimerBean {
	private String name;
	private int numero;

	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumero() {return this.numero;}

	public void setNumero(int dato) {this.numero = dato;}

	public Integer getDiscriminante() {
		return this.numero /2;
	}
}
