package com.btg.ositran.siged.domain;

import java.io.Serializable;

public class AuditableCampo implements Serializable{

	private static final long serialVersionUID=1L;
	private String campo;
	private String titulo;

	public AuditableCampo(String campo,String titulo){
		this.campo=campo;
		this.titulo=titulo;
	}

	public String getCampo(){
		return campo;
	}

	public void setCampo(String campo){
		this.campo=campo;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
}
