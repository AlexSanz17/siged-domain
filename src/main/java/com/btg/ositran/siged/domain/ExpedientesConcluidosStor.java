package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
@Table(name="expedientesconcluidosstor")
public class ExpedientesConcluidosStor implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="NROEXPEDIENTE")
	private String expediente;
	@Column(name="FECHACONCLUIDO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaConcluido;
	@Column(name="FECHACREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacionExpediente;
	@Column(name="ETAPA")
	private String etapa;
	@Column(name="CLIENTE")
	private String cliente;
	@Column(name="NOMBREP")
	private String nombrep;
	@Column(name="NOMBREM")
	private String nombrem;
	@Column(name="NOMBREN")
	private String nombren;
	@Column(name="CONCESIONARIO")
	private String concesionario;
	@Column(name="ESTADO")
	private String estado;
	@Column(name="SALA")
	private String sala;
	@Column(name="FECHANOTIFICACIONCONCESIONARIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNotificacionConcesionario;
	@Column(name="FECHAAPROBACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAprobacion;
	@Column(name="FECHACUMPLIMIENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCumplimiento;
	@Column(name="PROPIETARIO")
	private String propietario;
	@Column(name="MOTIVO")
	private String motivo;
	@Column(name="MONTO")
	private Float monto;
	/**************** AUN SIN DATA *******************/
	@Column(name="NRORESOLUCION")
	private String nroResolucion;
	@Transient
	private String salaResolucion;
	@Column(name="RESULTADO")
	private String resultado;

	/***********************************************/
	public String getAnio(){
		if(fechaCreacionExpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("yyyy");
		return fechita.format(fechaConcluido);
	}

	public String getMesIngreso(){
		if(fechaCreacionExpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("MMM-yy");
		return fechita.format(fechaCreacionExpediente);
	}

	public String getExpediente(){
		return expediente;
	}

	public void setExpediente(String expediente){
		this.expediente=expediente;
	}

	public String getFechaCreacionExpediente(){
		if(fechaCreacionExpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaCreacionExpediente);
	}

	public void setFechaCreacionExpediente(Date fechaCreacionExpediente){
		this.fechaCreacionExpediente=fechaCreacionExpediente;
	}

	public String getEtapa(){
		if(etapa == null){
			return "Recien ingresado";
		}
		return etapa;
	}

	public void setEtapa(String etapa){
		this.etapa=etapa;
	}

	public String getCliente(){
		if(cliente == null){
			return nombrep + " " + nombrem + ", " + nombren;
		}
		return cliente;
	}

	public void setCliente(String cliente){
		this.cliente=cliente;
	}

	public String getNombrep(){
		if(nombrep == null){
			return "";
		}
		return nombrep;
	}

	public void setNombrep(String nombrep){
		this.nombrep=nombrep;
	}

	public String getNombrem(){
		if(nombrem == null){
			return "";
		}
		return nombrem;
	}

	public void setNombrem(String nombrem){
		this.nombrem=nombrem;
	}

	public String getNombren(){
		if(nombren == null){
			return "";
		}
		return nombren;
	}

	public void setNombren(String nombren){
		this.nombren=nombren;
	}

	public String getConcesionario(){
		if(concesionario == null){
			return "Sin concesionario";
		}
		return concesionario;
	}

	public void setConcesionario(String concesionario){
		this.concesionario=concesionario;
	}

	public String getEstado(){
		if(estado == null){
			return "Sin estado";
		}
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public String getSala(){
		if(sala == null){
			return "Sin sala asignada";
		}
		return sala;
	}

	public void setSala(String sala){
		this.sala=sala;
	}

	public String getPropietario(){
		if(propietario == null){
			return "No asginado";
		}
		return propietario;
	}

	public void setPropietario(String propietario){
		this.propietario=propietario;
	}

	public String getMotivo(){
		if(motivo == null){
			return "No especificado";
		}
		return motivo;
	}

	public void setMotivo(String motivo){
		this.motivo=motivo;
	}

	public String getFechaConcluido(){
		if(fechaConcluido == null){
			return "-";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaConcluido);
	}

	public void setFechaConcluido(Date fechaConcluido){
		this.fechaConcluido=fechaConcluido;
	}

	public String getMonto(){
		if(monto == null){
			return "0.0";
		}
		return Float.toString(monto);
	}

	public void setMonto(Float monto){
		this.monto=monto;
	}

	public String getFechaNotificacionConcesionario(){
		if(fechaNotificacionConcesionario == null){
			return "Sin notificar";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaNotificacionConcesionario);
	}

	public void setFechaNotificacionConcesionario(Date fechaNotificacionConcesionario){
		this.fechaNotificacionConcesionario=fechaNotificacionConcesionario;
	}

	public String getNroResolucion(){
		if(nroResolucion == null){
			return "-";
		}
		return nroResolucion;
	}

	public void setNroResolucion(String nroResolucion){
		this.nroResolucion=nroResolucion;
	}

	public String getSalaResolucion(){
		if(salaResolucion == null){
			if(sala == null){
				return "Sin sala asignada";
			}
			return sala;
		}
		return salaResolucion;
	}

	public void setSalaResolucion(String salaResolucion){
		this.salaResolucion=salaResolucion;
	}

	public String getResultado(){
		if(resultado == null){
			return "-";
		}
		return resultado;
	}

	public void setResultado(String resultado){
		this.resultado=resultado;
	}

	public String getFechaAprobacion(){
		if(fechaAprobacion == null){
			return "-";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaAprobacion);
	}

	public void setFechaAprobacion(Date fechaAprobacion){
		this.fechaAprobacion=fechaAprobacion;
	}

	public String getFechaCumplimiento(){
		if(fechaCumplimiento == null){
			return "-";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaCumplimiento);
	}

	public void setFechaCumplimiento(Date fechaCumplimiento){
		this.fechaCumplimiento=fechaCumplimiento;
	}
}
