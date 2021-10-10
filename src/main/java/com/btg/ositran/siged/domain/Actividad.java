package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="actividad")
@NamedQueries({@NamedQuery(name="Actividad.findByCodigo",query="SELECT a FROM Actividad a WHERE a.codigo = :codigo")})
public class Actividad implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ACTIVIDAD_SEQ")
	@SequenceGenerator(name="ACTIVIDAD_SEQ",sequenceName="ACTIVIDAD_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idactividad")
	private Integer idActividad;

	@Basic(optional=false)
	private String nombre;

	@Basic(optional=false)
	private String codigo;

	private Integer duracion;

	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@Basic(optional=false)
	private char estado;

        
	@JoinColumn(name="idproceso",referencedColumnName="idproceso")
	@ManyToOne
	private Proceso proceso;
        
	@JoinTable(name="recursoxactividad",joinColumns={@JoinColumn(name="idactividad",referencedColumnName="idactividad")},inverseJoinColumns={@JoinColumn(name="idrecurso",referencedColumnName="idrecurso")})
	@ManyToMany
	private List<Recurso> recursos;

	public Actividad(){
	}

	public Actividad(Integer idactividad){
		this.idActividad=idactividad;
	}

	public Actividad(Integer idactividad,String nombre,String codigo,Date fechacreacion,char estado){
		this.idActividad=idactividad;
		this.nombre=nombre;
		this.codigo=codigo;
		this.fechacreacion=fechacreacion;
		this.estado=estado;
	}

	public Integer getIdActividad(){
		return idActividad;
	}

	public void setIdActividad(Integer idactividad){
		this.idActividad=idactividad;
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

	public Integer getDuracion(){
		return duracion;
	}

	public void setDuracion(Integer duracion){
		this.duracion=duracion;
	}

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
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

	public List<Recurso> getRecursos(){
		return recursos;
	}

	public void setRecursos(List<Recurso> recursoList){
		this.recursos=recursoList;
	}

        
	public Proceso getProceso(){
		return proceso;
	}

	public void setProceso(Proceso proceso){
		this.proceso=proceso;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idActividad != null ? idActividad.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof Actividad)){
			return false;
		}
		Actividad other=(Actividad) object;
		if((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Actividad[actividad=" + this.nombre + "]";
	}

}
