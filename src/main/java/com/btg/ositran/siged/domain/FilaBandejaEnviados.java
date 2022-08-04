package com.btg.ositran.siged.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vistabandejaenviados")
public class FilaBandejaEnviados {

	@Id
	private Integer id;
        
    @Column(name = "nroTramite")
    private String nroTramite;

	@Column(name = "idpropietario")
	private Integer idPropietario;

    @Column(name = "estado")
	private String estado;

	@Column(name = "iddestinatario")
	private Integer idDestinatario;

	@Column(name = "idtipodocumento")
	private Integer idTipoDocumento;
        
    @Column(name = "llave")
	private String llave;

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }
        
	private String asunto;

	@JoinColumn(name="idcliente",referencedColumnName="idcliente",insertable=false,updatable=false)
	@ManyToOne
	private Cliente cliente;

	@Column(name="documento")
	private String nroDocumento;

	@Column(name="fecharecepcion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRecepcion;

	private String destinatario;

	@Column(name="expediente")
	private String nroExpediente;
        
    @Column(name="unidadPropietario")
	private Integer unidadPropietario;
        
    @Column(name="cargoPropietario")
	private Integer cargoPropietario;

	@Column(name = "asuntoexpediente")
	private String asuntoExpediente;

	@Column(name="tipoenvio")
	private String tipoEnvio;

	private String prioridad;

	@Column(name="fechalimite")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLimite;
        
	private String accion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public String getNroExpediente() {
		return nroExpediente;
	}

	public void setNroExpediente(String nroExpediente) {
		this.nroExpediente = nroExpediente;
	}

	public Integer getIdDestinatario() {
		return idDestinatario;
	}

	public void setIdDestinatario(Integer idDestinatario) {
		this.idDestinatario = idDestinatario;
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getAsuntoExpediente() {
		return asuntoExpediente;
	}

	public void setAsuntoExpediente(String asuntoExpediente) {
		this.asuntoExpediente = asuntoExpediente;
	}

	public Integer getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(Integer idPropietario) {
		this.idPropietario = idPropietario;
	}
        
     public Integer getUnidadPropietario() {
        return unidadPropietario;
    }

    public void setUnidadPropietario(Integer unidadPropietario) {
        this.unidadPropietario = unidadPropietario;
    }

    public Integer getCargoPropietario() {
        return cargoPropietario;
    }

    public void setCargoPropietario(Integer cargoPropietario) {
        this.cargoPropietario = cargoPropietario;
    }
    
     public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
     public String getNroTramite() {
        return nroTramite;
    }

    public void setNroTramite(String nroTramite) {
        this.nroTramite = nroTramite;
    }
}