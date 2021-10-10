package com.btg.ositran.siged.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class FilaHojaRutaPK implements Serializable{
	private static final long serialVersionUID=1L;
	private int id;
	private String tipo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
