package com.btg.ositran.siged.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="submotivo")
@NamedQueries({@NamedQuery(name="Submotivo.findAll",query="SELECT s FROM Submotivo s"),@NamedQuery(name="Submotivo.findByIdsubmotivo",query="SELECT s FROM Submotivo s WHERE s.idsubmotivo = :idsubmotivo"),@NamedQuery(name="Submotivo.findByDescripcion",query="SELECT s FROM Submotivo s WHERE s.descripcion = :descripcion"),@NamedQuery(name="Submotivo.findByEstado",query="SELECT s FROM Submotivo s WHERE s.estado = :estado"),@NamedQuery(name="Submotivo.findByMotivo",query="SELECT s FROM Submotivo s WHERE s.motivo.idmotivo = :idmotivo")})
public class Submotivo implements Serializable{

	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SUBMOTIVO_SEQ")
	//@SequenceGenerator(name="SUBMOTIVO_SEQ",sequenceName="SUBMOTIVO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idsubmotivo")
	private Integer idsubmotivo;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="estado")
	private String estado;
	@ManyToMany(mappedBy="submotivos")
	private List<DocumentoStor> documentostorList;
	@JoinColumn(name="motivo",referencedColumnName="idmotivo")
	@ManyToOne(optional=false)
	private Motivo motivo;

	public Submotivo(){
	}

	public Submotivo(Integer idsubmotivo){
		this.idsubmotivo=idsubmotivo;
	}

	public Integer getIdsubmotivo(){
		return idsubmotivo;
	}

	public void setIdsubmotivo(Integer idsubmotivo){
		this.idsubmotivo=idsubmotivo;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}

	public String getEstado(){
		return estado;
	}

	public void setEstado(String estado){
		this.estado=estado;
	}

	public List<DocumentoStor> getDocumentostorList(){
		return documentostorList;
	}

	public void setDocumentostorList(List<DocumentoStor> documentostorList){
		this.documentostorList=documentostorList;
	}

	public Motivo getMotivo(){
		return motivo;
	}

	public void setMotivo(Motivo motivo){
		this.motivo=motivo;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idsubmotivo != null ? idsubmotivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Submotivo)){
			return false;
		}
		Submotivo other=(Submotivo) object;
		if((this.idsubmotivo == null && other.idsubmotivo != null) || (this.idsubmotivo != null && !this.idsubmotivo.equals(other.idsubmotivo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "[" + this.descripcion + "]";
	}
}
