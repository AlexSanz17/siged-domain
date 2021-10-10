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
@Table(name="procedimiento")
@NamedQueries({@NamedQuery(name="Procedimiento.findAll",query="SELECT p FROM Procedimiento p"),@NamedQuery(name="Procedimiento.findByIdprocedimiento",query="SELECT p FROM Procedimiento p WHERE p.idprocedimiento = :idprocedimiento"),@NamedQuery(name="Procedimiento.findByNombre",query="SELECT p FROM Procedimiento p WHERE p.nombre = :nombre"),@NamedQuery(name="Procedimiento.findByDescripcion",query="SELECT p FROM Procedimiento p WHERE p.descripcion = :descripcion"),@NamedQuery(name="Procedimiento.findByEstado",query="SELECT p FROM Procedimiento p WHERE p.estado = :estado")})
public class Procedimiento implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PROCEDIMIENTO_SEQ")
	@SequenceGenerator(name="PROCEDIMIENTO_SEQ",sequenceName="PROCEDIMIENTO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idprocedimiento")
	private Integer idprocedimiento;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@JoinTable(name="unidadxprocedimiento",joinColumns={@JoinColumn(name="idprocedimiento",referencedColumnName="idprocedimiento")},inverseJoinColumns={@JoinColumn(name="idunidad",referencedColumnName="idunidad")})
	@ManyToMany
	private List<Unidad> unidadList;

	public Procedimiento(){
	}

	public Procedimiento(Integer idprocedimiento){
		this.idprocedimiento=idprocedimiento;
	}

	public Procedimiento(Integer idprocedimiento,String nombre,char estado){
		this.idprocedimiento=idprocedimiento;
		this.nombre=nombre;
		this.estado=estado;
	}

	public Integer getIdprocedimiento(){
		return idprocedimiento;
	}

	public void setIdprocedimiento(Integer idprocedimiento){
		this.idprocedimiento=idprocedimiento;
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

	public List<Unidad> getUnidadList(){
		return unidadList;
	}

	public void setUnidadList(List<Unidad> unidadList){
		this.unidadList=unidadList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idprocedimiento != null ? idprocedimiento.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Procedimiento)){
			return false;
		}
		Procedimiento other=(Procedimiento) object;
		if((this.idprocedimiento == null && other.idprocedimiento != null) || (this.idprocedimiento != null && !this.idprocedimiento.equals(other.idprocedimiento))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Procedimiento[procedimiento=" + this.nombre + "]";
	}
}
