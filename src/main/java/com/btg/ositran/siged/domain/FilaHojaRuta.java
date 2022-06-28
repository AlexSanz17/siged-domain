package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "trazabilidadunificada")
public class FilaHojaRuta {

	@Override
	public String toString() {
		return "FilaHojaRuta [pk=" + pk + ", fechaCreacion=" + fechaCreacion + ", remitente=" + remitente + ", filas="
				+ filas + ", destinatario=" + destinatario + ", accion=" + accion + ", contenido=" + contenido
				+ ", idremitente=" + idremitente + ", idunidadremitente=" + idunidadremitente + ", cantidadhoja="
				+ cantidadhoja + ", documento=" + documento + ", proveido=" + proveido + ", nombrePC=" + nombrePC
				+ ", estado=" + estado + ", numeroDocumento=" + numeroDocumento + "]";
	}

	@EmbeddedId
	protected FilaHojaRutaPK pk;

	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	private String remitente;

	@Basic(optional=true)
	private String filas = "0";

	public String getFilas() {
		return filas;
	}

	public void setFilas(String filas) {
		this.filas = filas;
	}

	private String destinatario;

	private String accion;

	private String contenido;
        
        private String idremitente;
        
        private String idunidadremitente;
        
        private String cantidadhoja;

        public String getCantidadhoja() {
            return cantidadhoja;
        }

        public void setCantidadhoja(String cantidadhoja) {
            this.cantidadhoja = cantidadhoja;
        }

        public String getIdremitente() {
            return idremitente;
        }

        public void setIdremitente(String idremitente) {
            this.idremitente = idremitente;
        }

        public String getIdunidadremitente() {
            return idunidadremitente;
        }

        public void setIdunidadremitente(String idunidadremitente) {
            this.idunidadremitente = idunidadremitente;
        }

	private Integer documento;
        
        private String proveido;

	@Column(name="nombrepc")
	private String nombrePC;

	private String estado;

	@Column(name="nrodocumento")
	private String numeroDocumento;

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getRemitente() {
		if(remitente == null){
			return "";
		}
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		if(destinatario == null){
			return "";
		}
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAccion() {
		if(accion == null){
			return "";
		}
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getContenido() {
		if(contenido == null){
			return "";
		}
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public FilaHojaRutaPK getPk() {
		return pk;
	}

	public void setPk(FilaHojaRutaPK pk) {
		this.pk = pk;
	}

	public String getNombrePC() {
		if(nombrePC == null){
			return "";
		}
		return nombrePC;
	}

	public void setNombrePC(String nombrePC) {
		this.nombrePC = nombrePC;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
        
         public String getProveido() {
            return proveido;
        }

        public void setProveido(String proveido) {
            this.proveido = proveido;
        }
}
