package com.btg.ositran.siged.domain;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/*DUMMY*/
@Entity
@Table(name="reporteuno")
@NamedQueries({@NamedQuery(name="FilaRDetalleProceso.reporteInicialDetalle",query="SELECT f FROM FilaRDetalleProceso f")})
public class FilaRDetalleProceso implements Serializable{
	private static final long serialVersionUID=1L;

	/**
	 * @return the serialVersionUID
	 */

	public static long getSerialVersionUID(){
		return serialVersionUID;
	}

	/*
	 * @Id
	 * 
	 * @Column(name="IDTRAZABILIDADEXPEDIENTE") int idtrazabilidadexpediente;
	 */
	@Column(name="EGRUPOPROCESO")
	private String grupoproceso;
	@Column(name="EPROCESO")
	private String proceso;
	@Column(name="ENROEXPEDIENTE")
	private String expediente;
	@Column(name="EFECHAEXPEDIENTE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaexpediente;
	@Column(name="ECLIENTE")
	private String cliente;
	// NUEVOS
	@Column(name="ENOMBREP")
	private String nombrep;
	@Column(name="ENOMBREM")
	private String nombrem;
	@Column(name="ENOMBREN")
	private String nombren;
	// NUEVOS
	@Column(name="EASUNTO")
	private String asunto;
	@Column(name="EESTADO")
	private String estado;
	@Column(name="PROPIETARIO")
	private String propietario;
	@Column(name="REMITENTE")
	private String remitente;
	@Column(name="DESTINATARIO")
	private String destinatario;
	@Id
	@Column(name="FECHACREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharecibido;
	@Transient
	private Long tiempoatencion;
	@Transient
	private String responsable;

	/*
	 * @Column(name = "FECHARECIBIDO")
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private Date fecharecibido;
	 * 
	 * @Column(name = "FECHALIMITEATENCION")
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private Date fechalimiteatencion;
	 */
	/**
	 * @return the proceso
	 */
	public String getProceso(){
		return proceso;
	}

	/**
	 * @param proceso
	 *            the proceso to set
	 */
	public void setProceso(String proceso){
		this.proceso=proceso;
	}

	/**
	 * @return the nroexpediente
	 */
	public String getExpediente(){
		return expediente;
	}

	/**
	 * @param nroexpediente
	 *            the nroexpediente to set
	 */
	public void setExpediente(String expediente){
		this.expediente=expediente;
	}

	public String getFechaexpediente(){
		if(fechaexpediente == null){
			return "";
		}
		SimpleDateFormat fechita=new SimpleDateFormat("dd-MM-yyyy");
		return fechita.format(fechaexpediente);
	}

	public void setFechaexpediente(Date fechaexpediente){
		this.fechaexpediente=fechaexpediente;
	}

	/**
	 * @return the razonsocial
	 */
	public String getCliente(){
		if(cliente != null){
			return cliente;
		}
		return nombrep + " " + nombrem + " " + nombren;
	}

	/**
	 * @param razonsocial
	 *            the razonsocial to set
	 */
	public void setCliente(String razonsocial){
		this.cliente=razonsocial;
	}

	/**
	 * @return the asunto
	 */
	public String getAsunto(){
		return asunto;
	}

	/**
	 * @param asunto
	 *            the asunto to set
	 */
	public void setAsunto(String asunto){
		this.asunto=asunto;
	}

	/**
	 * @return the estado
	 */
	public String getEstado(){
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(String estado){
		this.estado=estado;
	}

	public String getPropietario(){
		return propietario;
	}

	public void setPropietario(String usuario){
		this.propietario=usuario;
	}

	public void setFecharecibido(Date fecharecibido){
		this.fecharecibido=fecharecibido;
	}

	public void setNombrep(String nombrep){
		this.nombrep=nombrep;
	}

	public void setNombrem(String nombrem){
		this.nombrem=nombrem;
	}

	public void setNombren(String nombren){
		this.nombren=nombren;
	}

	public String getGrupoproceso(){
		return grupoproceso;
	}

	public void setGrupoproceso(String grupoproceso){
		this.grupoproceso=grupoproceso;
	}

	/*
	 * public long getTiempoatencionLong() { /**BORRAR ESTO CUANDO HAYA DATA*
	 */
	// fecharecibido=fechaexpediente;
	/********************************/
	/*
	 * if((fechalimiteatencion==null)||(fecharecibido==null)){ return 0L; }
	 * return fechalimiteatencion.getTime()-fecharecibido.getTime(); }
	 */
	public String getTiempoatencion(){
		if((tiempoatencion == null) || (tiempoatencion < 0)){
			return "TBA";
		}
		String tiempo="";
		int d,h,m;
		Long milisegundos=tiempoatencion;
		h=(int) (milisegundos / 3600000);
		m=(int) ((milisegundos % 3600000) / 60000);
		if(h > 24){
			d=h / 24;
			h=h % 24;
			tiempo=Integer.toString(d) + "d ";
		}
		tiempo+=Integer.toString(h) + ":";
		if(m == 0){
			tiempo+="00";
		}
		else{
			if(m < 10){
				tiempo+="0" + Integer.toString(m);
			}
			else{
				tiempo+=Integer.toString(m);
			}
		}
		return tiempo;

	}

	public void setResponsable(String responsable){
		this.responsable=responsable;
	}

	public String getResponsable(){
		if(responsable == null){
			return "Expediente nuevo";
		}
		return responsable;
	}

	/*
	 * public int getIdtrazabilidadexpediente() { try{ return
	 * idtrazabilidadexpediente; }catch (NullPointerException e){ return 0; }
	 * 
	 * }
	 * 
	 * public void setIdtrazabilidadexpediente(int idtrazabilidadexpediente) {
	 * this.idtrazabilidadexpediente = idtrazabilidadexpediente; }
	 */
	public Date getFecharecibido(){
		return fecharecibido;
	}

	public void setTiempoatencion(Long tiempoatencion){
		this.tiempoatencion=tiempoatencion;
	}

	public long getTiempo(){
		if(tiempoatencion == null){
			return 0l;
		}
		return tiempoatencion;
	}

	public String getRemitente(){
		return remitente;
	}

	public void setRemitente(String remitente){
		this.remitente=remitente;
	}

	public String getDestinatario(){
		return destinatario;
	}

	public void setDestinatario(String destinatario){
		this.destinatario=destinatario;
	}

}
