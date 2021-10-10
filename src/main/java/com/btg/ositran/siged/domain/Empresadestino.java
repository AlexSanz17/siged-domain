package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name="empresadestino")
@NamedQueries({@NamedQuery(name="Empresadestino.findAll",query="SELECT e FROM Empresadestino e"),@NamedQuery(name="Empresadestino.findByIdempresadestino",query="SELECT e FROM Empresadestino e WHERE e.idempresadestino = :idempresadestino"),@NamedQuery(name="Empresadestino.findByCodigo",query="SELECT e FROM Empresadestino e WHERE e.codigo = :codigo"),@NamedQuery(name="Empresadestino.findByNombre",query="SELECT e FROM Empresadestino e WHERE e.nombre = :nombre")})
public class Empresadestino implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EMPRESADESTINO_SEQ")
	@SequenceGenerator(name="EMPRESADESTINO_SEQ",sequenceName="EMPRESADESTINO_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idempresadestino")
	private Integer idempresadestino;
	@Column(name="codigo")
	private String codigo;
	@Column(name="nombre")
	private String nombre;
	@OneToMany(mappedBy="idempresadestino")
	private List<Datos> datosCollection;

	public Empresadestino(){
		nombre="";
	}

	public Empresadestino(Integer idempresadestino){
		this.idempresadestino=idempresadestino;
	}

	public Integer getIdempresadestino(){
		return idempresadestino;
	}

	public void setIdempresadestino(Integer idempresadestino){
		this.idempresadestino=idempresadestino;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public List<Datos> getDatosCollection(){
		return datosCollection;
	}

	public void setDatosCollection(List<Datos> datosCollection){
		this.datosCollection=datosCollection;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idempresadestino != null ? idempresadestino.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Empresadestino)){
			return false;
		}
		Empresadestino other=(Empresadestino) object;
		if((this.idempresadestino == null && other.idempresadestino != null) || (this.idempresadestino != null && !this.idempresadestino.equals(other.idempresadestino))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Empresadestino[idempresadestino=" + idempresadestino + "]";
	}
}
