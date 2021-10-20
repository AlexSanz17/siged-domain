package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="modulo")
@NamedQueries({@NamedQuery(name="Modulo.findAll",query="SELECT m FROM Modulo m order by nombre"),@NamedQuery(name="Modulo.findModulosActivos",query="SELECT m FROM Modulo m WHERE m.estado=:estado order by nombre"),@NamedQuery(name="Modulo.findByIdmodulo",query="SELECT m FROM Modulo m WHERE m.idmodulo = :idmodulo"),@NamedQuery(name="Modulo.findByNombre",query="SELECT m FROM Modulo m WHERE m.nombre = :nombre"),@NamedQuery(name="Modulo.findByDescripcion",query="SELECT m FROM Modulo m WHERE m.descripcion = :descripcion"),@NamedQuery(name="Modulo.findByEstado",query="SELECT m FROM Modulo m WHERE m.estado = :estado order by nombre")})
public class Modulo implements Serializable,Auditable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="MODULO_SEQ")
	//@SequenceGenerator(name="MODULO_SEQ",sequenceName="MODULO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idmodulo")
	private Integer idmodulo;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmodulo") private
	 * List<Recurso> recursoList;
	 */

	/*
	 * Constructors
	 */
	public Modulo(){
	}

	public Modulo(Integer idmodulo){
		this.idmodulo=idmodulo;
	}

	public Modulo(Integer idmodulo,String nombre,char estado){
		this.idmodulo=idmodulo;
		this.nombre=nombre;
		this.estado=estado;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdmodulo(){
		return idmodulo;
	}

	public void setIdmodulo(Integer idmodulo){
		this.idmodulo=idmodulo;
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

	/*
	 * public List<Recurso> getRecursoList() { return recursoList; }
	 * 
	 * public void setRecursoList(List<Recurso> recursoList) { this.recursoList
	 * = recursoList; }
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idmodulo != null ? idmodulo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Modulo)){
			return false;
		}
		Modulo other=(Modulo) object;
		if((this.idmodulo == null && other.idmodulo != null) || (this.idmodulo != null && !this.idmodulo.equals(other.idmodulo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nombre + "]";
	}

	/*
	 * Auditoria
	 */
	public List<AuditableCampo> getCamposAuditables(){
		List<AuditableCampo> lstCamposAuditables=new ArrayList<AuditableCampo>();

		lstCamposAuditables.add(new AuditableCampo("nombre","Nombre"));

		return lstCamposAuditables;
	}
}
