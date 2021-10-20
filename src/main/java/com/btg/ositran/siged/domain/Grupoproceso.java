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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="GRUPOPROCESO")
@NamedQueries({@NamedQuery(name="Grupoproceso.findAll",query="SELECT g FROM Grupoproceso g WHERE g.estado = 'A'"),@NamedQuery(name="Grupoproceso.findByIdgrupoproceso",query="SELECT g FROM Grupoproceso g WHERE g.idgrupoproceso = :idgrupoproceso"),@NamedQuery(name="Grupoproceso.findByNombre",query="SELECT g FROM Grupoproceso g WHERE g.nombre = :nombre"),@NamedQuery(name="Grupoproceso.findByCodigo",query="SELECT g FROM Grupoproceso g WHERE g.codigo = :codigo"),@NamedQuery(name="Grupoproceso.findByDescripcion",query="SELECT g FROM Grupoproceso g WHERE g.descripcion = :descripcion"),@NamedQuery(name="Grupoproceso.findByFechacreacion",query="SELECT g FROM Grupoproceso g WHERE g.fechacreacion = :fechacreacion"),@NamedQuery(name="Grupoproceso.findByEstado",query="SELECT g FROM Grupoproceso g WHERE g.estado = :estado")})
public class Grupoproceso implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="GRUPOPROCESO_SEQ")
	//@SequenceGenerator(name="GRUPOPROCESO_SEQ",sequenceName="GRUPOPROCESO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="IDGRUPOPROCESO")
	private Integer idgrupoproceso;
	@Basic(optional=false)
	@Column(name="NOMBRE")
	private String nombre;
	@Basic(optional=false)
	@Column(name="CODIGO")
	private String codigo;
	@Column(name="DESCRIPCION")
	private String descripcion;
	@Column(name="FECHACREACION")
	@Temporal(TemporalType.DATE)
	private Date fechacreacion;
	@Column(name="ESTADO")
	private Character estado;
	@OneToMany(mappedBy="idgrupoproceso")
	private List<Numeracionexpediente> numeracionexpedienteList;
	@OneToMany(mappedBy="idgrupoproceso")
	private List<Proceso> procesoList;

	public Grupoproceso(){
	}

	public Grupoproceso(Integer idgrupoproceso){
		this.idgrupoproceso=idgrupoproceso;
	}

	public Grupoproceso(Integer idgrupoproceso,String nombre,String codigo){
		this.idgrupoproceso=idgrupoproceso;
		this.nombre=nombre;
		this.codigo=codigo;
	}

	public Integer getIdgrupoproceso(){
		return idgrupoproceso;
	}

	public void setIdgrupoproceso(Integer idgrupoproceso){
		this.idgrupoproceso=idgrupoproceso;
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

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
	}

	public Character getEstado(){
		return estado;
	}

	public void setEstado(Character estado){
		this.estado=estado;
	}

	public List<Numeracionexpediente> getNumeracionexpedienteList(){
		return numeracionexpedienteList;
	}

	public void setNumeracionexpedienteList(List<Numeracionexpediente> numeracionexpedienteList){
		this.numeracionexpedienteList=numeracionexpedienteList;
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
		hash+=(idgrupoproceso != null ? idgrupoproceso.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Grupoproceso)){
			return false;
		}
		Grupoproceso other=(Grupoproceso) object;
		if((this.idgrupoproceso == null && other.idgrupoproceso != null) || (this.idgrupoproceso != null && !this.idgrupoproceso.equals(other.idgrupoproceso))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Grupoproceso[idgrupoproceso=" + idgrupoproceso + "]";
	}
}
