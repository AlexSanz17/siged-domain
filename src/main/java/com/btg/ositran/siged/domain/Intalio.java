package com.btg.ositran.siged.domain;

import java.io.Serializable;

public class Intalio implements Serializable{
	private static final long serialVersionUID=1L;
	private String idProceso;
	private String Proceso;
	private String url;
	private String estado;

	public String getIdProceso(){
		return idProceso;
	}

	public void setIdProceso(String idProceso){
		this.idProceso=idProceso;
	}

	public String getProceso(){
		return Proceso;
	}

	public void setProceso(String proceso){
		Proceso=proceso;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public String getUrl(){
		return url;
	}

	public void setUrl(String url){
		this.url=url;
	}

}
