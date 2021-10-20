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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="etapa")
@NamedQueries({@NamedQuery(name="Etapa.findAll",query="SELECT e FROM Etapa e where e.codigo is not null"),@NamedQuery(name="Etapa.findByIdetapa",query="SELECT e FROM Etapa e WHERE e.idetapa = :idetapa"),@NamedQuery(name="Etapa.findByDescripcion",query="SELECT e FROM Etapa e WHERE e.descripcion = :descripcion"),@NamedQuery(name="Etapa.findByCodigo",query="SELECT e FROM Etapa e WHERE e.codigo = :codigo"),@NamedQuery(name="Etapa.findByEstado",query="SELECT e FROM Etapa e WHERE e.estado = :estado")})
public class Etapa implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ETAPA_SEQ")
	//@SequenceGenerator(name="ETAPA_SEQ",sequenceName="ETAPA_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idetapa")
	private Integer idetapa;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="codigo")
	private String codigo;
	@Basic(optional=false)
	@Column(name="estado")
	private char estado;
	@Column(name="duracion")
	private Integer duracion;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="etapa")
	private List<Expedientestor> expedientestorList;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="etapa")
	private List<Trazabilidadexpediente> trazabilidadexpedienteList;
	@OneToMany(mappedBy="idetapa")
	private List<Expediente> expedienteList;

        
	@JoinColumn(name="idproceso",referencedColumnName="idproceso")
	@ManyToOne(cascade=CascadeType.REFRESH,optional=false)
	private Proceso proceso;
        
	@Column(name="orden")
	private Integer orden;

	public Etapa(){
	}

	public Etapa(Integer idetapa){
		this.idetapa=idetapa;
	}

	public Etapa(Integer idetapa,char estado){
		this.idetapa=idetapa;
		this.estado=estado;
	}

	public Integer getIdetapa(){
		return idetapa;
	}

	public void setIdetapa(Integer idetapa){
		this.idetapa=idetapa;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo=codigo;
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

	public Integer getDuracion(){
		return duracion;
	}

	public void setDuracion(Integer duracion){
		this.duracion=duracion;
	}

	public List<Expedientestor> getExpedientestorList(){
		return expedientestorList;
	}

	public void setExpedientestorList(List<Expedientestor> expedientestorList){
		this.expedientestorList=expedientestorList;
	}

	public List<Trazabilidadexpediente> getTrazabilidadexpedienteList(){
		return trazabilidadexpedienteList;
	}

	public void setTrazabilidadexpedienteList(List<Trazabilidadexpediente> trazabilidadexpedienteList){
		this.trazabilidadexpedienteList=trazabilidadexpedienteList;
	}

	public List<Expediente> getExpedienteList(){
		return expedienteList;
	}

	public void setExpedienteList(List<Expediente> expedienteList){
		this.expedienteList=expedienteList;
	}

        
	public Proceso getProceso(){
		return proceso;
	}

	public void setProceso(Proceso proceso){
		this.proceso=proceso;
	}
   
	public Integer getOrden(){
		return orden;
	}

	public void setOrden(Integer orden){
		this.orden=orden;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idetapa != null ? idetapa.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Etapa)){
			return false;
		}
		Etapa other=(Etapa) object;
		if((this.idetapa == null && other.idetapa != null) || (this.idetapa != null && !this.idetapa.equals(other.idetapa))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Etapa[idetapa=" + idetapa + "]";
	}
}
