package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="procedimientoincumplido")
@NamedQueries({@NamedQuery(name="Procedimientoincumplido.findAll",query="SELECT p FROM Procedimientoincumplido p"),@NamedQuery(name="Procedimientoincumplido.findByIdprocedimientoincumplido",query="SELECT p FROM Procedimientoincumplido p WHERE p.idprocedimientoincumplido = :idprocedimientoincumplido"),@NamedQuery(name="Procedimientoincumplido.findByNombre",query="SELECT p FROM Procedimientoincumplido p WHERE p.nombre = :nombre"),@NamedQuery(name="Procedimientoincumplido.findByDescripcion",query="SELECT p FROM Procedimientoincumplido p WHERE p.descripcion = :descripcion"),@NamedQuery(name="Procedimientoincumplido.findByEstado",query="SELECT p FROM Procedimientoincumplido p WHERE p.estado = :estado")})
public class Procedimientoincumplido implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PROCEDIMIENTOINCUMPLIDO_SEQ")
	@SequenceGenerator(name="PROCEDIMIENTOINCUMPLIDO_SEQ",sequenceName="PROCEDIMIENTOINCUMPLIDO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idprocedimientoincumplido")
	private Integer idprocedimientoincumplido;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@JoinTable(name="expedientexprocincumplido",joinColumns={@JoinColumn(name="idprocedimientoincumplido",referencedColumnName="idprocedimientoincumplido")},inverseJoinColumns={@JoinColumn(name="idexpediente",referencedColumnName="idexpediente")})
	@ManyToMany
	private List<Expediente> expedienteList;

	public Procedimientoincumplido(){
	}

	public Procedimientoincumplido(Integer idprocedimientoincumplido){
		this.idprocedimientoincumplido=idprocedimientoincumplido;
	}

	public Procedimientoincumplido(Integer idprocedimientoincumplido,String nombre,char estado){
		this.idprocedimientoincumplido=idprocedimientoincumplido;
		this.nombre=nombre;
		this.estado=estado;
	}

	public Integer getIdprocedimientoincumplido(){
		return idprocedimientoincumplido;
	}

	public void setIdprocedimientoincumplido(Integer idprocedimientoincumplido){
		this.idprocedimientoincumplido=idprocedimientoincumplido;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public char getEstado(){
		return estado;
	}

	public void setEstado(char estado){
		this.estado=estado;
	}

	public void setEstado(Character estado){
		if(estado != null){
			this.estado=estado;
		}
	}

	public List<Expediente> getExpedienteList(){
		return expedienteList;
	}

	public void setExpedienteList(List<Expediente> expedienteList){
		this.expedienteList=expedienteList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idprocedimientoincumplido != null ? idprocedimientoincumplido.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Procedimientoincumplido)){
			return false;
		}
		Procedimientoincumplido other=(Procedimientoincumplido) object;
		if((this.idprocedimientoincumplido == null && other.idprocedimientoincumplido != null) || (this.idprocedimientoincumplido != null && !this.idprocedimientoincumplido.equals(other.idprocedimientoincumplido))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Procedimientoincumplido[idprocedimientoincumplido=" + idprocedimientoincumplido + "]";
	}
}
