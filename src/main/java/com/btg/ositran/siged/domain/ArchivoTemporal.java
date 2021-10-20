package com.btg.ositran.siged.domain;

import java.io.Serializable;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="archivotemporal")
@NamedQueries({@NamedQuery(name="Archivotemporal.findByIdarchivopendiente",query="SELECT a FROM ArchivoTemporal a WHERE a.archivoPendiente.idArchivoPendiente = :idarchivopendiente")})
public class ArchivoTemporal implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ARCHIVOTEMPORAL_SEQ")
	//@SequenceGenerator(name="ARCHIVOTEMPORAL_SEQ",sequenceName="ARCHIVOTEMPORAL_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idarchivotemporal")
	private Integer idArchivoTemporal;

	@Basic(optional=false)
	private String ruta;

	@JoinColumn(name="idarchivopendiente",referencedColumnName="idarchivopendiente")
	@ManyToOne(optional=false)
	private ArchivoPendiente archivoPendiente;

	public ArchivoTemporal(){
	}

	public ArchivoTemporal(Integer idarchivotemporal){
		this.idArchivoTemporal=idarchivotemporal;
	}

	public ArchivoTemporal(Integer idarchivotemporal,String ruta){
		this.idArchivoTemporal=idarchivotemporal;
		this.ruta=ruta;
	}

	public Integer getIdArchivoTemporal(){
		return idArchivoTemporal;
	}

	public void setIdArchivoTemporal(Integer idArchivoTemporal){
		this.idArchivoTemporal=idArchivoTemporal;
	}

	public String getRuta(){
		return ruta;
	}

	public void setRuta(String ruta){
		this.ruta=ruta;
	}

	public ArchivoPendiente getArchivoPendiente(){
		return archivoPendiente;
	}

	public void setArchivoPendiente(ArchivoPendiente archivoPendiente){
		this.archivoPendiente=archivoPendiente;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idArchivoTemporal != null ? idArchivoTemporal.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		if(!(object instanceof ArchivoTemporal)){
			return false;
		}
		ArchivoTemporal other=(ArchivoTemporal) object;
		if((this.idArchivoTemporal == null && other.idArchivoTemporal != null) || (this.idArchivoTemporal != null && !this.idArchivoTemporal.equals(other.idArchivoTemporal))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Archivotemporal[idarchivotemporal=" + idArchivoTemporal + "]";
	}
}
