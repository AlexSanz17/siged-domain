package com.btg.ositran.siged.domain;

public class TrazabilidadDocumentaria implements java.io.Serializable{
    private Integer grupo;
	private String origen;
    private String destino;
    private String accion;
    private String estado;

	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
}
