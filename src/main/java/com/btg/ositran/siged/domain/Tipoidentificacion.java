package com.btg.ositran.siged.domain;

import java.io.Serializable;
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
@Table(name="tipoidentificacion")
@NamedQueries({@NamedQuery(name="Tipoidentificacion.findAll",query="SELECT t FROM Tipoidentificacion t"),@NamedQuery(name="Tipoidentificacion.findByIdtipoidentificacion",query="SELECT t FROM Tipoidentificacion t WHERE t.idtipoidentificacion = :idtipoidentificacion"),@NamedQuery(name="Tipoidentificacion.findByNombre",query="SELECT t FROM Tipoidentificacion t WHERE t.nombre = :nombre"),@NamedQuery(name="Tipoidentificacion.findByDescripcion",query="SELECT t FROM Tipoidentificacion t WHERE t.descripcion = :descripcion")})
public class Tipoidentificacion implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPOIDENTIFICACION_SEQ")
	@SequenceGenerator(name="TIPOIDENTIFICACION_SEQ",sequenceName="TIPOIDENTIFICACION_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtipoidentificacion")
	private Integer idtipoidentificacion;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;

	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoIdentificacion")
	 * private List<Cliente> clienteList;
	 */

	/*
	 * Constructors
	 */
	public Tipoidentificacion(){
	}

	public Tipoidentificacion(Integer idtipoidentificacion){
		this.idtipoidentificacion=idtipoidentificacion;
	}

	public Tipoidentificacion(Integer idtipoidentificacion,String nombre){
		this.idtipoidentificacion=idtipoidentificacion;
		this.nombre=nombre;
	}

	/*
	 * Getters & Setters
	 */
	public Integer getIdtipoidentificacion(){
		return idtipoidentificacion;
	}

	public void setIdtipoidentificacion(Integer idtipoidentificacion){
		this.idtipoidentificacion=idtipoidentificacion;
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

	/*
	 * public List<Cliente> getClienteList() { return clienteList; }
	 * 
	 * public void setClienteList(List<Cliente> clienteList) { this.clienteList
	 * = clienteList; }
	 */
	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtipoidentificacion != null ? idtipoidentificacion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tipoidentificacion)){
			return false;
		}
		Tipoidentificacion other=(Tipoidentificacion) object;
		if((this.idtipoidentificacion == null && other.idtipoidentificacion != null) || (this.idtipoidentificacion != null && !this.idtipoidentificacion.equals(other.idtipoidentificacion))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nombre + "]";
	}
}
