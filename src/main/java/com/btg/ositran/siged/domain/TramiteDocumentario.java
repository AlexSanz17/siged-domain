package com.btg.ositran.siged.domain;

public class TramiteDocumentario implements java.io.Serializable {
	private String id_codigo;
    private String nrodocumento;
    private String iddocumento;
    private String remitente;
    private String destinatario;
    private String fechacreacion;
    private String orden;
    private String estado;
    private String termino = "0";

    public String getTermino() {
		return termino;
	}
	public void setTermino(String termino) {
		this.termino = termino;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	private String asunto;
    private String cliente;
    private String fechaCambioEstado;


	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getFechaCambioEstado() {
		return fechaCambioEstado;
	}
	public void setFechaCambioEstado(String fechaCambioEstado) {
		this.fechaCambioEstado = fechaCambioEstado;
	}
	public String getNrodocumento() {
		return nrodocumento;
	}
	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}

	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getId_codigo() {
		return id_codigo;
	}
	public void setId_codigo(String id_codigo) {
		this.id_codigo = id_codigo;
	}
	public String getIddocumento() {
		return iddocumento;
	}
	public void setIddocumento(String iddocumento) {
		this.iddocumento = iddocumento;
	}
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}


}
