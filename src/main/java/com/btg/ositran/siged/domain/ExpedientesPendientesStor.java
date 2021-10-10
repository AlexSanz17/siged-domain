package com.btg.ositran.siged.domain;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Transient;

@Entity
@Table(name="expedientespendientesstor")
public class ExpedientesPendientesStor implements Serializable{
	private static final long serialVersionUID=1L;

	public static long getSerialVersionUID(){
		return serialVersionUID;
	}

	/**************************************************/
	@Id
	@Column(name="NROEXPEDIENTE")
	private String expediente;
	@Column(name="FECHAULTIMOMOVIMIENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaUltimoMovimiento;
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
	@Column(name="PROPIETARIO")
	private String propietario;
	@Column(name="MOTIVO")
	private String motivo;
	/************ SIN DATA ***************/
	@Transient
	private long diasTranscurridos;

	/***********************************/
	public String getAnio(){
		if(fechaCreacionExpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("yyyy");
		return fechita.format(fechaUltimoMovimiento);
	}

	/*
	 * public void setAnio(String anio) { this.anio = anio; }
	 */
	public String getMesIngreso(){
		if(fechaCreacionExpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("MMM-yy");
		return fechita.format(fechaCreacionExpediente);
	}

	/*
	 * public void setMesIngreso(String mesIngreso) { this.mesIngreso =
	 * mesIngreso; }
	 */
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

	/****************************************/

	/****************************************/
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

	public static long getSerialversionuid(){
		return serialVersionUID;
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

	public String getFechaultimomovimiento(){
		if(fechaUltimoMovimiento == null){
			return "En mesa de partes";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaUltimoMovimiento);
	}

	public void setFechaultimomovimiento(Date fechaultimomovimiento){
		this.fechaUltimoMovimiento=fechaultimomovimiento;
	}

	/*
	 * public String getDiasTranscurridos(){ long diasTrans; diasTrans =
	 * (System.currentTimeMillis() -
	 * fechaCreacionExpediente.getTime())/86400000l; return
	 * Long.valueOf(diasTrans).toString(); }
	 */

	public String getDiasTranscurridos(){
		return diasTranscurridos(diasTranscurridos);
	}

	public void setDiasTranscurridos(long diasTranscurridos){
		this.diasTranscurridos=diasTranscurridos;
	}

	public Date getFechaCreacionDate(){
		return this.fechaCreacionExpediente;
	}

	public Date getFechaUltimoMovimientoDate(){
		return this.fechaUltimoMovimiento;
	}

	private String diasTranscurridos(long milisegundos){
		if(milisegundos < 0){
			return "TBA";
		}
		int d,h;
		h=(int) (milisegundos / 3600000);
		if(h > 24){
			d=h / 24;
			return Integer.toString(d);
		}
		return aString(milisegundos);
	}

	private String aString(long milisegundos){
		if(milisegundos < 0){
			return "TBA";
		}
		String tmp="";
		int d,h,m;
		h=(int) (milisegundos / 3600000);
		m=(int) ((milisegundos % 3600000) / 60000);
		if(h > 24){
			d=h / 24;
			h=h % 24;
			tmp=Integer.toString(d) + "d ";
		}
		tmp+=Integer.toString(h) + ":";
		if(m == 0){
			tmp+="00";
		}
		else{
			if(m < 10){
				tmp+="0" + Integer.toString(m);
			}
			else{
				tmp+=Integer.toString(m);
			}
		}
		if(tmp.equals("0:00")){
			tmp=Long.toString((milisegundos % 60000) / 1000) + "s";
		}
		return tmp;
	}
}
