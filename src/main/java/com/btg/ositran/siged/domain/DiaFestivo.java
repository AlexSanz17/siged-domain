package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="diafestivo")
@NamedQueries({@NamedQuery(name="Diafestivo.findAll",query="SELECT d FROM DiaFestivo d Order By d.fechanolaborable"),@NamedQuery(name="Diafestivo.findBydianolaborable",query="SELECT d FROM DiaFestivo d WHERE d.idregion.nombre=:nombreregion Order By d.fechanolaborable")})
public class DiaFestivo implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DIAFESTIVO_SEQ")
	@SequenceGenerator(name="DIAFESTIVO_SEQ",sequenceName="DIAFESTIVO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="iddiafestivo")
	private Integer iddiafestivo;
	@Column(name="dia")
	private String dia;
	@Column(name="mes")
	private String mes;
	@Column(name="anio")
	private String anio;
	@Column(name="motivo")
	private String motivo;
	@Basic(optional=false)
	@Column(name="fechanolaborable")
	@Temporal(TemporalType.DATE)
	private Date fechanolaborable;
	@JoinColumn(name="idregion",referencedColumnName="iddepartamento")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Departamento idregion;

	/*
	 * Constructors
	 */
	public DiaFestivo(){
	}

	public DiaFestivo(Integer iddiafestivo){
		this.iddiafestivo=iddiafestivo;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIddiafestivo(){
		return iddiafestivo;
	}

	public void setIddiafestivo(Integer iddiafestivo){
		this.iddiafestivo=iddiafestivo;
	}

	public String getDia(){
		return dia;
	}

	public void setDia(String dia){
		this.dia=dia;
	}

	public String getMes(){
		return mes;
	}

	public void setMes(String mes){
		this.mes=mes;
	}

	public String getAnio(){
		return anio;
	}

	public void setAnio(String anio){
		this.anio=anio;
	}

	public String getMotivo(){
		return motivo;
	}

	public void setMotivo(String motivo){
		this.motivo=motivo;
	}

	public Date getFechanolaborable(){
		return fechanolaborable;
	}

	public void setFechanolaborable(Date fechanolaborable){
		this.fechanolaborable=fechanolaborable;
	}

	public Departamento getIdregion(){
		return idregion;
	}

	public void setIdregion(Departamento idregion){
		this.idregion=idregion;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(iddiafestivo != null ? iddiafestivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof DiaFestivo)){
			return false;
		}
		DiaFestivo other=(DiaFestivo) object;
		if((this.iddiafestivo == null && other.iddiafestivo != null) || (this.iddiafestivo != null && !this.iddiafestivo.equals(other.iddiafestivo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "ID[" + iddiafestivo + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("dia","Nro de Dia No Laboral"));
		lstCamposAuditables.add(new AuditableCampo("mes","Mes de Ingreso No Laboral"));
		lstCamposAuditables.add(new AuditableCampo("anio","Agno Ingreso No Laboral"));
		lstCamposAuditables.add(new AuditableCampo("motivo","Descripcion de fecha No Laboral"));
		lstCamposAuditables.add(new AuditableCampo("fechanolaborable","Fecha No Laboral"));

		return lstCamposAuditables;
	}
}
