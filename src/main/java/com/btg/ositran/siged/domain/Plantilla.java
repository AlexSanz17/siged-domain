package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="plantilla")
@NamedQueries({@NamedQuery(name="Plantilla.findAll",query="SELECT p FROM Plantilla p WHERE p.estado = 'A'"),@NamedQuery(name="Plantilla.findByIdplantilla",query="SELECT p FROM Plantilla p WHERE p.idplantilla = :idplantilla"),@NamedQuery(name="Plantilla.findByTipo",query="SELECT p FROM Plantilla p WHERE p.tipo = :tipo"),@NamedQuery(name="Plantilla.findByDescripcion",query="SELECT p FROM Plantilla p WHERE p.descripcion = :descripcion"),@NamedQuery(name="Plantilla.listCamposByTipoPlantilla",query="SELECT c FROM Plantilla p , Campo c WHERE p.idplantilla = c.plantilla.idplantilla AND p.tipo = :tipoPlantilla AND c.estado = 'A'")
// @NamedQuery(name = "Plantilla.listSeccionesByTipoPlantilla", query =
// "SELECT c FROM Plantilla p WHERE p.idplantilla = c.plantilla.idplantilla AND p.tipo = :tipoPlantilla")
})
public class Plantilla implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PLANTILLA_SEQ")
	@SequenceGenerator(name="PLANTILLA_SEQ",sequenceName="PLANTILLA_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idplantilla")
	private Integer idplantilla;
	@Basic(optional=false)
	@Column(name="tipo")
	private Integer tipo;
	@Column(name="descripcion")
	private String descripcion;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="plantilla")
	private List<ArchivoPendiente> archivopendienteList;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="plantilla")
	private List<Campo> campoList;

	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;

	@Column(name="estado")
	private Character estado;

	private transient String campos;

	public Plantilla(){
	}

	public Plantilla(Integer idplantilla){
		this.idplantilla=idplantilla;
	}

	public Plantilla(Integer idplantilla,Integer tipo){
		this.idplantilla=idplantilla;
		this.tipo=tipo;
	}

	public Integer getIdplantilla(){
		return idplantilla;
	}

	public void setIdplantilla(Integer idplantilla){
		this.idplantilla=idplantilla;
	}

	public Integer getTipo(){
		return tipo;
	}

	public void setTipo(Integer tipo){
		this.tipo=tipo;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public List<ArchivoPendiente> getArchivopendienteList(){
		return archivopendienteList;
	}

	public void setArchivopendienteList(List<ArchivoPendiente> archivopendienteList){
		this.archivopendienteList=archivopendienteList;
	}

	public List<Campo> getCampoList(){
		return campoList;
	}

	public void setCampoList(List<Campo> campoList){
		this.campoList=campoList;
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

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idplantilla != null ? idplantilla.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Plantilla)){
			return false;
		}
		Plantilla other=(Plantilla) object;
		if((this.idplantilla == null && other.idplantilla != null) || (this.idplantilla != null && !this.idplantilla.equals(other.idplantilla))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Plantilla[idplantilla=" + idplantilla + "]";
	}

	@Transient
	public String getCampos(){
		return campos;
	}

	@Transient
	public void setCampos(String campos){
		this.campos=campos;
	}
}
