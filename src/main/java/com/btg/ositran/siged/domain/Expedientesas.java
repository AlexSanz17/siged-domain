package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="expedientesas")
@NamedQueries({@NamedQuery(name="Expedientesas.findAll",query="SELECT e FROM Expedientesas e"),@NamedQuery(name="Expedientesas.findByIdexpediente",query="SELECT e FROM Expedientesas e WHERE e.idexpediente = :idexpediente")})
public class Expedientesas implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@Basic(optional=false)
	@Column(name="idexpediente")
	private Integer idexpediente;
	@JoinColumn(name="idusuario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario idusuario;
	@JoinColumn(name="idexpediente",referencedColumnName="idexpediente",insertable=false,updatable=false)
	@OneToOne(optional=false)
	private Expediente expediente;
	@JoinColumn(name="idunidad",referencedColumnName="idunidad")
	@ManyToOne(optional=false)
	private Unidad idunidad;
	@JoinColumn(name="idprocedimiento",referencedColumnName="idprocedimiento")
	@ManyToOne(optional=true)
	private Procedimiento procedimiento;
	@JoinColumn(name="analista",referencedColumnName="idusuario")
	@ManyToOne(optional=true)
	private Usuario analista;
	@Column(name="idtrazabilidad")
	private Integer idtrazabilidad;
	@Column(name="fechaampd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaampd;
	@Column(name="observaciondesc")
	private String observaciondesc;
	@Column(name="fechacargoficio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacargoficio;

	public Expedientesas(){
	}

	public Integer getIdtrazabilidad(){
		return idtrazabilidad;
	}

	public void setIdtrazabilidad(Integer idtrazabilidad){
		this.idtrazabilidad=idtrazabilidad;
	}

	public Date getFechaampd(){
		return fechaampd;
	}

	public void setFechaampd(Date fechaampd){
		this.fechaampd=fechaampd;
	}

	public String getObservaciondesc(){
		return observaciondesc;
	}

	public void setObservaciondesc(String observaciondesc){
		this.observaciondesc=observaciondesc;
	}

	public Usuario getAnalista(){
		return analista;
	}

	public void setAnalista(Usuario analista){
		this.analista=analista;
	}

	public Procedimiento getProcedimiento(){
		return procedimiento;
	}

	public void setProcedimiento(Procedimiento procedimiento){
		this.procedimiento=procedimiento;
	}

	public Expedientesas(Integer idexpediente){
		this.idexpediente=idexpediente;
	}

	public Integer getIdexpediente(){
		return idexpediente;
	}

	public void setIdexpediente(Integer idexpediente){
		this.idexpediente=idexpediente;
	}

	public Usuario getIdusuario(){
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario){
		this.idusuario=idusuario;
	}

	public Expediente getExpediente(){
		return expediente;
	}

	public void setExpediente(Expediente expediente){
		this.expediente=expediente;
	}

	public Unidad getIdunidad(){
		return idunidad;
	}

	public void setIdunidad(Unidad idunidad){
		this.idunidad=idunidad;
	}

	public Date getFechacargoficio(){
		return fechacargoficio;
	}

	public void setFechacargoficio(Date fechacargoficio){
		this.fechacargoficio=fechacargoficio;
	}

	public int hashCode(){
		int hash=0;
		hash+=(idexpediente != null ? idexpediente.hashCode() : 0);
		return hash;
	}

	public boolean equals(Object object){

		if(!(object instanceof Expedientesas)){
			return false;
		}
		Expedientesas other=(Expedientesas) object;
		if((this.idexpediente == null && other.idexpediente != null) || (this.idexpediente != null && !this.idexpediente.equals(other.idexpediente))){
			return false;
		}
		return true;
	}
}