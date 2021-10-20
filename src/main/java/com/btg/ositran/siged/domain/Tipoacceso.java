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
@Table(name="tipoacceso")
@NamedQueries({@NamedQuery(name="Tipoacceso.findAll",query="SELECT t FROM Tipoacceso t order by nombre"),@NamedQuery(name="Tipoacceso.findByIdtipoacceso",query="SELECT t FROM Tipoacceso t WHERE t.idtipoacceso = :idtipoacceso order by nombre"),@NamedQuery(name="Tipoacceso.findByNombre",query="SELECT t FROM Tipoacceso t WHERE t.nombre = :nombre"),@NamedQuery(name="Tipoacceso.findByCodigo",query="SELECT t FROM Tipoacceso t WHERE t.codigo = :codigo"),@NamedQuery(name="Tipoacceso.findByDescripcion",query="SELECT t FROM Tipoacceso t WHERE t.descripcion = :descripcion"),@NamedQuery(name="Tipoacceso.findByEstado",query="SELECT t FROM Tipoacceso t WHERE t.estado = :estado order by nombre")})
public class Tipoacceso implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TIPOACCESO_SEQ")
	//@SequenceGenerator(name="TIPOACCESO_SEQ",sequenceName="TIPOACCESO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idtipoacceso")
	private Integer idtipoacceso;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Basic(optional=false)
	@Column(name="codigo")
	private String codigo;
	@Column(name="descripcion")
	private String descripcion;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idtipoacceso")
	private List<Proceso> procesoList;

	public Tipoacceso(){
	}

	public Tipoacceso(Integer idtipoacceso){
		this.idtipoacceso=idtipoacceso;
	}

	public Tipoacceso(Integer idtipoacceso,String nombre,String codigo,char estado){
		this.idtipoacceso=idtipoacceso;
		this.nombre=nombre;
		this.codigo=codigo;
		this.estado=estado;
	}

	public Integer getIdtipoacceso(){
		return idtipoacceso;
	}

	public void setIdtipoacceso(Integer idtipoacceso){
		this.idtipoacceso=idtipoacceso;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
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

	public List<Proceso> getProcesoList(){
		return procesoList;
	}

	public void setProcesoList(List<Proceso> procesoList){
		this.procesoList=procesoList;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idtipoacceso != null ? idtipoacceso.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Tipoacceso)){
			return false;
		}
		Tipoacceso other=(Tipoacceso) object;
		if((this.idtipoacceso == null && other.idtipoacceso != null) || (this.idtipoacceso != null && !this.idtipoacceso.equals(other.idtipoacceso))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.nombre + "]";
	}
}
