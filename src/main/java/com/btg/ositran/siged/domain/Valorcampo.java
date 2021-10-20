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
@Table(name="valorcampo")
@NamedQueries({@NamedQuery(name="Valorcampo.findAll",query="SELECT v FROM Valorcampo v"),@NamedQuery(name="Valorcampo.findByIdvalorcampo",query="SELECT v FROM Valorcampo v WHERE v.idvalorcampo = :idvalorcampo"),@NamedQuery(name="Valorcampo.findByarchivopendiente",query="SELECT v FROM Valorcampo v WHERE v.archivopendiente.idArchivoPendiente = :idarchivopendiente"),@NamedQuery(name="ValorCampo.getPorCampo",query="SELECT v FROM Valorcampo v WHERE v.campo.idCampo=:campo")})
public class Valorcampo implements Serializable{

	private static final long serialVersionUID=1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="VALORCAMPO_SEQ")
	//@SequenceGenerator(name="VALORCAMPO_SEQ",sequenceName="VALORCAMPO_SEQ",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="idvalorcampo")
	private Integer idvalorcampo;

	@Basic(optional=true)
	@Column(name="valor")
	private String valor;

	@JoinColumn(name="archivopendiente",referencedColumnName="idarchivopendiente")
	@ManyToOne(optional=false)
	private ArchivoPendiente archivopendiente;

	@JoinColumn(name="campo",referencedColumnName="idcampo")
	@ManyToOne(optional=false)
	private Campo campo;

	public Valorcampo(){
	}

	public Valorcampo(Integer idvalorcampo){
		this.idvalorcampo=idvalorcampo;
	}

	public Valorcampo(Integer idvalorcampo,String valor){
		this.idvalorcampo=idvalorcampo;
		this.valor=valor;
	}

	public Integer getIdvalorcampo(){
		return idvalorcampo;
	}

	public void setIdvalorcampo(Integer idvalorcampo){
		this.idvalorcampo=idvalorcampo;
	}

	public String getValor(){
		return valor;
	}

	public void setValor(String valor){
		this.valor=valor;
	}

	public ArchivoPendiente getArchivopendiente(){
		return archivopendiente;
	}

	public void setArchivopendiente(ArchivoPendiente archivopendiente){
		this.archivopendiente=archivopendiente;
	}

	public Campo getCampo(){
		return campo;
	}

	public void setCampo(Campo campo){
		this.campo=campo;
	}

	@Override
	public int hashCode(){
		int hash=0;
		hash+=(idvalorcampo != null ? idvalorcampo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object){
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if(!(object instanceof Valorcampo)){
			return false;
		}
		Valorcampo other=(Valorcampo) object;
		if((this.idvalorcampo == null && other.idvalorcampo != null) || (this.idvalorcampo != null && !this.idvalorcampo.equals(other.idvalorcampo))){
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "org.ositran.pojos.Valorcampo[idvalorcampo=" + idvalorcampo + "]";
	}
}
