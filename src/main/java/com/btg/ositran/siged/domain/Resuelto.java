package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="resuelto")
@NamedQueries({@NamedQuery(name="Resuelto.findAll",query="SELECT r FROM Resuelto r"),@NamedQuery(name="Resuelto.findByIdresuelto",query="SELECT r FROM Resuelto r WHERE r.idresuelto = :idresuelto"),@NamedQuery(name="Resuelto.findByNombre",query="SELECT r FROM Resuelto r WHERE r.nombre = :nombre"),@NamedQuery(name="Resuelto.findByDescripcion",query="SELECT r FROM Resuelto r WHERE r.descripcion = :descripcion"),@NamedQuery(name="Resuelto.findByEstado",query="SELECT r FROM Resuelto r WHERE r.estado = :estado")})
public class Resuelto implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RESUELTO_SEQ")
	//@SequenceGenerator(name="RESUELTO_SEQ",sequenceName="RESUELTO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idresuelto")
	private Integer idresuelto;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="resuelto")
	private List<Resueltoxdocumento> resueltoxdocumentoList;

	public Resuelto(){
	}

	public Resuelto(Integer idresuelto){
		this.idresuelto=idresuelto;
	}

	public Resuelto(Integer idresuelto,String nombre,char estado){
		this.idresuelto=idresuelto;
		this.nombre=nombre;
		this.estado=estado;
	}

	public Integer getIdresuelto(){
		return idresuelto;
	}

	public void setIdresuelto(Integer idresuelto){
		this.idresuelto=idresuelto;
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

	public List<Resueltoxdocumento> getResueltoxdocumentoList(){
		return resueltoxdocumentoList;
	}

	public void setResueltoxdocumentoList(List<Resueltoxdocumento> resueltoxdocumentoList){
		this.resueltoxdocumentoList=resueltoxdocumentoList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idresuelto != null ? idresuelto.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Resuelto)){
			return false;
		}
		Resuelto other=(Resuelto) object;
		if((this.idresuelto == null && other.idresuelto != null) || (this.idresuelto != null && !this.idresuelto.equals(other.idresuelto))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Resuelto[idresuelto=" + idresuelto + "]";
	}
}
