package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="carpeta")
@NamedQueries({@NamedQuery(name="Carpeta.findAll",query="SELECT c FROM Carpeta c"),@NamedQuery(name="Carpeta.findByIdcarpeta",query="SELECT c FROM Carpeta c WHERE c.idcarpeta = :idcarpeta"),@NamedQuery(name="Carpeta.findByIdDocumento",query="SELECT c FROM Carpeta c , Documento d " + " WHERE c.idcarpeta.idexpediente.id = d.expediente.id " + " and d.idDocumento = :idDocumento "),@NamedQuery(name="Carpeta.findByNombre",query="SELECT c FROM Carpeta c WHERE c.nombre = :nombre"),@NamedQuery(name="Carpeta.findByFechacreacion",query="SELECT c FROM Carpeta c WHERE c.fechacreacion = :fechacreacion")})
public class Carpeta implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CARPETA_SEQ")
	@SequenceGenerator(name="CARPETA_SEQ",sequenceName="CARPETA_SEQ",initialValue=1,allocationSize=1)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idcarpeta")
	private Integer idcarpeta;
	@Basic(optional=false)
	@Column(name="nombre")
	private String nombre;
	@Basic(optional=false)
	@Column(name="fechacreacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacion;
	@OneToMany(mappedBy="carpetapadre")
	private List<Carpeta> carpetaList;
	@JoinColumn(name="carpetapadre",referencedColumnName="idcarpeta")
	@ManyToOne
	private Carpeta carpetapadre;
	@JoinColumn(name="idexpediente",referencedColumnName="idexpediente")
	@ManyToOne
	private Expediente idexpediente;
	/*
	 * @OneToMany(mappedBy = "idcarpeta") private List<Documento> documentoList;
	 */
	private transient String vacio;

	public Carpeta(){
	}

	public Carpeta(Integer idcarpeta){
		this.idcarpeta=idcarpeta;
	}

	public Carpeta(Integer idcarpeta,String nombre,Date fechacreacion){
		this.idcarpeta=idcarpeta;
		this.nombre=nombre;
		this.fechacreacion=fechacreacion;
	}

	public Integer getIdcarpeta(){
		return idcarpeta;
	}

	public void setIdcarpeta(Integer idcarpeta){
		this.idcarpeta=idcarpeta;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public Date getFechacreacion(){
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion){
		this.fechacreacion=fechacreacion;
	}

	public List<Carpeta> getCarpetaList(){
		return carpetaList;
	}

	public void setCarpetaList(List<Carpeta> carpetaList){
		this.carpetaList=carpetaList;
	}

	public Carpeta getCarpetapadre(){
		return carpetapadre;
	}

	public void setCarpetapadre(Carpeta carpetapadre){
		this.carpetapadre=carpetapadre;
	}

	public Expediente getIdexpediente(){
		return idexpediente;
	}

	public void setIdexpediente(Expediente idexpediente){
		this.idexpediente=idexpediente;
	}

	/*
	 * public List<Documento> getDocumentoList() { return documentoList; }
	 * 
	 * public void setDocumentoList(List<Documento> documentoList) {
	 * this.documentoList = documentoList; }
	 */

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idcarpeta != null ? idcarpeta.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Carpeta)){
			return false;
		}
		Carpeta other=(Carpeta) object;
		if((this.idcarpeta == null && other.idcarpeta != null) || (this.idcarpeta != null && !this.idcarpeta.equals(other.idcarpeta))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Carpeta[carpeta=" + this.nombre + "]";
	}

	@Transient
	public String getVacio(){
		int cuenta=0;
		if(carpetaList != null){
			cuenta+=carpetaList.size();
		}
		/*
		 * if (documentoList != null) { cuenta += documentoList.size(); }
		 */
		if(cuenta == 0){
			vacio="S";
		}
		else{

			vacio="N";
		}
		return vacio;
	}

	@Transient
	public void setVacio(String vacio){
		this.vacio=vacio;
	}
}
