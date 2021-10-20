package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="recibidofisico")
@NamedQueries({@NamedQuery(name="Recibidofisico.findAll",query="SELECT r FROM Recibidofisico r"),@NamedQuery(name="Recibidofisico.findByIdrecibidofisico",query="SELECT r FROM Recibidofisico r WHERE r.idrecibidofisico = :idrecibidofisico"),@NamedQuery(name="Recibidofisico.findByNroregistro",query="SELECT r FROM Recibidofisico r WHERE r.nroregistro = :nroregistro"),@NamedQuery(name="Recibidofisico.findByFechaenvio",query="SELECT r FROM Recibidofisico r WHERE r.fechaenvio = :fechaenvio"),@NamedQuery(name="Recibidofisico.findByFecharegistro",query="SELECT r FROM Recibidofisico r WHERE r.fecharegistro = :fecharegistro")})
public class Recibidofisico implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RECIBIDOFISICO_SEQ")
	//@SequenceGenerator(name="RECIBIDOFISICO_SEQ",sequenceName="RECIBIDOFISICO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idrecibidofisico")
	private Integer idrecibidofisico;
	@Basic(optional=false)
	@Column(name="nroregistro")
	private int nroregistro;
	@Lob
	@Column(name="observacion")
	private String observacion;
	@Basic(optional=false)
	@Column(name="fechaenvio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaenvio;
	@Column(name="fecharegistro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecharegistro;
	@JoinColumn(name="idusuario",referencedColumnName="idusuario")
	@ManyToOne(optional=false)
	private Usuario idusuario;

	public Recibidofisico(){
	}

	public Recibidofisico(Integer idrecibidofisico){
		this.idrecibidofisico=idrecibidofisico;
	}

	public Recibidofisico(Integer idrecibidofisico,int nroregistro,Date fechaenvio){
		this.idrecibidofisico=idrecibidofisico;
		this.nroregistro=nroregistro;
		this.fechaenvio=fechaenvio;
	}

	public Integer getIdrecibidofisico(){
		return idrecibidofisico;
	}

	public void setIdrecibidofisico(Integer idrecibidofisico){
		this.idrecibidofisico=idrecibidofisico;
	}

	public int getNroregistro(){
		return nroregistro;
	}

	public void setNroregistro(int nroregistro){
		this.nroregistro=nroregistro;
	}

	public void setNroregistro(Integer nroregistro){
		if(nroregistro != null){
			this.nroregistro=nroregistro;
		}
	}

	public String getObservacion(){
		return observacion;
	}

	public void setObservacion(String observacion){
		this.observacion=observacion;
	}

	public Date getFechaenvio(){
		return fechaenvio;
	}

	public void setFechaenvio(Date fechaenvio){
		this.fechaenvio=fechaenvio;
	}

	public Date getFecharegistro(){
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro){
		this.fecharegistro=fecharegistro;
	}

	public Usuario getIdusuario(){
		return idusuario;
	}

	public void setIdusuario(Usuario idusuario){
		this.idusuario=idusuario;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idrecibidofisico != null ? idrecibidofisico.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Recibidofisico)){
			return false;
		}
		Recibidofisico other=(Recibidofisico) object;
		if((this.idrecibidofisico == null && other.idrecibidofisico != null) || (this.idrecibidofisico != null && !this.idrecibidofisico.equals(other.idrecibidofisico))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Recibidofisico[idrecibidofisico=" + idrecibidofisico + "]";
	}
}
